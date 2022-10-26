package com.github.jing332.tts_server_android.constant

object CnLocalMap {

    fun getLanguage(key: String): String {
        return languageMapMap[key] ?: key
    }

    fun getStyleAndRole(key: String): String {
        return styleAndRole[key] ?: key
    }

    fun getEdgeVoice(key:String):String{
        return edgeVoice[key] ?:key
    }

    private val languageMapMap = mapOf(
        "af-ZA" to "南非荷兰语（南非）",
        "am-ET" to "阿姆哈拉语（埃塞俄比亚)",
        "ar-AE" to "阿拉伯语（阿拉伯联合酋长国）",
        "ar-BH" to "阿拉伯语（巴林）",
        "ar-DZ" to "阿拉伯语（阿尔及利亚）",
        "ar-EG" to "阿拉伯语（埃及）",
        "ar-IL" to "阿拉伯语（以色列）",
        "ar-IQ" to "阿拉伯语（伊拉克）",
        "ar-JO" to "阿拉伯语（约旦）",
        "ar-KW" to "阿拉伯语（科威特）",
        "ar-LB" to "阿拉伯语（黎巴嫩）",
        "ar-LY" to "阿拉伯语（利比亚）",
        "ar-MA" to "阿拉伯语（摩洛哥）",
        "ar-OM" to "阿拉伯语（阿曼）",
        "ar-PS" to "阿拉伯语（巴勒斯坦占领区)",
        "ar-QA" to "阿拉伯语（卡塔尔）",
        "ar-SA" to "阿拉伯语（沙特阿拉伯)",
        "ar-SY" to "阿拉伯语（叙利亚）",
        "ar-TN" to "阿拉伯语（突尼斯）",
        "ar-YE" to "阿拉伯语（也门）",
        "az-AZ" to "阿塞拜疆语（阿塞拜疆）",
        "bg-BG" to "保加利亚语（保加利亚)",
        "bn-BD" to "孟加拉语（孟加拉国）",
        "bn-IN" to "孟加拉语（印度）",
        "bs-BA" to "波斯尼亚语（波斯尼亚)",
        "ca-ES" to "加泰罗尼亚语（西班牙)",
        "cs-CZ" to "捷克语（捷克）",
        "cy-GB" to "威尔士语（英国）",
        "da-DK" to "丹麦语（丹麦）",
        "de-AT" to "德语（奥地利）",
        "de-CH" to "德语（瑞士）",
        "de-DE" to "德语（德国）",
        "el-GR" to "希腊语（希腊)",
        "en-AU" to "英语（澳大利亚）",
        "en-CA" to "英语（加拿大）",
        "en-GB" to "英语（英国）",
        "en-GH" to "英语（加纳）",
        "en-HK" to "英语（香港特别行政区）",
        "en-IE" to "英语（爱尔兰）",
        "en-IN" to "英语（印度）",
        "en-KE" to "英语（肯尼亚）",
        "en-NG" to "英语（尼日利亚）",
        "en-NZ" to "英语（新西兰）",
        "en-PH" to "英语（菲律宾）",
        "en-SG" to "英语（新加坡）",
        "en-TZ" to "英语（坦桑尼亚）",
        "en-US" to "英语（美国）",
        "en-ZA" to "英语（南非）",
        "es-AR" to "西班牙语（阿根廷）",
        "es-BO" to "西班牙语（玻利维亚）",
        "es-CL" to "西班牙语（智利）",
        "es-CO" to "西班牙语（哥伦比亚）",
        "es-CR" to "西班牙语（哥斯达黎加）",
        "es-CU" to "西班牙语（古巴）",
        "es-DO" to "西班牙语（多米尼加共和国）",
        "es-EC" to "西班牙语（厄瓜多尔）",
        "es-ES" to "西班牙语 （西班牙)",
        "es-GQ" to "西班牙语（赤道几内亚）",
        "es-GT" to "西班牙语（危地马拉）",
        "es-HN" to "西班牙语（洪都拉斯）",
        "es-MX" to "西班牙语（墨西哥）",
        "es-NI" to "西班牙（尼加拉瓜）",
        "es-PA" to "西班牙语（巴拿马）",
        "es-PE" to "西班牙语（秘鲁）",
        "es-PR" to "西班牙语（波多黎各）",
        "es-PY" to "西班牙语（巴拉圭）",
        "es-SV" to "西班牙语（萨尔瓦多）",
        "es-US" to "西班牙语（美国）",
        "es-UY" to "西班牙语（乌拉圭）",
        "es-VE" to "西班牙语（委内瑞拉）",
        "et-EE" to "爱沙尼亚语（爱沙尼亚)",
        "eu-ES" to "巴斯克语",
        "fa-IR" to "波斯语（伊朗）",
        "fi-FI" to "芬兰语（芬兰）",
        "fil-PH" to "菲律宾语（菲律宾）",
        "fr-BE" to "法语（比利时）",
        "fr-CA" to "法语（加拿大）",
        "fr-CH" to "法语（瑞士）",
        "fr-FR" to "法语（法国）",
        "ga-IE" to "爱尔兰语（爱尔兰）",
        "gl-ES" to "加利西亚语",
        "gu-IN" to "古吉拉特语（印度）",
        "he-IL" to "希伯来语（以色列）",
        "hi-IN" to "印地语（印度）",
        "hr-HR" to "克罗地亚语（克罗地亚）",
        "hu-HU" to "匈牙利语（匈牙利)",
        "hy-AM" to "亚美尼亚语（亚美尼亚）",
        "id-ID" to "印度尼西亚语（印度尼西亚)",
        "is-IS" to "冰岛语（冰岛)",
        "it-CH" to "意大利语（瑞士）",
        "it-IT" to "意大利语（意大利）",
        "ja-JP" to "日语（日本）",
        "jv-ID" to "爪哇语（印度尼西亚）",
        "ka-GE" to "格鲁吉亚语（格鲁吉亚）",
        "kk-KZ" to "哈萨克语（哈萨克斯坦）",
        "km-KH" to "高棉语（柬埔寨)",
        "kn-IN" to "卡纳达语（印度）",
        "ko-KR" to "韩语（韩国)",
        "lo-LA" to "老挝语（老挝)",
        "lt-LT" to "立陶宛语（立陶宛)",
        "lv-LV" to "拉脱维亚语（拉脱维亚)",
        "mk-MK" to "马其顿语（北马其顿共和国）",
        "ml-IN" to "马拉雅拉姆语（印度）",
        "mn-MN" to "蒙古语（蒙古）",
        "mr-IN" to "马拉地语（印度）",
        "ms-MY" to "马来语（马来西亚）",
        "mt-MT" to "马耳他语（马耳他）",
        "my-MM" to "缅甸语（缅甸)",
        "nb-NO" to "挪威语（博克马尔语，挪威）",
        "ne-NP" to "尼泊尔语（尼泊尔）",
        "nl-BE" to "荷兰语（比利时）",
        "nl-NL" to "荷兰语（荷兰）",
        "pl-PL" to "波兰语（波兰）",
        "ps-AF" to "普什图语（阿富汗）",
        "pt-BR" to "葡萄牙语（巴西）",
        "pt-PT" to "葡萄牙语（葡萄牙)",
        "ro-RO" to "罗马尼亚语（罗马尼亚）",
        "ru-RU" to "俄语（俄罗斯）",
        "si-LK" to "僧伽罗语（斯里兰卡)",
        "sk-SK" to "斯洛伐克语（斯洛伐克）",
        "sl-SI" to "斯洛文尼亚语（斯洛文尼亚)",
        "so-SO" to "索马里语（索马里）",
        "sq-AL" to "阿尔巴尼亚语（阿尔巴尼亚）",
        "sr-RS" to "塞尔维亚语（塞尔维亚）",
        "su-ID" to "巽他语（印度尼西亚）",
        "sv-SE" to "瑞典语（瑞典）",
        "sw-KE" to "斯瓦希里语（肯尼亚）",
        "sw-TZ" to "斯瓦希里语（坦桑尼亚）",
        "ta-IN" to "泰米尔语（印度）",
        "ta-LK" to "泰米尔语（斯里兰卡）",
        "ta-MY" to "泰米尔语（马来西亚）",
        "ta-SG" to "泰米尔语（新加坡）",
        "te-IN" to "泰卢固语（印度）",
        "th-TH" to "泰语（泰国）",
        "tr-TR" to "土耳其语（土耳其）",
        "uk-UA" to "乌克兰语（乌克兰)",
        "ur-IN" to "乌尔都语（印度）",
        "ur-PK" to "乌尔都语（巴基斯坦）",
        "uz-UZ" to "乌兹别克语（乌兹别克斯坦）",
        "vi-VN" to "越南语（越南)",
        "wuu-CN" to "吴语（中国)",
        "yue-CN" to "粤语（中国)",
        "zh-CN" to "中文（普通话，简体）",
        "zh-CN-henan" to "中文（中原官话河南，简体)河南口音",
        "zh-CN-liaoning" to "中文（东北官话，简体)辽宁口音",
        "zh-CN-shaanxi" to "中文（中原官话陕西，简体)陕西口音",
        "zh-CN-shandong" to "中文（冀鲁官话，简体)山东口音",
        "zh-CN-sichuan" to "中文（西南普通话，简体）",
        "zh-HK" to "中文（粤语，繁体）",
        "zh-TW" to "中文（台湾普通话)",
        "zu-ZA" to "祖鲁语（南非）",
    )

