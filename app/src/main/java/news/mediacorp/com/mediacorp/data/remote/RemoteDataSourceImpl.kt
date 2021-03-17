package news.mediacorp.com.mediacorp.data.remote

import news.mediacorp.com.mediacorp.data.service.MediaCorpNewsService

class RemoteDataSourceImpl(private val service: MediaCorpNewsService) : RemoteDataSource {

    override suspend fun getNews(date: String) = service.getNews(date)

}