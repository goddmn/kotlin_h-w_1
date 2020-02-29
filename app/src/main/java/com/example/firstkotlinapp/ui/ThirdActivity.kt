package com.example.firstkotlinapp.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firstkotlinapp.R
import com.example.firstkotlinapp.adapter.PurchasesAdapter
import com.example.firstkotlinapp.model.Purchases
import com.example.firstkotlinapp.model.SalesModel

class ThirdActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val recyclerView = findViewById<View>(R.id.purchases_recycler) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val list = arrayListOf<Purchases>()
        val sale = ArrayList<SalesModel>()

        sale.add(SalesModel("GeekTech", "17:55, Четверг, 27.02.2020", "Боконбаева - Пр.Мира", list))
        list.add(Purchases(1, "Напиток соевый Take a Bite", 42.0, 2.75, 42.0))
        list.add(Purchases(2, "Напиток соевый", 57.5, 2.75, 57.5))

        val adapter = PurchasesAdapter(sale, list)

        recyclerView.adapter = adapter

//      extra task
//        val adminUserName = intent.getStringExtra("adminUserName").toInt()
//        val adminPass = intent.getStringExtra("adminPass").toInt()
//
//        val randomValues = Random.nextInt(1, 4)
//
//        var result = 0
//        var function = ""

//        when (randomValues){
//            1 -> {
//                result = adminUserName + adminPass
//                admin_txt.text = result.toString()
//                function = "+"
//            }
//            2 -> {
//                result = adminUserName - adminPass
//                admin_txt.text = result.toString()
//                function = "-"
//            }
//            3 -> {
//                result = adminUserName * adminPass
//                admin_txt.text = result.toString()
//                function = "*"
//            }
//            4 -> {
//                result = adminUserName / adminPass
//                admin_txt.text = result.toString()
//                function = "/"
//            }
//        }
//             UIManager.showToast("function was:$function \n"+result.toString(), this)
    }
}
