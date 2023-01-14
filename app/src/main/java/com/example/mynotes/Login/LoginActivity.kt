package com.example.mynotes.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mynotes.R
import com.example.mynotes.Register.RegisterActivity
import com.example.mynotes.databinding.ActivityLoginBinding
import com.example.mynotes.databinding.ActivitySplashBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        binding.btnRegister.setOnClickListener {
            val masuk = Intent(this, RegisterActivity::class.java)
            startActivity(masuk)
        }

    }
}

