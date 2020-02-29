package com.example.firstkotlinapp.model

import java.util.*

data class SalesModel(
    val storeName: String,
    val date: String,
    val address: String,
    val list: List<Purchases>
)

data class Purchases(
    val number: Int,
    val purchasesName: String,
    val price: Double,
    val discount: Double,
    val count: Double
//    val result: Double = price - discount
)

