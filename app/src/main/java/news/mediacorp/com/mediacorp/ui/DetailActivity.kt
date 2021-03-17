package news.mediacorp.com.mediacorp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import news.mediacorp.com.mediacorp.R
import news.mediacorp.com.mediacorp.databinding.ActivityDetailBinding

class DetailActivity : BaseActivity() {

    companion object {
        private const val KEY_ARTICLE_URL = "article_url"
        fun startDetailActivity(
            activity: Context,
            articleUrl: String?
        ) {
            val intent = Intent(activity, DetailActivity::class.java)
            intent.putExtra(KEY_ARTICLE_URL, articleUrl)
            activity.startActivity(intent)
        }
    }

    private val binding by binding<ActivityDetailBinding>(R.layout.activity_detail)
     private var viewModel: DetailViewModel? = null

    private val articleUrl by lazy { intent.getStringExtra(KEY_ARTICLE_URL) as String }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.apply {
            lifecycleOwner = this@DetailActivity
            viewModel = this@DetailActivity.viewModel
        }

        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

        binding.articleWebview.settings.setJavaScriptEnabled(true)
        binding.articleWebview.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }

            override fun onPageFinished(view: WebView, weburl: String) {
                binding.webviewLoading.visibility = View.GONE
            }
        }
        binding.articleWebview.loadUrl(articleUrl)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}