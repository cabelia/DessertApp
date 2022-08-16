package com.example.submission

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val actionBarTitle = getString(R.string.about_me)
        setActionBar(actionBarTitle)
    }

    private fun setActionBar(title : String) {
        supportActionBar?.apply {
            this.title = title
            setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onSupportNavigateUp() : Boolean {
        onBackPressed()
        return true
    }
}