package com.example.submission

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_NAMA = "extra_nama"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_HARGA = "extra_harga"
        const val EXTRA_STOCK = "extra_stock"
        const val EXTRA_EPX = "extra_exp"
        const val EXTRA_NOTE = "extra_note"
    }

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        supportActionBar?.apply {
            title = intent.getStringExtra(EXTRA_NAMA)
            setDisplayHomeAsUpEnabled(true)
        }

        val photoDessert : ImageView = findViewById(R.id.img_item_photo)
        val namaDessert : TextView = findViewById(R.id.tv_item_nama)
        val detailDessert : TextView = findViewById(R.id.tv_item_detail)
        val hargaDessert : TextView = findViewById(R.id.tvharga)
        val stockDessert : TextView = findViewById(R.id.tvstock)
        val expired : TextView = findViewById(R.id.tvexpired)
        val noteDessert : TextView = findViewById(R.id.tvnote)

        val bundle : Bundle? = intent.extras
        val photo : Int = bundle!!.getInt(EXTRA_PHOTO)
        val nama = intent.getStringExtra(EXTRA_NAMA)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val harga = intent.getStringExtra(EXTRA_HARGA)
        val stock = intent.getStringExtra(EXTRA_STOCK)
        val exp = intent.getStringExtra(EXTRA_EPX)
        val note = intent.getStringExtra((EXTRA_NOTE))

        photoDessert.setImageResource(photo)
        namaDessert.text = "$nama"
        detailDessert.text = "$detail"
        hargaDessert.text = "$harga"
        stockDessert.text = "$stock"
        expired.text = "$exp hari"
        noteDessert.text = "$note"

        val buyButton : Button = findViewById(R.id.btnBeli)
        buyButton.setOnClickListener {
            Intent(Intent.ACTION_DIAL , Uri.parse("tel:0812345678")).also { intent ->
                startActivity(intent)
            }
        }
    }

    override fun onSupportNavigateUp() : Boolean {
        onBackPressed()
        return true
    }
}