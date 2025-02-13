package com.petros.efthymiou.dailypulse.articles.di

import com.petros.efthymiou.dailypulse.articles.data.ArticlesDatasource
import com.petros.efthymiou.dailypulse.articles.ArticlesRepository
import com.petros.efthymiou.dailypulse.articles.domain.ArticlesUseCase
import com.petros.efthymiou.dailypulse.articles.presentation.ArticlesViewModel
import com.petros.efthymiou.dailypulse.articles.data.network.ArticlesService
import org.koin.dsl.module


/**
 * Created by Peal Mazumder on 13/2/25.
 */

val articlesModule = module {
    single<ArticlesService> {
        ArticlesService(get())
    }

    single<ArticlesUseCase> {
        ArticlesUseCase(get())
    }

    single<ArticlesViewModel> {
        ArticlesViewModel(get())
    }

    single<ArticlesDatasource> { ArticlesDatasource(get()) }

    single<ArticlesRepository> {
        ArticlesRepository(get(), get())
    }
}