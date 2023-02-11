package com.haafizhamdaa.application.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haafizhamdaa.application.R

class FasilitasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(R.string.fasilitas)
        setContentView(R.layout.activity_fasilitas)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}