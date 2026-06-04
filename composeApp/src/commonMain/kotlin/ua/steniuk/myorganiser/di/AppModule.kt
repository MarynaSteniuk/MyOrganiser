package ua.steniuk.myorganiser.di

import com.russhwolf.settings.ObservableSettings
import com.russhwolf.settings.Settings
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module
import org.koin.plugin.module.dsl.create
import org.koin.plugin.module.dsl.single
import org.koin.plugin.module.dsl.viewModel
import ua.steniuk.myorganiser.Organise
import ua.steniuk.myorganiser.data.about.AboutRepository
import ua.steniuk.myorganiser.data.about.Platform
import ua.steniuk.myorganiser.data.common.db.DatabaseDriverFactory
import ua.steniuk.myorganiser.data.common.db.DbDataSource
import ua.steniuk.myorganiser.data.common.db.LocalDataSource
import ua.steniuk.myorganiser.data.common.preferences.AppPreferences
import ua.steniuk.myorganiser.data.common.preferences.Preferences
import ua.steniuk.myorganiser.data.reminders.RemindersRepository
import ua.steniuk.myorganiser.ui.about.AboutViewModel
import ua.steniuk.myorganiser.ui.reminders.ReminderViewModel

private fun createSettings() : Settings = Settings()

private fun createDb(driver: DatabaseDriverFactory) : Organise = Organise(driver.create())
val dataModule = module {
    single { create(::createSettings) } binds arrayOf(Settings::class, ObservableSettings::class)
    singleOf(::AppPreferences) bind Preferences::class
    single<DatabaseDriverFactory>()
    single { create(::createDb) }
    singleOf(::DbDataSource) bind LocalDataSource::class
}

val appModule = module {
    includes(dataModule)
    single<Platform>()
    single<AboutRepository>()
    viewModel<AboutViewModel>()
    single<RemindersRepository>()
    viewModel<ReminderViewModel>()
}