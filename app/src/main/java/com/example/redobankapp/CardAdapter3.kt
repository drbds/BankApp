package com.example.redobankapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter3(
    var offerName: ArrayList<String>,
    var offerAmount: ArrayList<Int>,
    var specialIcon: ArrayList<Int>,
    var context: Context) : RecyclerView.Adapter<CardAdapter3.CardViewHolder3>() {

    class CardViewHolder3 (ItemView:View): RecyclerView.ViewHolder(ItemView){
        var textViewOfferName: TextView = itemView.findViewById(R.id.textViewOfferName)
        var textViewOfferAmount: TextView = itemView.findViewById(R.id.textViewOfferAmount)
        var ImageViewSpecialIcon: ImageView = itemView.findViewById(R.id.ImageViewSpecialIcon)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder3 {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.user_card3,parent,false)
        return CardViewHolder3(view)
    }

    override fun getItemCount(): Int {
        return offerName.size
    }

    override fun onBindViewHolder(holder: CardViewHolder3, position: Int) {
        holder.textViewOfferName.text = offerName.get(position)
        holder.textViewOfferAmount.text = offerAmount.get(position).toString()
        holder.ImageViewSpecialIcon.setImageResource(specialIcon.get(position))
    }

}