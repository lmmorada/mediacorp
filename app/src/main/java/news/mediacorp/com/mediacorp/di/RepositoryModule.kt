package news.mediacorp.com.mediacorp.di

import news.mediacorp.com.mediacorp.data.repository.NewsRepository
import news.mediacorp.com.mediacorp.data.repository.NewsRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<NewsRepository> { NewsRepositoryImpl(remoteDataSource = get()) }
}