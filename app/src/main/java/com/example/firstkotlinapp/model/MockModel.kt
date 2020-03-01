package com.example.firstkotlinapp.model

import java.util.*

data class SalesModel(
    val storeName: String,
    val date: Date,
    val list: List<Purchases>,
    val amount: Int = list.size
)

data class Purchases(
    val number: Int,
    val purchasesName: String,
    val price: Double,
    val discount: Double,
    val result: Double = price - discount
)

