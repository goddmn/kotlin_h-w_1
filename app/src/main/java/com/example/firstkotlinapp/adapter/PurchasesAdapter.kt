package com.example.firstkotlinapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.firstkotlinapp.R
import com.example.firstkotlinapp.model.Purchases
import com.example.firstkotlinapp.model.SalesModel
import kotlinx.android.synthetic.main.item_purchases.view.*

class PurchasesAdapter(val model: SalesModel) : RecyclerView.Adapter<PurchasesAdapter.ViewHolder>(){

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(model.list[position], model.list.size)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(purchases: Purchases, size: Int) {
            itemView.item_id.text = purchases.number.toString()
            itemView.item_name.text = purchases.purchasesName
            itemView.item_amount.text = size.toString()
            itemView.item_discount.text = purchases.discount.toString()
            itemView.item_price.text = purchases.price.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_purchases, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return model.list.size
    }

}