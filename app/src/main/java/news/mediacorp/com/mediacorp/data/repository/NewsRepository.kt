package news.mediacorp.com.mediacorp.data.repository

import news.mediacorp.com.mediacorp.model.Article

interface NewsRepository {

    suspend fun getNews(date: String) : List<Article>
}