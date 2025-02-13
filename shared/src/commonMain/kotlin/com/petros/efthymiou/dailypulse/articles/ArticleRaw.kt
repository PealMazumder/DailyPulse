package com.petros.efthymiou.dailypulse.articles

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * Created by Peal Mazumder on 12/2/25.
 */

@Serializable
data class ArticleRaw(
    @SerialName("title")
    val title: String,
    @SerialName("description")
    val desc: String?,
    @SerialName("publishedAt")
    val date: String,
    @SerialName("urlToImage")
    val imageUrl: String?
)