package com.github.jing332.tts_server_android.model.tts

import android.content.Context
import android.view.View
import androidx.annotation.Keep
import androidx.fragment.app.FragmentActivity
import com.github.jing332.tts_server_android.R
import com.github.jing332.tts_server_android.data.appDb
import com.github.jing332.tts_server_android.data.entities.plugin.Plugin
import com.github.jing332.tts_server_android.data.entities.systts.SpeechRuleInfo
import com.github.jing332.tts_server_android.data.entities.systts.SystemTts
import com.github.jing332.tts_server_android.databinding.SysttsPluginEditBottomSheetBinding
import com.github.jing332.tts_server_android.model.rhino.tts.TtsPluginEngine
import com.github.jing332.tts_server_android.ui.systts.edit.BaseParamsEditView
import com.github.jing332.tts_server_android.ui.systts.edit.plugin.PluginTtsEditActivity
import com.github.jing332.tts_server_android.ui.systts.edit.plugin.PluginTtsParamsEditView
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Transient

@Keep
@Parcelize
@kotlinx.serialization.Serializable
@SerialName("plugin")
data class PluginTTS(
    val pluginId: String = "",
    var locale: String = "",
    var voice: String = "",
    // 插件附加数据
    var data: MutableMap<String, String> = mutableMapOf(),

    override var pitch: Int = 50,
    override var volume: Int = 50,
    override var rate: Int = 50,

    override var audioFormat: BaseAudioFormat = BaseAudioFormat(),
    override var audioPlayer: PlayerParams = PlayerParams(),
    @Transient
    override var speechRule: SpeechRuleInfo = SpeechRuleInfo(),
    @Transient
    var plugin: Plugin? = null,
) : ITextToSpeechEngine() {
    init {
        if (pluginId.isNotEmpty())
            plugin = appDb.pluginDao.getByPluginId(pluginId)
    }

    val requirePlugin: Plugin
        get() {
            plugin?.let { return it }
            throw Exception(context.getString(R.string.not_found_plugin, pluginId))
        }


    override fun getDescription(): String {
        return "$voice <br>${super.getDescription()}"
    }

    override fun getEditActivity() = PluginTtsEditActivity::class.java

    override fun getType(): String {
        return try {
            requirePlugin.name
        } catch (e: Exception) {
            e.message ?: e.cause?.message
        }.toString()
    }

    override fun getParamsEditView(context: Context) = PluginTtsParamsEditView(context) to false

    @IgnoredOnParcel
    @Transient
    lateinit var pluginEngine: TtsPluginEngine

    companion object {
        private val ttsEngines: MutableMap<String, TtsPluginEngine> = mutableMapOf()
    }

    override fun onLoad() {
        if (!this::pluginEngine.isInitialized) {
            pluginEngine = ttsEngines[pluginId] ?: TtsPluginEngine(
                pluginTTS = this, context = context
            ).also { ttsEngines[pluginId] = it }
        }
        pluginEngine.onLoad()
    }

    override fun onStop() {
        pluginEngine.onStop()
    }

    override suspend fun getAudio(speakText: String, rate: Int, pitch: Int): ByteArray? {
        return pluginEngine.getAudio(
            speakText,
            rate,
            pitch
        )
    }
}