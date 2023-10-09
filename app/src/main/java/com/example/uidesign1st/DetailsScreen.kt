package com.example.uidesign1st

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uidesign1st.databinding.ActivityDetailsScreenBinding

class DetailsScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityDetailsScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var img: Int = intent.getIntExtra("image",R.drawable.intersteller_poster)
        binding.apply {
            movieDetailsPosterBig.setImageResource(img)
            movieDetailsPosterNormal.setImageResource(img)
            detailsMovieName.text = intent.getStringExtra("name")
            detailsRatings.text = intent.getStringExtra("rating")
            goBack.setOnClickListener {
                super.onBackPressed()
            }
        }
    }
}