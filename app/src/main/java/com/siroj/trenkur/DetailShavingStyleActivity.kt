package com.siroj.trenkur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailShavingStyleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_shaving_style)

        val name = intent.getStringExtra(EXTRA_NAME)
        val description = intent.getStringExtra(EXTRA_DESCRIPTION)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Detail " + name
            (supportActionBar as ActionBar).setDisplayHomeAsUpEnabled(true)
        }

        val imgView: ImageView = findViewById(R.id.detail_shaving_style_photo)
        Glide.with(this)
            .load(photo)
            .apply(RequestOptions().override(300, 300))
            .placeholder(R.drawable.afrofade)
            .into(imgView)

        val textTitle: TextView = findViewById(R.id.detail_shaving_style_title)
        textTitle.text = name

        val textDescription: TextView = findViewById(R.id.detail_shaving_style_description)
        textDescription.text = description
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