    private val styleAndRole = mapOf(
        "general" to "普通",
        "assistant" to "助手",
        "chat" to "闲聊",
        "customerservice" to "服侍",
        "newscast" to "新闻播报",
        "newscast-casual" to "新闻播报(冷淡)",
        "affectionate" to "温暖亲切",
        "angry" to "生气",
        "calm" to "平静",
        "cheerful" to "欢快",
        "excited" to "激动",
        "friendly" to "温和",
        "hopeful" to "期待",
        "shouting" to "喊叫",
        "terrified" to "害怕",
        "unfriendly" to "冷漠",
        "whispering" to "耳语",
        "empathetic" to "同情",
        "newscast-formal" to "新闻播报(正式)",
        "disgruntled" to "不满",
        "fearful" to "担心",
        "gentle" to "温合文雅",
        "lyrical" to "热情奔放",
        "embarrassed" to "犹豫",
        "sad" to "悲伤",
        "serious" to "严肃",
        "depressed" to "忧伤",
        "envious" to "嫉妒",
        "poetry-reading" to "诗歌朗诵",
        "Default" to "默认",
        //角色(身份) to
        "narration-professional" to "讲故事(专业)",
        "narration-casual" to "讲故事(冷淡)",
        "narration-relaxed" to "讲故事(轻松)",
        "Narration-relaxed" to "讲故事(轻松)",
        "Sports_commentary_excited" to "体育解说(激动)",
        "Sports_commentary" to "体育解说",
        "Advertisement_upbeat" to "广告推销(积极)",
        "YoungAdultFemale" to "女性青年",
        "YoungAdultMale" to "男性青年",
        "OlderAdultFemale" to "年长女性",
        "OlderAdultMale" to "年长男性",
        "SeniorFemale" to "高龄女性",
        "SeniorMale" to "高龄男性",
        "Girl" to "小女孩",
        "Boy" to "小男孩",
        "Narrator" to "旁白",
    )

