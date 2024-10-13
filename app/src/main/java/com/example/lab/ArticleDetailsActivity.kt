package com.example.lab

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.lab.R

class ArticleDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val intent = intent

        findViewById<TextView>(R.id.property_description_2).text = intent.getStringExtra("author")
        findViewById<ImageView>(R.id.property_image_2).setImageResource(intent.getIntExtra("image", 0))
    }
}