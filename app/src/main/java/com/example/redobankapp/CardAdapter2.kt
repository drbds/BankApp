package com.example.redobankapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter2(
    var iconImage: ArrayList<Int>,
    var iconName: ArrayList<String>,
    var context: Context) : RecyclerView.Adapter<CardAdapter2.CardViewHolder2>() {

class CardViewHolder2 (itemView: View): RecyclerView.ViewHolder(itemView){
    var IconImageView: ImageView =itemView.findViewById(R.id.iconImageView)
    var textViewIconName: TextView =itemView.findViewById(R.id.textViewIconName)

}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder2 {
       val view: View = LayoutInflater.from(parent.context).inflate(R.layout.user_card2,parent,false)
    return CardViewHolder2 (view)
    }

    override fun getItemCount(): Int {
        return iconName.size
    }

    override fun onBindViewHolder(holder: CardViewHolder2, position: Int) {
        holder.textViewIconName.text = iconName.get(position)
        holder.IconImageView.setImageResource(iconImage.get(position))
    }
}