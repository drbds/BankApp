package com.example.redobankapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.redobankapp.R.id

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView1: RecyclerView
        var cardNameList = ArrayList<String>()
        var amount = ArrayList<Double>()

    lateinit var adapter1: CardAdapter1

    lateinit var recyclerView2: RecyclerView
        var iconImage = ArrayList<Int>()
        var iconName = ArrayList<String>()

    lateinit var adapter2: CardAdapter2

    lateinit var recyclerView3: RecyclerView
        var offerName = ArrayList<String>()
        var offerAmount = ArrayList<Int>()
        var specialIcon = ArrayList<Int>()

    lateinit var adapter3: CardAdapter3
//
    lateinit var recyclerView4: RecyclerView
        var partnerName = ArrayList<String>()
        var partnerPercent = ArrayList<Double>()
        var partnerItem = ArrayList<String>()
        var partnerImage = ArrayList<Int>()

    lateinit var adapter4: CardAdapter4

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        recyclerView1 = findViewById(id.recyclerView1)

        recyclerView1.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)

            cardNameList.add("Darot")
            cardNameList.add("Ify")
            cardNameList.add("Edwin")

            amount.add(23481000.00)
            amount.add(63481000.00)
            amount.add(163481000.00)

        adapter1 = CardAdapter1(cardNameList,amount,this@MainActivity)

        recyclerView1.adapter = adapter1


        recyclerView2 = findViewById(id.recyclerView2)
        recyclerView2.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)

            iconImage.add(R.drawable.icon)
            iconImage.add(R.drawable.smartphone)
            iconImage.add(R.drawable.home_icon)
            iconImage.add(R.drawable.qr_code)

            iconName.add("Transfer")
            iconName.add("Mobile")
            iconName.add("Utilities")
            iconName.add("QR Code")

        adapter2 = CardAdapter2(iconImage,iconName,this@MainActivity)

        recyclerView2.adapter = adapter2

        recyclerView3 = findViewById(id.recyclerView3)
        recyclerView3.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            offerName.add("Cash loan")
            offerName.add("Credit card")

            offerAmount.add(234810)
            offerAmount.add(234810)

            specialIcon.add(R.drawable.dollar_sign)
            specialIcon.add(R.drawable.credit_card)

        adapter3 = CardAdapter3(offerName,offerAmount,specialIcon,this@MainActivity)

        recyclerView3.adapter = adapter3

        recyclerView4 = findViewById(id.recyclerView4)
        recyclerView4.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            partnerName.add("AliExpress")
            partnerName.add("AviaSales")
            partnerName.add("Bookgram")

            partnerPercent.add(4.0)
            partnerPercent.add(4.4)
            partnerPercent.add(4.0)

            partnerItem.add("Clothes and shoes")
            partnerItem.add("Tickets and travels")
            partnerItem.add("Booking and lounge")

            partnerImage.add(R.drawable.red_bag)
            partnerImage.add(R.drawable.blue_bag)
            partnerImage.add(R.drawable.red_bag)

        adapter4 = CardAdapter4(partnerName,partnerPercent,partnerItem,partnerImage,this@MainActivity)

        recyclerView4.adapter = adapter4



        }
    }



