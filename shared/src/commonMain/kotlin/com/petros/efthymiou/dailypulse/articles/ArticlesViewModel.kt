package com.petros.efthymiou.dailypulse.articles

import com.petros.efthymiou.dailypulse.BaseViewModel
import com.petros.efthymiou.dailypulse.network.ArticlesService
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json


/**
 * Created by Peal Mazumder on 12/2/25.
 */
class ArticlesViewModel : BaseViewModel() {
    private val _articlesState: MutableStateFlow<ArticleState> = MutableStateFlow(ArticleState(loading = true))
    val articlesState: StateFlow<ArticleState> get() = _articlesState

    private val useCase: ArticlesUseCase

    init {
        val httpClient = HttpClient {
            install(ContentNegotiation) {
                json(Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                })
            }
        }
        val service = ArticlesService(httpClient)

        useCase = ArticlesUseCase(service)
        getArticles()
    }

    private fun getArticles() {
        scope.launch {

            val fetchedArticles = useCase.getArticles()

            _articlesState.emit(ArticleState(articles = fetchedArticles))
        }
    }
}