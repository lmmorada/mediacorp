package news.mediacorp.com.mediacorp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers
import news.mediacorp.com.mediacorp.data.repository.NewsRepository
import news.mediacorp.com.mediacorp.model.Article

class DetailViewModel(private val repository: NewsRepository) : ViewModel() {

}