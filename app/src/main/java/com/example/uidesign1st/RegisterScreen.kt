package com.example.uidesign1st

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.uidesign1st.databinding.ActivityRegisterScreenBinding

class RegisterScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var regScreen: ActivityRegisterScreenBinding = ActivityRegisterScreenBinding.inflate(layoutInflater)
        setContentView(regScreen.root)

        regScreen.apply {
            loginNow.setOnClickListener {
                intent = Intent(this@RegisterScreen, LoginScreen::class.java)
                startActivity(intent)
                finish()
            }
            registerButton.setOnClickListener {
                regScreen.progressCircular.visibility = if(regScreen.progressCircular.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            }
        }
    }
}