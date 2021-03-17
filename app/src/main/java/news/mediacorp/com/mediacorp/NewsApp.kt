package news.mediacorp.com.mediacorp

import android.app.Application
import news.mediacorp.com.mediacorp.di.dataSourceModule
import news.mediacorp.com.mediacorp.di.networkModule
import news.mediacorp.com.mediacorp.di.repositoryModule
import news.mediacorp.com.mediacorp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class NewsApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@NewsApp)
            modules(dataSourceModule)
            modules(repositoryModule)
            modules(viewModelModule)
            modules(networkModule)
        }
    }

}