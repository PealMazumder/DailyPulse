package com.petros.efthymiou.dailypulse.android.di

import com.petros.efthymiou.dailypulse.articles.presentation.ArticlesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


/**
 * Created by Peal Mazumder on 13/2/25.
 */

val viewModelsModule = module {
    viewModel { ArticlesViewModel(get()) }
}