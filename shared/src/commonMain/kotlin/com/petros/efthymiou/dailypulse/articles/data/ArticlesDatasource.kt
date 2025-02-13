package com.petros.efthymiou.dailypulse.articles.data

import petros.efthymiou.dailypulse.db.DailyPulseDatabase

class ArticlesDatasource(private val database: DailyPulseDatabase) {
    fun getAllArticles(): List<ArticleRaw> =
        database.dialyPulseDatabaseQueries.selectAllArticles(::mapToArticleRaw).executeAsList()

    fun insertArticles(articles: List<ArticleRaw>) {
        database.dialyPulseDatabaseQueries.transaction {
            articles.forEach { articleRaw ->
                insertArticle(articleRaw)
            }
        }
    }

    private fun insertArticle(articleRaw: ArticleRaw) {
        with(articleRaw) {
            database.dialyPulseDatabaseQueries.insertArticle(
                title,
                desc,
                date,
                imageUrl
            )
        }

    }

    fun clearArticles() =
        database.dialyPulseDatabaseQueries.removeAllArticles()
    private fun mapToArticleRaw(
        title: String,
        desc: String?,
        date: String,
        url: String?
    ): ArticleRaw =
        ArticleRaw(
            title,
            desc,
            date,
            url
        )
}