package com.github.jing332.tts_server_android.compose.nav.systts.edit

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.HelpOutline
import androidx.compose.material.icons.filled.SmartDisplay
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.github.jing332.tts_server_android.R
import com.github.jing332.tts_server_android.compose.nav.systts.edit.ui.SaveActionHandler
import com.github.jing332.tts_server_android.compose.widgets.AppDialog
import com.github.jing332.tts_server_android.compose.widgets.ExposedDropTextField
import com.github.jing332.tts_server_android.compose.widgets.RowToggleButtonGroup
import com.github.jing332.tts_server_android.constant.AppConst
import com.github.jing332.tts_server_android.constant.SpeechTarget
import com.github.jing332.tts_server_android.data.appDb
import com.github.jing332.tts_server_android.data.entities.AbstractListGroup.Companion.DEFAULT_GROUP_ID
import com.github.jing332.tts_server_android.data.entities.SpeechRule
import com.github.jing332.tts_server_android.data.entities.systts.SystemTts
import com.github.jing332.tts_server_android.data.entities.systts.SystemTtsGroup
import com.github.jing332.tts_server_android.model.rhino.speech_rule.SpeechRuleEngine
import com.github.jing332.tts_server_android.model.speech.tts.ITextToSpeechEngine
import com.github.jing332.tts_server_android.ui.view.AppDialogs.displayErrorDialog
import com.github.jing332.tts_server_android.utils.clone

