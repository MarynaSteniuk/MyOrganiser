package ua.steniuk.myorganiser.data.about

fun parseBrowserName(userAgent: String): String = when {
    userAgent.contains("Firefox") -> "Firefox"
    userAgent.contains("Chrome") -> "Chrome"
    userAgent.contains("Safari") -> "Safari"
    else -> "Unknown Browser"
}

fun parseBrowserVersion(userAgent: String): String {
    return userAgent.split(" ").lastOrNull() ?: "Unknown"
}

fun parseOsName(userAgent: String): String = when {
    userAgent.contains("Windows") -> "Windows"
    userAgent.contains("Mac") -> "macOS"
    userAgent.contains("Linux") -> "Linux"
    else -> "Web"
}

fun parseOsVersion(userAgent: String): String = "Online"

fun parseLayoutEngine(userAgent: String): String = when {
    userAgent.contains("Gecko") -> "Gecko"
    userAgent.contains("WebKit") -> "WebKit"
    else -> "Blink"
}