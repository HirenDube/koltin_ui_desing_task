package com.example.uidesign1st

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uidesign1st.databinding.ActivityIntroScreenBinding
import com.example.uidesign1st.databinding.ActivityMainBinding

class IntroScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityIntroScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.enterButton.setOnClickListener {
            intent = Intent(this,LoginScreen::class.java)
            startActivity(intent)
        }



    }
}