package com.example.uidesign1st

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.marginTop
import com.example.uidesign1st.databinding.ActivityLoginScreenBinding

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLoginScreenBinding = ActivityLoginScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerNow.setOnClickListener {
            intent = Intent(this, RegisterScreen::class.java)
            startActivity(intent)
            finish()

        }

        binding.apply {
            loginButton.setOnClickListener {
                binding.progressCircular.visibility = if (binding.progressCircular.visibility == View.VISIBLE) View.GONE else View.VISIBLE

                if(binding.username.text.isNotEmpty() && binding.password.text.isNotEmpty()){
                    startActivity(Intent(this@LoginScreen,MainActivity::class.java))
                }
            }

        }
    }

}