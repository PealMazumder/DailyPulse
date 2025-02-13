package com.petros.efthymiou.dailypulse.di

import com.petros.efthymiou.dailypulse.articles.ArticlesViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin


/**
 * Created by Peal Mazumder on 13/2/25.
 */

fun initKoin() {
    val modules = sharedKoinModule + databaseModule
    startKoin {
        modules(modules)
    }
}

class ArticlesInjector: KoinComponent {
    val articlesViewModel: ArticlesViewModel by inject()
}