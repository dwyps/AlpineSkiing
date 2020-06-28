package com.example.alpineskiing2020season.util

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.alpineskiing2020season.R
import com.example.alpineskiing2020season.data.model.Event
import com.example.alpineskiing2020season.data.model.Racer

@BindingAdapter("bindRacerImage")
fun imageBindRacer(imgView: ImageView, racer: Racer) {

    racer.let {

        Glide.with(imgView.context)
            .asBitmap()
            .load(racer.image)
            .apply(
                RequestOptions()
                    .circleCrop()
                    .placeholder(R.drawable.placeholder_image)
                    .error(R.drawable.placeholder_image)
            )
            .into(imgView)

    }
}

@BindingAdapter("bindFlagImage")
fun imageBindFlag(imgView: ImageView, racer: Racer) {

    racer.let {

        Glide.with(imgView.context)
            .asBitmap()
            .load(racer.country.flag)
            .apply(
                RequestOptions()
                    .placeholder(R.drawable.placeholder_image)
                    .error(R.drawable.placeholder_image)
            )
            .into(imgView)
    }
}

@BindingAdapter("bindFlagImage")
fun eventImageBindFlag(imgView: ImageView, event: Event) {

    event.let {

        Glide.with(imgView.context)
            .asBitmap()
            .load(event.flag)
            .apply(
                RequestOptions()
                    .placeholder(R.drawable.placeholder_image)
                    .error(R.drawable.placeholder_image)
            )
            .into(imgView)
    }
}

@BindingAdapter("bindPoints")
fun textBindPoints(txtView: TextView, racer: Racer) {

    racer.let {

        txtView.text = racer.points.toString()
    }
}

@BindingAdapter("android:visibility")
fun setVisibility(view: View, value: Boolean) {
    view.visibility = if (value) View.VISIBLE else View.GONE
}