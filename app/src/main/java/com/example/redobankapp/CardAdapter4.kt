package com.example.redobankapp

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter4(
    var partnerName: ArrayList<String>,
    var partnerPercent: ArrayList<Double>,
    var partnerItem: ArrayList<String>,
    var partnerImage: ArrayList<Int>,
    var context: Context) : RecyclerView.Adapter<CardAdapter4.CardViewHolder>() {

class CardViewHolder (ItemView: View): RecyclerView.ViewHolder(ItemView){
    var textViewPartnerName : TextView = itemView.findViewById(R.id.textViewPartnerName)
    var textViewPartnerPercent: TextView = itemView.findViewById(R.id.textViewPartnerPercent)
    var textViewPartnerItem: TextView = itemView.findViewById(R.id.textViewPartnerItem)
    var ImageViewPartnerImage: ImageView = itemView.findViewById(R.id.imageViewPartnerImage)

}

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
   val view:View = LayoutInflater.from(parent.context).inflate(R.layout.user_card4,parent,false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return partnerName.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.textViewPartnerName.text = partnerName.get(position)
        holder.textViewPartnerPercent.text = partnerPercent.get(position).toString()
        holder.textViewPartnerItem.text =  partnerItem.get(position)
        holder.ImageViewPartnerImage.setImageResource(partnerImage.get(position))
    }


}