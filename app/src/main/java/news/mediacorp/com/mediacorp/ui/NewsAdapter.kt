package news.mediacorp.com.mediacorp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import news.mediacorp.com.mediacorp.R
import news.mediacorp.com.mediacorp.databinding.ItemNewsBinding
import news.mediacorp.com.mediacorp.model.Article
import news.mediacorp.com.mediacorp.ui.DetailActivity.Companion.startDetailActivity

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.NewsItemViewHolder>() {

    var itemList = listOf<Article>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataBindingUtil.inflate<ItemNewsBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_news,
            parent,
            false
        ).let {
            NewsItemViewHolder(it)
        }

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: NewsItemViewHolder, position: Int) =
        holder.bind(itemList[position])

    inner class NewsItemViewHolder(private val binding: ItemNewsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Article) {
            binding.apply {
                article = item
                executePendingBindings()
                root.setOnClickListener {
                    startDetailActivity(root.context, item.url)
                }
            }
        }

    }

}
