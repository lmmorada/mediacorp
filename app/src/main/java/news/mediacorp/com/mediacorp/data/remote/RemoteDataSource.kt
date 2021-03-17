package news.mediacorp.com.mediacorp.data.remote

import com.google.gson.JsonObject

interface RemoteDataSource {

    suspend fun getNews(date: String) : JsonObject

}