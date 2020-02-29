package com.example.firstkotlinapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstkotlinapp.R
import com.example.firstkotlinapp.utils.UIManager
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val userName = intent.getStringExtra("name")
        val password = intent.getStringExtra("password")

        val message = "userName: $userName \npassword: $password"
        text.text = message

        UIManager.showToast("Hello its class from java", this)

    }
}
