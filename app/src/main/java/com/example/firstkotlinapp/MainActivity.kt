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

    val extraPass = "loremipsum"

    val adminUserName = "90"
    val adminUserPass = "94"

    private fun mainClick() {
        click_btn.setOnClickListener {
            val userName = username_txt.text.toString()
            val password = password_txt.text.toString()
            checkUserData(userName, password)
        }
    }

    private fun checkUserData(userName: String, password: String) {
        if (password == extraPass) UIManager.showToast("Inserted extra pass", this)
        else if(userName == adminUserName && password == adminUserPass){
            startActivity(Intent(this, AdminActivity::class.java)
                .putExtra("adminUserName", userName)
                .putExtra("adminPass", password)
            )
            UIManager.showShortToast("Welcome back, admin!", this)
        }
        else if (nameList.contains(userName) && passList.contains(password))
            startActivity(
                    Intent(this, SecondActivity::class.java)
                    .putExtra("userName", userName)
                    .putExtra("password", password))
        else UIManager.showToast("ERROR", this)
    }

}
