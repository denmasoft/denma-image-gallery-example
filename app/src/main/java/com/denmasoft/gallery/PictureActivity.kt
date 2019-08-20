package com.denmasoft.gallery

import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.palette.graphics.Palette
import com.squareup.picasso.Picasso

class PictureActivity: AppCompatActivity() {

    companion object {
        const val EXTRA_SUNSET_PHOTO = "SunsetPhotoActivity.EXTRA_SUNSET_PHOTO"
    }

    private lateinit var imageView: ImageView
    private lateinit var gallery: Gallery

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture)

        gallery = intent.getParcelableExtra(EXTRA_SUNSET_PHOTO)
        imageView = findViewById(R.id.image)
    }

    override fun onStart() {
        super.onStart()

        Picasso.get()
            .load(gallery.url)
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.error)
            .fit()
            .priority(Picasso.Priority.HIGH)
            .into(imageView)

        Picasso.get()
            .load(gallery.url)
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.error)
            .fit()
            .priority(Picasso.Priority.LOW)
            .into(imageView)

        Picasso.get()
            .load(gallery.url)
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.error)
            .fit()
            .priority(Picasso.Priority.NORMAL)
            .into(imageView)
    }

    fun onPalette(palette: Palette?) {
        if (null != palette) {
            val parent = imageView.parent.parent as ViewGroup
            parent.setBackgroundColor(palette.getDarkVibrantColor(Color.GRAY))
        }
    }
}


