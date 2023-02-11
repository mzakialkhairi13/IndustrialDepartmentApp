package com.haafizhamdaa.application.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.haafizhamdaa.application.R
import com.haafizhamdaa.application.databinding.ActivityDataBinding

class DataActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data)
        val nama= intent.getStringExtra("nama")
        val email = intent.getStringExtra("email")
        val nohp = intent.getStringExtra("nohp")
        val perusahaan = intent.getStringExtra("perusahaan")
        val alamat = intent.getStringExtra("alamat")
        val notelp =  intent.getStringExtra("notelp")
        val nofax= intent.getStringExtra("nofax")
        val bidangusaha = intent.getStringExtra("bidangusaha")
        val pesan = intent.getStringExtra("pesan")
        val jasa = intent.getStringExtra("jasa")

        binding.dNama.text = nama
        binding.dEmail.text = email
        binding.dAlamat.text = alamat
        binding.dJasa.text=jasa
        binding.dNofax.text=nofax
        binding.dNohp.text = nohp
        binding.dNotelp.text = notelp
        binding.dPerusahaan.text = perusahaan
        binding.dBidangusaha.text = bidangusaha
        binding.dPesan.text = pesan
    }
}