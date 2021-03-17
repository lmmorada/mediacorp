package news.mediacorp.com.mediacorp.extension

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.yarolegovich.discretescrollview.DiscreteScrollView
import com.yarolegovich.discretescrollview.transform.ScaleTransformer
import news.mediacorp.com.mediacorp.model.Article
import news.mediacorp.com.mediacorp.ui.NewsAdapter

@BindingAdapter("bind:src")
fun setImageViewResource(view: ImageView, resId: Int) {
    view.setImageResource(resId)
}

@BindingAdapter("bind:adapter")
fun setAdapter(view: RecyclerView, baseAdapter: RecyclerView.Adapter<*>) {
    view.adapter = baseAdapter
}

@BindingAdapter("bind:items")
fun setItems(view: RecyclerView, items: List<Article>?) {
    view.adapter = NewsAdapter().apply {
        itemList = items ?: emptyList()
        notifyDataSetChanged()
    }
}

@BindingAdapter("bind:transformer")
fun bindAdapterTransform(view: DiscreteScrollView, isTransform: Boolean) {
    if (isTransform) {
        view.setItemTransformer(
            ScaleTransformer.Builder()
                .setMaxScale(1.25f)
                .setMinScale(0.8f)
                .build()
        )
    }
}

@BindingAdapter("bind:loadUrl")
fun bindUrlImage(view: ImageView, url: String?) {
    var tempUrl : String? = url;
    if  (tempUrl == null || tempUrl.isBlank() || tempUrl == "null")
        tempUrl = "";

    Glide.with(view)
        .load(tempUrl)
        .into(view)
}