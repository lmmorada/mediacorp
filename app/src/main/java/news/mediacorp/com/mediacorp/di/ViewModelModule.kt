package news.mediacorp.com.mediacorp.di

import news.mediacorp.com.mediacorp.ui.NewsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { (date: String) -> NewsViewModel(date, repository = get()) }
}