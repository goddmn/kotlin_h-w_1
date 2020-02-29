package com.example.firstkotlinapp.utils

import android.content.Context
import android.widget.Toast

class UIManager {

    companion object {
        fun showToast(message: String, context: Context) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
        fun showShortToast(message: String, context: Context) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }

}