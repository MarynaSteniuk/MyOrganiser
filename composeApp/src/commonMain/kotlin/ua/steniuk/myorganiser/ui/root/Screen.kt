package ua.steniuk.myorganiser.ui.root

sealed class Screen(val route: String) {
    data object Reminders : Screen("reminders")
    data object AboutDevice : Screen("about_device")
}