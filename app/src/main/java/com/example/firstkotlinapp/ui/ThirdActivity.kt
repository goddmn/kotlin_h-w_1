package com.example.firstkotlinapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.firstkotlinapp.R
import com.example.firstkotlinapp.adapter.PurchasesAdapter
import com.example.firstkotlinapp.model.Purchases
import com.example.firstkotlinapp.model.SalesModel
import kotlinx.android.synthetic.main.activity_third.*
import java.util.*

class ThirdActivity : AppCompatActivity() {
    lateinit var adapter: PurchasesAdapter
    val mockModel = createMock()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        adapter = PurchasesAdapter(mockModel)
        recycler_view.adapter = adapter
        recycler_view.layoutManager = LinearLayoutManager(this)
        date.text = mockModel.date.toString()
        total.text = "${totalPrice(mockModel.list)} Сом."
        discount_sum.text = "${totalDiscount(mockModel.list)} Сом."
        address.text = mockModel.storeName
    }

    private fun createMock(): SalesModel {
        return SalesModel(
            "Боконбаева-Пр.Мира", Date(), mutableListOf(
                Purchases(1, "Напиток соевый 1", 71.0, 6.0),
                Purchases(2, "Напиток соевый 2", 52.0, 5.5),
                Purchases(3, "Напиток соевый 3", 41.0, 4.0),
                Purchases(4, "Напиток соевый 4", 12.0, 3.0)
            )
        )
    }
    private fun totalDiscount(list: List<Purchases>): Double {
        var double = 0.0
        for (element in list) {
            double += element.discount
        }
        return double
    }
    private fun totalPrice(list: List<Purchases>): Double {
        var double = 0.0
        for (element in list) {
            double += element.price
        }
        return double
    }
}
