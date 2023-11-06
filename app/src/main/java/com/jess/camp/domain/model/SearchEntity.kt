package com.jess.camp.domain.model

import com.google.gson.annotations.SerializedName
import java.util.Date

data class SearchEntity<T> (
    @SerializedName("meta") val meta: MetaEntity?,
    @SerializedName("documents") val documents: List<T>?
)

data class MetaEntity(
    @SerializedName("total_count") val totalCount: Int?,
    @SerializedName("pageable_count") val pageableCount: Int?,
    @SerializedName("is_end") val isEnd: Boolean?
)

data class ImageDocumentEntity(
    @SerializedName("collection") val news: String?,
    @SerializedName("thumbnail_url") val thumbnailUrl: String?,
    @SerializedName("image_url") val imageUrl: String?,
    @SerializedName("width") val width: Int?,
    @SerializedName("height") val height: Int?,
    @SerializedName("display_sitename") val displaySitename: String?,
    @SerializedName("doc_url") val docUrl: String?,
    @SerializedName("datetime") val datetime: Date?
)

data class VideoDocumentEntity(
    @SerializedName("title") val title: String?,
    @SerializedName("url") val url: String?,
    @SerializedName("datetime") val datetime: Date?,
    @SerializedName("play_time") val playTime: Int?,
    @SerializedName("thumbnail") val thumbNail: String?,
    @SerializedName("author") val author: String?
)