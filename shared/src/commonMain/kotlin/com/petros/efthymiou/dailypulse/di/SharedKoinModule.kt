package com.petros.efthymiou.dailypulse.di

import com.petros.efthymiou.dailypulse.articles.di.articlesModule


/**
 * Created by Peal Mazumder on 13/2/25.
 */

val sharedKoinModule = listOf(
    articlesModule,
    networkModule,
)