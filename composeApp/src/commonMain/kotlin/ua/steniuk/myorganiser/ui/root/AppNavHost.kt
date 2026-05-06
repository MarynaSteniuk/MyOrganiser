package ua.steniuk.myorganiser.ui.root

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ua.steniuk.myorganiser.ui.about.AboutScreen
import ua.steniuk.myorganiser.ui.reminders.RemindersScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Reminders.route,
        modifier = modifier,
    ) {
        composable(Screen.Reminders.route) {
            RemindersScreen(
                onAboutButtonClick = { navController.navigate(Screen.AboutDevice.route) }
            )
        }

        composable(Screen.AboutDevice.route) {
            AboutScreen(
                onUpButtonClick = { navController.popBackStack() }
            )
        }
    }
}