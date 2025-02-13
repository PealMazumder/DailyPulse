package com.petros.efthymiou.dailypulse.articles.presentation

import com.petros.efthymiou.dailypulse.articles.domain.Article


/**
 * Created by Peal Mazumder on 12/2/25.
 */

data class ArticleState (
    val articles: List<Article> = listOf(),
    val loading: Boolean =  false,
    val error: String? = null
)