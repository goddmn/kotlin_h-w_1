package com.example.firstkotlinapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.firstkotlinapp.R
import com.example.firstkotlinapp.model.Purchases
import com.example.firstkotlinapp.model.SalesModel
import kotlinx.android.synthetic.main.activity_second.view.*

class PurchasesAdapter(val model: ArrayList<SalesModel>, val items: ArrayList<Purchases>) : RecyclerView.Adapter<PurchasesAdapter.ViewHolder>(){

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val items: Purchases = items[position]
        val sale: SalesModel = model[position]

        holder?.saleAddressTitle?.text = sale.address
        holder?.date?.text = sale.date
        holder?.itemName?.text = items.purchasesName
        holder?.itemCount?.text = items.count.toString()
        holder?.itemId?.text = items.number.toString()
        holder?.itemDiscount.text = items.discount.toString()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val saleAddressTitle = itemView.findViewById<View>(R.id.sale_address) as TextView
        val date = itemView.findViewById<View>(R.id.sale_date) as TextView
        val discount = itemView.findViewById<View>(R.id.sale_discount) as TextView

        val itemId = itemView.findViewById<View>(R.id.item_id) as TextView
        val itemName = itemView.findViewById<View>(R.id.item_name) as TextView
        val itemCount = itemView.findViewById<View>(R.id.item_count) as TextView
        val itemDiscount = itemView.findViewById<View>(R.id.item_discount) as TextView
        val itemTotal = itemView.findViewById<View>(R.id.item_total) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_purchases, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return model.size
    }

}