package ua.steniuk.myorganiser

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ua.steniuk.myorganiser.ui.root.AppScaffold

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MyOrganiser",
    ) {
        AppScaffold()
    }
}