package news.mediacorp.com.mediacorp.data.service

import com.google.gson.JsonObject
import news.mediacorp.com.mediacorp.Constants.API_KEY
import retrofit2.http.*

interface MediaCorpNewsService {

    @GET("v2/everything?q=tesla&sortBy=publishedAt&language=en&apiKey=$API_KEY")
    @Headers("Accept:application/json")
    suspend fun getNews(@Query("from") from: String): JsonObject

}