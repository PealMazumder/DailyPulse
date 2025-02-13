package com.petros.efthymiou.dailypulse.articles

import com.petros.efthymiou.dailypulse.network.ArticlesService


/**
 * Created by Peal Mazumder on 13/2/25.
 */
class ArticlesRepository(
    private val datasource: ArticlesDatasource,
    private val service: ArticlesService
) {
    suspend fun getArticles(): List<ArticleRaw> {
        val articlesDb = datasource.getAllArticles()
        println("Got ${articlesDb.size} articles from db")

        if (articlesDb.isEmpty()) {
            val fetchedArticles = service.fetchArticles()
            datasource.insertArticles(fetchedArticles)
            return fetchedArticles
        }
        return articlesDb
    }
}