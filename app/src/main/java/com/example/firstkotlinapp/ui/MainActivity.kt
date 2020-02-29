package com.example.firstkotlinapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firstkotlinapp.R
import com.example.firstkotlinapp.utils.UIManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainClick()
    }

    val nameList = mutableListOf("name", "hello", "text")
    val passList = mutableListOf("123", "123456")

    val secondUserName = "90"
    val secondPass = "94"

    private fun mainClick() {
        click_btn.setOnClickListener {
            val userName = username_txt.text.toString()
            val password = password_txt.text.toString()
            checkUserData(userName, password)
        }
    }

    private fun checkUserData(userName: String, password: String) {
        if(userName == secondUserName && password == secondPass){
            startActivity(Intent(this, ThirdActivity::class.java)
                .putExtra("adminUserName", userName)
                .putExtra("adminPass", password)
            )
//            UIManager.showShortToast("Welcome back, admin!", this)
        }
        else if (nameList.contains(userName) && passList.contains(password))
            startActivity(
                    Intent(this, SecondActivity::class.java)
                    .putExtra("userName", userName)
                    .putExtra("password", password))
        else UIManager.showToast("ERROR", this)
    }

}
