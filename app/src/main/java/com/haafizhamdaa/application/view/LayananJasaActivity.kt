package com.haafizhamdaa.application.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haafizhamdaa.application.R

class LayananJasaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(R.string.layanan_jasa)
        setContentView(R.layout.activity_layanan_jasa)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}