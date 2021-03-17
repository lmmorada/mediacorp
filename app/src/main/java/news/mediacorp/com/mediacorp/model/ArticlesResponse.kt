package news.mediacorp.com.mediacorp.model

import com.google.gson.annotations.SerializedName

class ArticlesResponse {
    @SerializedName("status")
    var status: String? = null

    @SerializedName("articles")
    var articlesList: List<Article>? = null
}