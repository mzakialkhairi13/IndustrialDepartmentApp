package com.haafizhamdaa.application.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haafizhamdaa.application.R

class TentangKamiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(R.string.tentang_kami)
        setContentView(R.layout.activity_tentang_kami)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}