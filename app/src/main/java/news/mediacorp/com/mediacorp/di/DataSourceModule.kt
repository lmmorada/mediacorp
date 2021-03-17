package news.mediacorp.com.mediacorp.di

import news.mediacorp.com.mediacorp.data.remote.RemoteDataSource
import news.mediacorp.com.mediacorp.data.remote.RemoteDataSourceImpl
import org.koin.dsl.module

val dataSourceModule = module {
    single<RemoteDataSource> { RemoteDataSourceImpl(service = get()) }
}