    private val edgeVoice = mapOf(
        "af-ZA-AdriNeural" to "Adri",
        "af-ZA-WillemNeural" to "Willem",
        "am-ET-AmehaNeural" to "አምሀ",
        "am-ET-MekdesNeural" to "መቅደስ",
        "ar-AE-FatimaNeural" to "فاطمة",
        "ar-AE-HamdanNeural" to "حمدان",
        "ar-BH-AliNeural" to "علي",
        "ar-BH-LailaNeural" to "ليلى",
        "ar-DZ-AminaNeural" to "أمينة",
        "ar-DZ-IsmaelNeural" to "إسماعيل",
        "ar-EG-SalmaNeural" to "سلمى",
        "ar-EG-ShakirNeural" to "شاكر",
        "ar-IQ-BasselNeural" to "باسل",
        "ar-IQ-RanaNeural" to "رنا",
        "ar-JO-SanaNeural" to "سناء",
        "ar-JO-TaimNeural" to "تيم",
        "ar-KW-FahedNeural" to "فهد",
        "ar-KW-NouraNeural" to "نورا",
        "ar-LB-LaylaNeural" to "ليلى",
        "ar-LB-RamiNeural" to "رامي",
        "ar-LY-ImanNeural" to "إيمان",
        "ar-LY-OmarNeural" to "أحمد",
        "ar-MA-JamalNeural" to "جمال",
        "ar-MA-MounaNeural" to "منى",
        "ar-OM-AbdullahNeural" to "عبدالله",
        "ar-OM-AyshaNeural" to "عائشة",
        "ar-QA-AmalNeural" to "أمل",
        "ar-QA-MoazNeural" to "معاذ",
        "ar-SA-HamedNeural" to "حامد",
        "ar-SA-ZariyahNeural" to "زارية",
        "ar-SY-AmanyNeural" to "أماني",
        "ar-SY-LaithNeural" to "ليث",
        "ar-TN-HediNeural" to "هادي",
        "ar-TN-ReemNeural" to "ريم",
        "ar-YE-MaryamNeural" to "مريم",
        "ar-YE-SalehNeural" to "صالح",
        "az-AZ-BabekNeural" to "Babək",
        "az-AZ-BanuNeural" to "Banu",
        "bg-BG-BorislavNeural" to "Борислав",
        "bg-BG-KalinaNeural" to "Калина",
        "bn-BD-NabanitaNeural" to "নবনীতা",
        "bn-BD-PradeepNeural" to "প্রদ্বীপ",
        "bn-IN-BashkarNeural" to "ভাস্কর",
        "bn-IN-TanishaaNeural" to "তানিশা",
        "bs-BA-GoranNeural" to "Goran",
        "bs-BA-VesnaNeural" to "Vesna",
        "ca-ES-JoanaNeural" to "Joana",
        "ca-ES-AlbaNeural" to "Alba",
        "ca-ES-EnricNeural" to "Enric",
        "cs-CZ-An:ninNeural" to "An:nín",
        "cs-CZ-VlastaNeural" to "Vlasta",
        "cy-GB-AledNeural" to "Aled",
        "cy-GB-NiaNeural" to "Nia",
        "da-DK-ChristelNeural" to "Christel",
        "da-DK-JeppeNeural" to "Jeppe",
        "de-AT-IngridNeural" to "Ingrid",
        "de-AT-JonasNeural" to "Jonas",
        "de-CH-JanNeural" to "Jan",
        "de-CH-LeniNeural" to "Leni",
        "de-DE-KatjaNeural" to "Katja",
        "de-DE-AmalaNeural" to "Amala",
        "de-DE-BerndNeural" to "Bernd",
        "de-DE-Chris:phNeural" to "Chris:ph",
        "de-DE-ConradNeural" to "Conrad",
        "de-DE-ElkeNeural" to "Elke",
        "de-DE-GiselaNeural" to "Gisela",
        "de-DE-KasperNeural" to "Kasper",
        "de-DE-KillianNeural" to "Killian",
        "de-DE-KlarissaNeural" to "Klarissa",
        "de-DE-KlausNeural" to "Klaus",
        "de-DE-LouisaNeural" to "Louisa",
        "de-DE-MajaNeural" to "Maja",
        "de-DE-RalfNeural" to "Ralf",
        "de-DE-TanjaNeural" to "Tanja",
        "el-GR-AthinaNeural" to "Αθηνά",
        "el-GR-Nes:rasNeural" to "Νέστορας",
        "en-AU-NatashaNeural" to "Natasha",
        "en-AU-WilliamNeural" to "William",
        "en-AU-AnnetteNeural" to "Annette",
        "en-AU-CarlyNeural" to "Carly",
        "en-AU-DarrenNeural" to "Darren",
        "en-AU-DuncanNeural" to "Duncan",
        "en-AU-ElsieNeural" to "Elsie",
        "en-AU-FreyaNeural" to "Freya",
        "en-AU-JoanneNeural" to "Joanne",
        "en-AU-KenNeural" to "Ken",
        "en-AU-KimNeural" to "Kim",
        "en-AU-NeilNeural" to "Neil",
        "en-AU-TimNeural" to "Tim",
        "en-AU-TinaNeural" to "Tina",
        "en-CA-ClaraNeural" to "Clara",
        "en-CA-LiamNeural" to "Liam",
        "en-GB-LibbyNeural" to "Libby",
        "en-GB-AbbiNeural" to "Abbi",
        "en-GB-AlfieNeural" to "Alfie",
        "en-GB-BellaNeural" to "Bella",
        "en-GB-ElliotNeural" to "Elliot",
        "en-GB-EthanNeural" to "Ethan",
        "en-GB-HollieNeural" to "Hollie",
        "en-GB-MaisieNeural" to "Maisie",
        "en-GB-NoahNeural" to "Noah",
        "en-GB-OliverNeural" to "Oliver",
        "en-GB-OliviaNeural" to "Olivia",
        "en-GB-ThomasNeural" to "Thomas",
        "en-GB-RyanNeural" to "Ryan",
        "en-GB-SoniaNeural" to "Sonia",
        "en-GB-MiaNeural" to "Mia",
        "en-HK-SamNeural" to "Sam",
        "en-HK-YanNeural" to "Yan",
        "en-IE-ConnorNeural" to "Connor",
        "en-IE-EmilyNeural" to "Emily",
        "en-IN-NeerjaNeural" to "Neerja",
        "en-IN-PrabhatNeural" to "Prabhat",
        "en-KE-AsiliaNeural" to "Asilia",
        "en-KE-ChilembaNeural" to "Chilemba",
        "en-NG-AbeoNeural" to "Abeo",
        "en-NG-EzinneNeural" to "Ezinne",
        "en-NZ-MitchellNeural" to "Mitchell",
        "en-NZ-MollyNeural" to "Molly",
        "en-PH-JamesNeural" to "James",
        "en-PH-RosaNeural" to "Rosa",
        "en-SG-LunaNeural" to "Luna",
        "en-SG-WayneNeural" to "Wayne",
        "en-TZ-ElimuNeural" to "Elimu",
        "en-TZ-ImaniNeural" to "Imani",
        "en-US-JennyNeural" to "Jenny",
        "en-US-JennyMultilingualNeural" to "Jenny Multilingual",
        "en-US-GuyNeural" to "Guy",
        "en-US-AmberNeural" to "Amber",
        "en-US-AnaNeural" to "Ana",
        "en-US-AriaNeural" to "Aria",
        "en-US-AshleyNeural" to "Ashley",
        "en-US-BrandonNeural" to "Brandon",
        "en-US-Chris:pherNeural" to "Chris:pher",
        "en-US-CoraNeural" to "Cora",
        "en-US-ElizabethNeural" to "Elizabeth",
        "en-US-EricNeural" to "Eric",
        "en-US-JacobNeural" to "Jacob",
        "en-US-MichelleNeural" to "Michelle",
        "en-US-MonicaNeural" to "Monica",
        "en-US-SaraNeural" to "Sara",
        "en-US-AIGenerate1Neural" to "AIGenerate1",
        "en-US-AIGenerate2Neural" to "AIGenerate2",
        "en-US-DavisNeural" to "Davis",
        "en-US-JaneNeural" to "Jane",
        "en-US-JasonNeural" to "Jason",
        "en-US-NancyNeural" to "Nancy",
        "en-US-RogerNeural" to "Roger",
        "en-US-SteffanNeural" to "Steffan",
        "en-US-:nyNeural" to "tony",
        "en-ZA-LeahNeural" to "Leah",
        "en-ZA-LukeNeural" to "Luke",
        "es-AR-ElenaNeural" to "Elena",
        "es-AR-:masNeural" to "tomas",
        "es-BO-MarceloNeural" to "Marcelo",
        "es-BO-SofiaNeural" to "Sofia",
        "es-CL-CatalinaNeural" to "Catalina",
        "es-CL-LorenzoNeural" to "Lorenzo",
        "es-CO-GonzaloNeural" to "Gonzalo",
        "es-CO-SalomeNeural" to "Salome",
        "es-CR-JuanNeural" to "Juan",
        "es-CR-MariaNeural" to "María",
        "es-CU-BelkysNeural" to "Belkys",
        "es-CU-ManuelNeural" to "Manuel",
        "es-DO-EmilioNeural" to "Emilio",
        "es-DO-RamonaNeural" to "Ramona",
        "es-EC-AndreaNeural" to "Andrea",
        "es-EC-LuisNeural" to "Luis",
        "es-ES-ElviraNeural" to "Elvira",
        "es-ES-AbrilNeural" to "Abril",
        "es-ES-AlvaroNeural" to "Álvaro",
        "es-ES-ArnauNeural" to "Arnau",
        "es-ES-DarioNeural" to "Dario",
        "es-ES-EliasNeural" to "Elias",
        "es-ES-EstrellaNeural" to "Estrella",
        "es-ES-IreneNeural" to "Irene",
        "es-ES-LaiaNeural" to "Laia",
        "es-ES-LiaNeural" to "Lia",
        "es-ES-NilNeural" to "Nil",
        "es-ES-SaulNeural" to "Saul",
        "es-ES-TeoNeural" to "Teo",
        "es-ES-TrianaNeural" to "Triana",
        "es-ES-VeraNeural" to "Vera",
        "es-GQ-JavierNeural" to "Javier",
        "es-GQ-TeresaNeural" to "Teresa",
        "es-GT-AndresNeural" to "Andrés",
        "es-GT-MartaNeural" to "Marta",
        "es-HN-CarlosNeural" to "Carlos",
        "es-HN-KarlaNeural" to "Karla",
        "es-MX-DaliaNeural" to "Dalia",
        "es-MX-BeatrizNeural" to "Beatriz",
        "es-MX-CandelaNeural" to "Candela",
        "es-MX-CarlotaNeural" to "Carlota",
        "es-MX-CecilioNeural" to "Cecilio",
        "es-MX-GerardoNeural" to "Gerardo",
        "es-MX-JorgeNeural" to "Jorge",
        "es-MX-LarissaNeural" to "Larissa",
        "es-MX-Liber:Neural" to "Liber:",
        "es-MX-LucianoNeural" to "Luciano",
        "es-MX-MarinaNeural" to "Marina",
        "es-MX-NuriaNeural" to "Nuria",
        "es-MX-PelayoNeural" to "Pelayo",
        "es-MX-RenataNeural" to "Renata",
        "es-MX-YagoNeural" to "Yago",
        "es-NI-FedericoNeural" to "Federico",
        "es-NI-YolandaNeural" to "Yolanda",
        "es-PA-MargaritaNeural" to "Margarita",
        "es-PA-Rober:Neural" to "Rober:",
        "es-PE-AlexNeural" to "Alex",
        "es-PE-CamilaNeural" to "Camila",
        "es-PR-KarinaNeural" to "Karina",
        "es-PR-Vic:rNeural" to "Víc:r",
        "es-PY-MarioNeural" to "Mario",
        "es-PY-TaniaNeural" to "Tania",
        "es-SV-LorenaNeural" to "Lorena",
        "es-SV-RodrigoNeural" to "Rodrigo",
        "es-US-AlonsoNeural" to "Alonso",
        "es-US-PalomaNeural" to "Paloma",
        "es-UY-MateoNeural" to "Mateo",
        "es-UY-ValentinaNeural" to "Valentina",
        "es-VE-PaolaNeural" to "Paola",
        "es-VE-SebastianNeural" to "Sebastián",
        "et-EE-AnuNeural" to "Anu",
        "et-EE-KertNeural" to "Kert",
        "eu-ES-AinhoaNeural" to "Ainhoa",
        "eu-ES-AnderNeural" to "Ander",
        "fa-IR-DilaraNeural" to "دلارا",
        "fa-IR-FaridNeural" to "فرید",
        "fi-FI-SelmaNeural" to "Selma",
        "fi-FI-HarriNeural" to "Harri",
        "fi-FI-NooraNeural" to "Noora",
        "fil-PH-AngeloNeural" to "Angelo",
        "fil-PH-BlessicaNeural" to "Blessica",
        "fr-BE-CharlineNeural" to "Charline",
        "fr-BE-GerardNeural" to "Gerard",
        "fr-CA-SylvieNeural" to "Sylvie",
        "fr-CA-An:ineNeural" to "An:ine",
        "fr-CA-JeanNeural" to "Jean",
        "fr-CH-ArianeNeural" to "Ariane",
        "fr-CH-FabriceNeural" to "Fabrice",
        "fr-FR-AlainNeural" to "Alain",
        "fr-FR-BrigitteNeural" to "Brigitte",
        "fr-FR-CelesteNeural" to "Celeste",
        "fr-FR-ClaudeNeural" to "Claude",
        "fr-FR-CoralieNeural" to "Coralie",
        "fr-FR-EloiseNeural" to "Eloise",
        "fr-FR-JacquelineNeural" to "Jacqueline",
        "fr-FR-JeromeNeural" to "Jerome",
        "fr-FR-JosephineNeural" to "Josephine",
        "fr-FR-MauriceNeural" to "Maurice",
        "fr-FR-YvesNeural" to "Yves",
        "fr-FR-YvetteNeural" to "Yvette",
        "fr-FR-DeniseNeural" to "Denise",
        "fr-FR-HenriNeural" to "Henri",
        "ga-IE-ColmNeural" to "Colm",
        "ga-IE-OrlaNeural" to "Orla",
        "gl-ES-RoiNeural" to "Roi",
        "gl-ES-SabelaNeural" to "Sabela",
        "gu-IN-DhwaniNeural" to "ધ્વની",
        "gu-IN-NiranjanNeural" to "નિરંજન",
        "he-IL-AvriNeural" to "אברי",
        "he-IL-HilaNeural" to "הילה",
        "hi-IN-MadhurNeural" to "मधुर",
        "hi-IN-SwaraNeural" to "स्वरा",
        "hr-HR-GabrijelaNeural" to "Gabrijela",
        "hr-HR-SreckoNeural" to "Srećko",
        "hu-HU-NoemiNeural" to "Noémi",
        "hu-HU-TamasNeural" to "Tamás",
        "hy-AM-AnahitNeural" to "Անահիտ",
        "hy-AM-HaykNeural" to "Հայկ",
        "id-ID-ArdiNeural" to "Ardi",
        "id-ID-GadisNeural" to "Gadis",
        "is-IS-GudrunNeural" to "Guðrún",
        "is-IS-GunnarNeural" to "Gunnar",
        "it-IT-IsabellaNeural" to "Isabella",
        "it-IT-ElsaNeural" to "Elsa",
        "it-IT-BenignoNeural" to "Benigno",
        "it-IT-CalimeroNeural" to "Calimero",
        "it-IT-CataldoNeural" to "Cataldo",
        "it-IT-DiegoNeural" to "Diego",
        "it-IT-FabiolaNeural" to "Fabiola",
        "it-IT-FiammaNeural" to "Fiamma",
        "it-IT-GianniNeural" to "Gianni",
        "it-IT-ImeldaNeural" to "Imelda",
        "it-IT-IrmaNeural" to "Irma",
        "it-IT-LisandroNeural" to "Lisandro",
        "it-IT-PalmiraNeural" to "Palmira",
        "it-IT-PierinaNeural" to "Pierina",
        "it-IT-RinaldoNeural" to "Rinaldo",
        "ja-JP-NanamiNeural" to "七海",
        "ja-JP-KeitaNeural" to "圭太",
        "ja-JP-AoiNeural" to "碧衣",
        "ja-JP-DaichiNeural" to "大智",
        "ja-JP-MayuNeural" to "真夕",
        "ja-JP-NaokiNeural" to "直紀",
        "ja-JP-ShioriNeural" to "志織",
        "jv-ID-DimasNeural" to "Dimas",
        "jv-ID-SitiNeural" to "Siti",
        "ka-GE-EkaNeural" to "ეკა",
        "ka-GE-GiorgiNeural" to "გიორგი",
        "kk-KZ-AigulNeural" to "Айгүл",
        "kk-KZ-DauletNeural" to "Дәулет",
        "km-KH-PisethNeural" to "ពិសិដ្ឋ",
        "km-KH-SreymomNeural" to "ស្រីមុំ",
        "kn-IN-GaganNeural" to "ಗಗನ್",
        "kn-IN-SapnaNeural" to "ಸಪ್ನಾ",
        "ko-KR-SunHiNeural" to "선히",
        "ko-KR-InJoonNeural" to "인준",
        "ko-KR-BongJinNeural" to "봉진",
        "ko-KR-GookMinNeural" to "국민",
        "ko-KR-JiMinNeural" to "지민",
        "ko-KR-SeoHyeonNeural" to "서현",
        "ko-KR-SoonBokNeural" to "순복",
        "ko-KR-YuJinNeural" to "유진",
        "lo-LA-ChanthavongNeural" to "ຈັນທະວົງ",
        "lo-LA-KeomanyNeural" to "ແກ້ວມະນີ",
        "lt-LT-LeonasNeural" to "Leonas",
        "lt-LT-OnaNeural" to "Ona",
        "lv-LV-EveritaNeural" to "Everita",
        "lv-LV-NilsNeural" to "Nils",
        "mk-MK-AleksandarNeural" to "Александар",
        "mk-MK-MarijaNeural" to "Марија",
        "ml-IN-MidhunNeural" to "മിഥുൻ",
        "ml-IN-SobhanaNeural" to "ശോഭന",
        "mn-MN-BataaNeural" to "Батаа",
        "mn-MN-YesuiNeural" to "Есүй",
        "mr-IN-AarohiNeural" to "आरोही",
        "mr-IN-ManoharNeural" to "मनोहर",
        "ms-MY-OsmanNeural" to "Osman",
        "ms-MY-YasminNeural" to "Yasmin",
        "mt-MT-GraceNeural" to "Grace",
        "mt-MT-JosephNeural" to "Joseph",
        "my-MM-NilarNeural" to "နီလာ",
        "my-MM-ThihaNeural" to "သီဟ",
        "nb-NO-PernilleNeural" to "Pernille",
        "nb-NO-FinnNeural" to "Finn",
        "nb-NO-IselinNeural" to "Iselin",
        "ne-NP-HemkalaNeural" to "हेमकला",
        "ne-NP-SagarNeural" to "सागर",
        "nl-BE-ArnaudNeural" to "Arnaud",
        "nl-BE-DenaNeural" to "Dena",
        "nl-NL-ColetteNeural" to "Colette",
        "nl-NL-FennaNeural" to "Fenna",
        "nl-NL-MaartenNeural" to "Maarten",
        "pl-PL-AgnieszkaNeural" to "Agnieszka",
        "pl-PL-MarekNeural" to "Marek",
        "pl-PL-ZofiaNeural" to "Zofia",
        "ps-AF-GulNawazNeural" to " ګل نواز",
        "ps-AF-LatifaNeural" to "لطيفه",
        "pt-BR-FranciscaNeural" to "Francisca",
        "pt-BR-An:nioNeural" to "Antônio",
        "pt-BR-BrendaNeural" to "Brenda",
        "pt-BR-Dona:Neural" to "Dona:",
        "pt-BR-ElzaNeural" to "Elza",
        "pt-BR-FabioNeural" to "Fabio",
        "pt-BR-GiovannaNeural" to "Giovanna",
        "pt-BR-Humber:Neural" to "Humber:",
        "pt-BR-JulioNeural" to "Julio",
        "pt-BR-LeilaNeural" to "Leila",
        "pt-BR-LeticiaNeural" to "Leticia",
        "pt-BR-ManuelaNeural" to "Manuela",
        "pt-BR-NicolauNeural" to "Nicolau",
        "pt-BR-ValerioNeural" to "Valerio",
        "pt-BR-YaraNeural" to "Yara",
        "pt-PT-DuarteNeural" to "Duarte",
        "pt-PT-FernandaNeural" to "Fernanda",
        "pt-PT-RaquelNeural" to "Raquel",
        "ro-RO-AlinaNeural" to "Alina",
        "ro-RO-EmilNeural" to "Emil",
        "ru-RU-SvetlanaNeural" to "Светлана",
        "ru-RU-DariyaNeural" to "Дария",
        "ru-RU-DmitryNeural" to "Дмитрий",
        "si-LK-SameeraNeural" to "සමීර",
        "si-LK-ThiliniNeural" to "තිළිණි",
        "sk-SK-LukasNeural" to "Lukáš",
        "sk-SK-Vik:riaNeural" to "Viktória",
        "sl-SI-PetraNeural" to "Petra",
        "sl-SI-RokNeural" to "Rok",
        "so-SO-MuuseNeural" to "Muuse",
        "so-SO-UbaxNeural" to "Ubax",
        "sq-AL-AnilaNeural" to "Anila",
        "sq-AL-IlirNeural" to "Ilir",
        "sr-RS-NicholasNeural" to "Никола",
        "sr-RS-SophieNeural" to "Софија",
        "su-ID-JajangNeural" to "Jajang",
        "su-ID-TutiNeural" to "Tuti",
        "sv-SE-SofieNeural" to "Sofie",
        "sv-SE-HilleviNeural" to "Hillevi",
        "sv-SE-MattiasNeural" to "Mattias",
        "sw-KE-RafikiNeural" to "Rafiki",
        "sw-KE-ZuriNeural" to "Zuri",
        "sw-TZ-DaudiNeural" to "Daudi",
        "sw-TZ-RehemaNeural" to "Rehema",
        "ta-IN-PallaviNeural" to "பல்லவி",
        "ta-IN-ValluvarNeural" to "வள்ளுவர்",
        "ta-LK-KumarNeural" to "குமார்",
        "ta-LK-SaranyaNeural" to "சரண்யா",
        "ta-MY-KaniNeural" to "கனி",
        "ta-MY-SuryaNeural" to "சூர்யா",
        "ta-SG-AnbuNeural" to "அன்பு",
        "ta-SG-VenbaNeural" to "வெண்பா",
        "te-IN-MohanNeural" to "మోహన్",
        "te-IN-ShrutiNeural" to "శ్రుతి",
        "th-TH-PremwadeeNeural" to "เปรมวดี",
        "th-TH-AcharaNeural" to "อัจฉรา",
        "th-TH-NiwatNeural" to "นิวัฒน์",
        "tr-TR-AhmetNeural" to "Ahmet",
        "tr-TR-EmelNeural" to "Emel",
        "uk-UA-OstapNeural" to "Остап",
        "uk-UA-PolinaNeural" to "Поліна",
        "ur-IN-GulNeural" to "گل",
        "ur-IN-SalmanNeural" to "سلمان",
        "ur-PK-AsadNeural" to "اسد",
        "ur-PK-UzmaNeural" to "عظمیٰ",
        "uz-UZ-MadinaNeural" to "Madina",
        "uz-UZ-SardorNeural" to "Sardor",
        "vi-VN-HoaiMyNeural" to "Hoài My",
        "vi-VN-NamMinhNeural" to "Nam Minh",
        "wuu-CN-Xiao:ngNeural" to "晓彤",
        "wuu-CN-YunzheNeural" to "云哲",
        "yue-CN-XiaoMinNeural" to "晓敏",
        "yue-CN-YunSongNeural" to "云松",
        "zh-CN-XiaoxiaoNeural" to "晓晓",
        "zh-CN-YunyangNeural" to "云扬",
        "zh-CN-XiaochenNeural" to "晓辰",
        "zh-CN-XiaohanNeural" to "晓涵",
        "zh-CN-XiaomoNeural" to "晓墨",
        "zh-CN-XiaoqiuNeural" to "晓秋",
        "zh-CN-XiaoruiNeural" to "晓睿",
        "zh-CN-XiaoshuangNeural" to "晓双",
        "zh-CN-XiaoxuanNeural" to "晓萱",
        "zh-CN-XiaoyanNeural" to "晓颜",
        "zh-CN-XiaoyouNeural" to "晓悠",
        "zh-CN-YunxiNeural" to "云希",
        "zh-CN-YunyeNeural" to "云野",
        "zh-CN-XiaomengNeural" to "晓梦",
        "zh-CN-XiaoyiNeural" to "晓伊",
        "zh-CN-XiaozhenNeural" to "晓甄",
        "zh-CN-YunfengNeural" to "云枫",
        "zh-CN-YunhaoNeural" to "云皓",
        "zh-CN-YunjianNeural" to "云健",
        "zh-CN-YunxiaNeural" to "云夏",
        "zh-CN-YunzeNeural" to "云泽",
        "zh-CN-henan-YundengNeural" to "云登",
        "zh-CN-liaoning-XiaobeiNeural" to "晓北",
        "zh-CN-shaanxi-XiaoniNeural" to "晓妮",
        "zh-CN-shandong-YunxiangNeural" to "云翔",
        "zh-CN-sichuan-YunxiNeural" to "云希",
        "zh-HK-HiuMaanNeural" to "曉曼",
        "zh-HK-HiuGaaiNeural" to "曉佳",
        "zh-HK-WanLungNeural" to "雲龍",
        "zh-TW-HsiaoChenNeural" to "曉臻",
        "zh-TW-HsiaoYuNeural" to "曉雨",
        "zh-TW-YunJheNeural" to "雲哲",
        "zu-ZA-ThandoNeural" to "Thando",
        "zu-ZA-ThembaNeural" to "Themba"
    )

}