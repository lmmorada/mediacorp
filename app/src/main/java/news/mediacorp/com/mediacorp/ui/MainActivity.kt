package news.mediacorp.com.mediacorp.ui

import android.os.Bundle
import news.mediacorp.com.mediacorp.DateUtils
import news.mediacorp.com.mediacorp.R
import news.mediacorp.com.mediacorp.databinding.ActivityMainBinding
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class MainActivity : BaseActivity() {

    private lateinit var date: String;
    private val binding by binding<ActivityMainBinding>(R.layout.activity_main);

    private val viewModel: NewsViewModel by viewModel { parametersOf(date) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        date = DateUtils.lastMonthDate();

        binding.apply {
            date = this@MainActivity.date
            lifecycleOwner = this@MainActivity
            viewModel = this@MainActivity.viewModel
        }
    }
}
