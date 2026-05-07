package ua.steniuk.myorganiser.di

import org.koin.dsl.module
import org.koin.plugin.module.dsl.single
import org.koin.plugin.module.dsl.viewModel
import ua.steniuk.myorganiser.data.about.AboutRepository
import ua.steniuk.myorganiser.data.about.Platform
import ua.steniuk.myorganiser.ui.about.AboutViewModel

val appModule = module {
    single<Platform>()
    single<AboutRepository>()
    viewModel<AboutViewModel>()
}