@Composable
fun BasicInfoEditScreen(
    modifier: Modifier,
    systts: SystemTts,
    onSysttsChange: (SystemTts) -> Unit,

    showSpeechTarget: Boolean = true,
    group: SystemTtsGroup = rememberUpdatedState(
        newValue = appDb.systemTtsDao.getGroup(systts.groupId)
            ?: SystemTtsGroup(id = DEFAULT_GROUP_ID, name = "")
    ).value,
    groups: List<SystemTtsGroup> = remember { appDb.systemTtsDao.allGroup },

    speechRules: List<SpeechRule> = remember { appDb.speechRule.allEnabled },
) {
    val context = LocalContext.current
    val speechRule by rememberUpdatedState(newValue = speechRules.find { it.ruleId == systts.speechRule.tagRuleId })

    // 确保在 SaveActionHandler 中始终引用最新的obj
    @Suppress("NAME_SHADOWING")
    val systts by rememberUpdatedState(newValue = systts)

    SaveActionHandler {
        var tagName = ""
        if (speechRule != null) {
            runCatching {
                val engine = SpeechRuleEngine(context, speechRule!!)
                engine.eval()
                try {
                    tagName = engine.getTagName(systts.speechRule.tag, systts.speechRule.tagData)
                } catch (_: NoSuchMethodException) {
                }
            }.onFailure {
                context.displayErrorDialog(it, "获取标签名失败")
            }
        }

        tagName = tagName.ifBlank {
            speechRule?.tags?.getOrDefault(systts.speechRule.tag, "") ?: ""
        }
        onSysttsChange(
            systts.copy(
                speechRule = systts.speechRule.copy(tagName = tagName)
            )
        )

        true
    }

    var showStandbyHelpDialog by remember { mutableStateOf(false) }
    if (showStandbyHelpDialog)
        AppDialog(
            title = { Text(stringResource(id = R.string.systts_as_standby_help)) },
            content = {
                Text(
                    stringResource(id = R.string.systts_standby_help_msg)
                )
            },
            buttons = {
                TextButton(onClick = { showStandbyHelpDialog = false }) {
                    Text(stringResource(id = R.string.confirm))
                }
            }
        ) { showStandbyHelpDialog = false }

    var showParamsDialog by remember { mutableStateOf(false) }
    if (showParamsDialog)
        AudioParamsDialog(
            onDismissRequest = { showParamsDialog = false },
            params = systts.tts.audioParams,
            onParamsChange = {
                onSysttsChange(
                    systts.copy(
                        tts = systts.tts.clone<ITextToSpeechEngine>()!!.apply {
                            audioParams = it
                        })
                )
            }
        )

    Column(modifier) {
        if (showSpeechTarget)
            Column(Modifier.fillMaxWidth()) {
                Row(
                    Modifier
                        .align(Alignment.CenterHorizontally)
                        .horizontalScroll(rememberScrollState())
                ) {
                    TextButton(onClick = { showParamsDialog = true }) {
                        Row {
                            Icon(Icons.Default.Speed, null)
                            Text(stringResource(id = R.string.audio_params))
                        }
                    }

                    TextButton(onClick = { }) {
                        Row {
                            Icon(Icons.Default.SmartDisplay, null)
                            Text(stringResource(id = R.string.internal_player))
                        }
                    }

                    Row(
                        Modifier
                            .minimumInteractiveComponentSize()
                            .clip(MaterialTheme.shapes.medium)
                            .clickable(role = Role.Checkbox) {
                                onSysttsChange(
                                    systts.copy(
                                        speechRule = systts.speechRule.copy(
                                            isStandby = !systts.speechRule.isStandby
                                        )
                                    )
                                )
                            },
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Checkbox(checked = systts.speechRule.isStandby, onCheckedChange = null)
                        Text(stringResource(id = R.string.as_standby))
                        IconButton(onClick = { showStandbyHelpDialog = true }) {
                            Icon(
                                Icons.Default.HelpOutline,
                                stringResource(id = R.string.systts_as_standby_help)
                            )
                        }
                    }
                }

                RowToggleButtonGroup(
                    modifier = Modifier
                        .wrapContentWidth()
                        .align(Alignment.CenterHorizontally),
                    primarySelection = if (systts.speechRule.target == SpeechTarget.ALL) 0 else 1,
                    buttonCount = 2,
                    buttonIcons = arrayOf(
                        painterResource(id = R.drawable.ic_baseline_select_all_24),
                        painterResource(id = R.drawable.baseline_tag_24)
                    ),
                    buttonTexts = arrayOf(
                        stringResource(id = R.string.ra_all),
                        stringResource(id = R.string.tag)
                    ),
                    onButtonClick = {
                        onSysttsChange(
                            systts.copy(
                                speechRule = systts.speechRule.copy(
                                    target = if (it == 0) SpeechTarget.ALL else SpeechTarget.CUSTOM_TAG
                                )
                            )
                        )
                    },
                )

                AnimatedVisibility(visible = systts.speechRule.target == SpeechTarget.CUSTOM_TAG) {
                    Row(Modifier.padding(top = 4.dp)) {
                        ExposedDropTextField(
                            modifier = Modifier
                                .weight(1f)
                                .padding(end = 4.dp),
                            label = { Text(stringResource(id = R.string.speech_rule_script)) },
                            key = systts.speechRule.tagRuleId,
                            keys = speechRules.map { it.ruleId },
                            values = speechRules.map { it.name },
                            onSelectedChange = { k, v ->
                                onSysttsChange(
                                    systts.copy(
                                        speechRule = systts.speechRule.copy(
                                            tagRuleId = k as String
                                        )
                                    )
                                )
                            }
                        )

                        speechRule?.let { speechRule ->
                            ExposedDropTextField(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(start = 4.dp),
                                label = { Text(stringResource(id = R.string.tag)) },
                                key = systts.speechRule.tag,
                                keys = speechRule.tags.keys.toList(),
                                values = speechRule.tags.values.toList(),
                                onSelectedChange = { k, _ ->
                                    onSysttsChange(
                                        systts.copy(
                                            speechRule = systts.speechRule.copy(tag = k as String)
                                        )
                                    )
                                }
                            )
                        }
                    }
                }

                speechRule?.let {
                    CustomTagScreen(
                        systts = systts,
                        onSysttsChange = onSysttsChange,
                        speechRule = it
                    )
                }
            }

        ExposedDropTextField(
            modifier = Modifier.fillMaxWidth(),
            label = { Text(stringResource(id = R.string.group)) },
            key = group,
            keys = groups,
            onKeySame = { current, new -> (current as SystemTtsGroup).id == (new as SystemTtsGroup).id },
            values = groups.map { it.name },
            onSelectedChange = { k, _ ->
                onSysttsChange(systts.copy(groupId = (k as SystemTtsGroup).id))
            }
        )
        OutlinedTextField(
            label = { Text(stringResource(id = R.string.display_name)) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            value = systts.displayName ?: "", onValueChange = {
                onSysttsChange(systts.copy(displayName = it))
            }
        )
    }
}

@Composable
private fun CustomTagScreen(
    systts: SystemTts,
    onSysttsChange: (SystemTts) -> Unit,
    speechRule: SpeechRule
) {
    var showHelpDialog by remember { mutableStateOf("" to "") }
    if (showHelpDialog.first.isNotEmpty()) {
        AppDialog(title = { Text(showHelpDialog!!.first) }, content = {
            Text(showHelpDialog.second)
        }, buttons = {
            TextButton(onClick = { showHelpDialog = "" to "" }) {
                Text(stringResource(id = R.string.confirm))
            }
        }) { showHelpDialog = "" to "" }
    }

    Column(Modifier.padding(vertical = 4.dp)) {
        speechRule.tagsData[systts.speechRule.tag]?.forEach { defTag ->
            val key = defTag.key
            val label = defTag.value["label"] ?: ""
            val hint = defTag.value["hint"] ?: ""

            val items = defTag.value["items"]
            val value by rememberUpdatedState(newValue = systts.speechRule.tagData[key] ?: "")
            if (items.isNullOrEmpty()) {
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp),
                    leadingIcon = {
                        if (hint.isNotEmpty())
                            IconButton(onClick = { showHelpDialog = label to hint }) {
                                Icon(Icons.Default.HelpOutline, stringResource(id = R.string.help))
                            }
                    },
                    label = { Text(label) },
                    value = value,
                    onValueChange = {
                        onSysttsChange(
                            systts.copy(
                                speechRule = systts.speechRule.copy(
                                    tagData = systts.speechRule.tagData.toMutableMap().apply {
                                        this[key] = it
                                    }
                                )
                            )
                        )
                    }
                )
            } else {
                val itemsMap by rememberUpdatedState(
                    newValue = AppConst.jsonBuilder.decodeFromString<Map<String, String>>(items)
                )

                val defaultValue = remember { defTag.value["default"] ?: "" }
                ExposedDropTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp),
                    label = { Text(label) },
                    key = value.ifEmpty { defaultValue },
                    keys = itemsMap.keys.toList(),
                    values = itemsMap.values.toList(),
                    leadingIcon = {
                        if (hint.isNotEmpty())
                            IconButton(onClick = { showHelpDialog = label to hint }) {
                                Icon(Icons.Default.HelpOutline, stringResource(id = R.string.help))
                            }
                    },
                    onSelectedChange = { k, _ ->
                        onSysttsChange(
                            systts.copy(
                                speechRule = systts.speechRule.copy(
                                    tagData = systts.speechRule.mutableTagData.apply {
                                        this[key] = k as String
                                    }
                                )
                            )
                        )
                    }
                )

            }

        }
    }
}