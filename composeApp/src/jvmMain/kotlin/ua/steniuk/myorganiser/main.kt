package ua.steniuk.myorganiser

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ua.steniuk.myorganiser.di.initKoin
import ua.steniuk.myorganiser.ui.root.AppScaffold

fun main() = application {
    initKoin { printLogger() }
    Window(
        onCloseRequest = ::exitApplication,
        title = "MyOrganiser",
    ) {
        AppScaffold()
    }
}