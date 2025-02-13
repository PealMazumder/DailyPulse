package com.petros.efthymiou.dailypulse.articles

import com.petros.efthymiou.dailypulse.articles.data.ArticleRaw
import com.petros.efthymiou.dailypulse.articles.data.ArticlesDatasource
import com.petros.efthymiou.dailypulse.articles.data.network.ArticlesService


/**
 * Created by Peal Mazumder on 13/2/25.
 */
class ArticlesRepository(
    private val datasource: ArticlesDatasource,
    private val service: ArticlesService
) {
    suspend fun getArticles(forceFetch: Boolean): List<ArticleRaw> {
        if (forceFetch) {
            datasource.clearArticles()
            return fetchArticles()
        }

        val articlesDb = datasource.getAllArticles()
        println("Got ${articlesDb.size} articles from db")

        if (articlesDb.isEmpty()) {
            return fetchArticles()
        }
        return articlesDb
    }

    private suspend fun fetchArticles(): List<ArticleRaw> {
        val fetchedArticles = service.fetchArticles()
        datasource.insertArticles(fetchedArticles)
        return fetchedArticles
    }
}