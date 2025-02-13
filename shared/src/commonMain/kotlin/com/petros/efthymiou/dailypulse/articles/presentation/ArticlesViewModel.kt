package com.petros.efthymiou.dailypulse.articles.presentation

import com.petros.efthymiou.dailypulse.BaseViewModel
import com.petros.efthymiou.dailypulse.articles.domain.ArticlesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


/**
 * Created by Peal Mazumder on 12/2/25.
 */
class ArticlesViewModel(
    private val articleUseCase: ArticlesUseCase
) : BaseViewModel() {
    private val _articlesState: MutableStateFlow<ArticleState> =
        MutableStateFlow(ArticleState(loading = true))
    val articlesState: StateFlow<ArticleState> get() = _articlesState

    init {
        getArticles()
    }

    fun getArticles(forceFetch: Boolean = false) {
        scope.launch {
            _articlesState.emit(
                ArticleState(
                    loading = true,
                    articles = _articlesState.value.articles
                )
            )
            val fetchedArticles = articleUseCase.getArticles(forceFetch)

            _articlesState.emit(ArticleState(articles = fetchedArticles))
        }
    }
}