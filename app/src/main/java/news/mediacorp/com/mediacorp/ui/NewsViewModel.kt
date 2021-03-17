package news.mediacorp.com.mediacorp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers
import news.mediacorp.com.mediacorp.data.repository.NewsRepository
import news.mediacorp.com.mediacorp.model.Article

class NewsViewModel(date: String, private val repository: NewsRepository) : ViewModel() {

    val isLoading = MutableLiveData<Boolean>();

    val getNews : LiveData<List<Article>> = liveData(Dispatchers.IO) {
        isLoading.postValue(true);
        emit(repository.getNews(date));
        isLoading.postValue(false);
    }

}