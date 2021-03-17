package news.mediacorp.com.mediacorp.model

import com.google.gson.annotations.SerializedName

class Article {
    @SerializedName("author")
    var author: String = ""

    @SerializedName("title")
    var title: String = ""

    @SerializedName("description")
    var description: String = ""

    @SerializedName("url")
    var url: String? = ""

    @SerializedName("urlToImage")
    var urlToImage: String? = ""

    @SerializedName("publishedAt")
    var publishAt: String = ""

    @SerializedName("content")
    var content: String = ""

    @SerializedName("source")
    var articleSource: ArticleSource? = null
}