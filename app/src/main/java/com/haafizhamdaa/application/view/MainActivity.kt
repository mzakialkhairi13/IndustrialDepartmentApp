 package com.haafizhamdaa.application.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.databinding.DataBindingUtil
import com.haafizhamdaa.application.R
import com.haafizhamdaa.application.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {
     private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.mainFasilitas.setOnClickListener { startActivity(Intent(this,FasilitasActivity::class.java)) }
        binding.mainTracking.setOnClickListener { startActivity(Intent(this,TrackingActivity::class.java)) }
        binding.mainTentangKami.setOnClickListener { startActivity(Intent(this,TentangKamiActivity::class.java)) }
        binding.mainLayananJasa.setOnClickListener { startActivity(Intent(this,LayananJasaActivity::class.java)) }
    }
}