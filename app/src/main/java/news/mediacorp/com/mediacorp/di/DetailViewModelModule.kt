package news.mediacorp.com.mediacorp.di

import news.mediacorp.com.mediacorp.ui.DetailViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val detailViewModelModule = module {
    viewModel { DetailViewModel(repository = get()) }
}