package com.example.lab

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        val adapter = ArticlesAdapter(getArticles())
        recyclerView.adapter = adapter
        recyclerView.layoutManager= LinearLayoutManager(this)


        }
    fun getArticles(): List<Article> {
        val articles = ArrayList<Article>()
        articles.add(Article(1, R.drawable.food1, "Luxury Villa", "500,000 pkr", "Sticky Gochujang Tofu with Herbs and Peanuts.", "Karachi, Pakistan"))
        articles.add(Article(2, R.drawable.food2, "Modern Apartment", "300,000 pkr", "Ridiculously Good Chicken Tacos with Green Sauce.", "Lahore, Pakistan"))
        articles.add(Article(3, R.drawable.food3, "Beach House", "1,000,000 pkr", "Garlic and Black Pepper Beef Skewers.", "Gwadar, Pakistan"))
        articles.add(Article(4, R.drawable.food1, "Mountain Cabin", "750,000 pkr", "Ridiculously Good Chicken Tacos with Green Sauce.", "Murree, Pakistan"))
        articles.add(Article(5, R.drawable.food2, "Luxury Penthouse", "2,000,000 pkr", "Sticky Gochujang Tofu with Herbs and Peanuts.", "Islamabad, Pakistan"))
        articles.add(Article(6, R.drawable.food3, "Suburban House", "400,000 pkr", "Garlic and Black Pepper Beef Skewers.", "Rawalpindi, Pakistan"))
        articles.add(Article(7, R.drawable.food1, "Farmhouse", "600,000 pkr", "Ridiculously Good Chicken Tacos with Green Sauce.", "Multan, Pakistan"))
        articles.add(Article(8, R.drawable.food2, "Lakefront Cottage", "800,000 pkr", "Sticky Gochujang Tofu with Herbs and Peanuts.", "Swat, Pakistan"))
        articles.add(Article(9, R.drawable.food3, "City Loft", "450,000 pkr", "Garlic and Black Pepper Beef Skewers.", "Peshawar, Pakistan"))
        articles.add(Article(10, R.drawable.food1, "Downtown Studio", "350,000 pkr", "Ridiculously Good Chicken Tacos with Green Sauce.", "Quetta, Pakistan"))
        articles.add(Article(11, R.drawable.food2, "Luxury Condo", "700,000 pkr", "Sticky Gochujang Tofu with Herbs and Peanuts.", "Karachi, Pakistan"))
        articles.add(Article(12, R.drawable.food3, "Countryside Villa", "900,000 pkr", "Garlic and Black Pepper Beef Skewers.", "Bahawalpur, Pakistan"))
        articles.add(Article(13, R.drawable.food1, "Modern Duplex", "550,000 pkr", "Garlic and Black Pepper Beef Skewers.", "Sialkot, Pakistan"))
        articles.add(Article(14, R.drawable.food2, "Eco-friendly Home", "650,000 pkr", "Ridiculously Good Chicken Tacos with Green Sauce.", "Faisalabad, Pakistan"))
        articles.add(Article(15, R.drawable.food3, "High-rise Apartment", "600,000 pkr", "Garlic and Black Pepper Beef Skewers.", "Hyderabad, Pakistan"))

        return articles
    }

}
