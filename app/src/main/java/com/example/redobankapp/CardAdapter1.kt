package com.example.redobankapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter1(
    var cardNameList: ArrayList<String>,
    var amount: ArrayList<Double>,
    var context: Context) : RecyclerView.Adapter<CardAdapter1.CardViewHolder1>() {

    class CardViewHolder1(itemView: View) : RecyclerView.ViewHolder(itemView){

        var textViewCardNameList: TextView = itemView.findViewById(R.id.textViewCardNameList)
        var textViewAmount: TextView = itemView.findViewById(R.id.textViewAmount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder1 {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.user_card,parent,false)
        return CardViewHolder1(view)
    }

    override fun getItemCount(): Int {
return cardNameList.size
    }

    override fun onBindViewHolder(holder: CardViewHolder1, position: Int) {
holder.textViewCardNameList.text = cardNameList[position]
        holder.textViewAmount.text = amount[position].toString()

    }
}

