package com.example.firstkotlinapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainClick()
    }

    val nameList = mutableListOf("name", "hello", "text")
    val passList = mutableListOf("123", "123456")

    private fun mainClick() {
        click_btn.setOnClickListener {
//            UIManager.showToast(username_txt.text.toString() + " " + password_txt.text.toString(), this)
            val userName = username_txt.text.toString()
            val password = password_txt.text.toString()
            UIManager.showToast("$userName $password", this)
            checkUserData(userName, password)
        }
    }

    private fun checkUserData(userName: String, password: String) {
        if (nameList.contains(userName) && passList.contains(password))
            startActivity(
                    Intent(this, SecondActivity::class.java)
                    .putExtra("userName", userName)
                    .putExtra("password", password))
        else UIManager.showToast("ERROR", this)
    }

}
