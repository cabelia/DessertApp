package com.example.submission

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() , View.OnClickListener {
    private lateinit var rvMakanan : RecyclerView
    private lateinit var img : ImageView
    private lateinit var tv_topbar : TextView

    private var list : ArrayList<Dessert> = arrayListOf()

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img = findViewById(R.id.img_about)
        tv_topbar = findViewById(R.id.tv_topbar)
        img.setOnClickListener(this)

        rvMakanan = findViewById(R.id.rv_dessert)
        rvMakanan.setHasFixedSize(true)

        list.addAll(DataDessert.dataList)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvMakanan.layoutManager = LinearLayoutManager(this)
        val adapterDessert = AdapterDessert(list)

        adapterDessert.setOnClickListener { dessert ->
            showSelectedDessert(dessert)
        }
        rvMakanan.adapter = adapterDessert
    }

    private fun showSelectedDessert(dessert : Dessert) {
        val moveIntent = Intent(this@MainActivity , DetailActivity::class.java)
        moveIntent.putExtra(DetailActivity.EXTRA_PHOTO , dessert.photo)
        moveIntent.putExtra(DetailActivity.EXTRA_NAMA , dessert.nama)
        moveIntent.putExtra(DetailActivity.EXTRA_HARGA , dessert.tvharga)
        moveIntent.putExtra(DetailActivity.EXTRA_DETAIL , dessert.detail)
        moveIntent.putExtra(DetailActivity.EXTRA_STOCK , dessert.tvstock)
        moveIntent.putExtra(DetailActivity.EXTRA_EPX , dessert.expired)
        moveIntent.putExtra(DetailActivity.EXTRA_NOTE , dessert.tvnote)
        startActivity(moveIntent)
    }

    override fun onClick(v : View?) {
        when (v?.id) {
            R.id.img_about -> {
                val topbar = Intent(this@MainActivity , AboutActivity::class.java)
                startActivity(topbar)
            }
        }
    }
}
