package news.mediacorp.com.mediacorp.data.repository

import com.google.gson.Gson
import com.google.gson.JsonObject
import news.mediacorp.com.mediacorp.data.remote.RemoteDataSource
import news.mediacorp.com.mediacorp.model.Article
import news.mediacorp.com.mediacorp.model.ArticlesResponse

class NewsRepositoryImpl (private val remoteDataSource: RemoteDataSource): NewsRepository {

    override suspend fun getNews(date: String) : List<Article> {
        val response : JsonObject = remoteDataSource.getNews(date);
        val article = Gson().fromJson(response, ArticlesResponse::class.java)

        return article.articlesList!!
    }

}