package ua.steniuk.myorganiser.data.about

import co.touchlab.kermit.Logger
import kotlinx.browser.window

actual class Platform actual constructor() {
    private val userAgent = window.navigator.userAgent

    actual val osName: String
        get() = parseBrowserName(userAgent)
    actual val osVersion: String
        get() = parseBrowserVersion(userAgent)
    actual val deviceModel: String
        get() = "${parseOsName(userAgent)} ${parseOsVersion(userAgent)}"
    actual val cpuType: String
        get() = parseLayoutEngine(userAgent)
    actual val screen: ScreenInfo
        get() = ScreenInfo()

    actual fun logSystemInfo() {
        // Викладач використовує deviceInfo, але в цьому коді це osName + version
        Logger.d("Platform: $osName $osVersion")
    }
}

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class ScreenInfo actual constructor() {
    val pageWidth = window.innerWidth
    val pageHeight = window.innerHeight
    val deviceDensity = window.devicePixelRatio

    actual val width: Int
        get() = pageWidth
    actual val height: Int
        get() = pageHeight
    actual val density: Int?
        get() = deviceDensity.toInt()
}