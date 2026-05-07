package ua.steniuk.myorganiser

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import ua.steniuk.myorganiser.di.initKoin
import ua.steniuk.myorganiser.ui.root.AppScaffold

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    initKoin { printLogger() }
    ComposeViewport {
        AppScaffold()
    }
}