package com.example.mynotes.Register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mynotes.Login.LoginActivity
import com.example.mynotes.R
import com.example.mynotes.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityRegisterBinding = DataBindingUtil.setContentView(this, R.layout.activity_register)

        binding.ivBack.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}