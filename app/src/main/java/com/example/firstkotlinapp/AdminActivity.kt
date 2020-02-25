package com.example.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_admin.*
import kotlin.random.Random

class AdminActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        val adminUserName = intent.getStringExtra("adminUserName").toInt()
        val adminPass = intent.getStringExtra("adminPass").toInt()



        val randomValues = Random.nextInt(1, 4)

        var result = 0
        var function = ""

        when (randomValues){
            1 -> {
                result = adminUserName + adminPass
                admin_txt.text = result.toString()
                function = "+"
            }
            2 -> {
                result = adminUserName - adminPass
                admin_txt.text = result.toString()
                function = "-"
            }
            3 -> {
                result = adminUserName * adminPass
                admin_txt.text = result.toString()
                function = "*"
            }
            4 -> {
                result = adminUserName / adminPass
                admin_txt.text = result.toString()
                function = "/"
            }
        }
        UIManager.showToast("function was:$function \n"+result.toString(), this)
    }
}
