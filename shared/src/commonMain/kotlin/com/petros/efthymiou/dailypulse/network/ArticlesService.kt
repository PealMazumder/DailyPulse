package com.petros.efthymiou.dailypulse.network

import com.petros.efthymiou.dailypulse.articles.ArticleRaw
import com.petros.efthymiou.dailypulse.articles.ArticlesResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get


/**
 * Created by Peal Mazumder on 12/2/25.
 */
class ArticlesService(private val httpClient: HttpClient) {

    private val country = "us"
    private val category = "business"
    private val apiKey = "d8c88ca04bc44858a68aabf50e7821ab"

    suspend fun fetchArticles(): List<ArticleRaw> {
        val response: ArticlesResponse = httpClient.get("https://newsapi.org/v2/top-headlines?country=$country&category=$category&apiKey=$apiKey").body()
        return response.articles
    }
}