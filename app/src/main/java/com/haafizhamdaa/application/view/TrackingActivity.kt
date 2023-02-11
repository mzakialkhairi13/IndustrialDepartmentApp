package com.haafizhamdaa.application.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.haafizhamdaa.application.R
import com.haafizhamdaa.application.databinding.ActivityTrackingBinding

class TrackingActivity : AppCompatActivity() {

    private lateinit var binding : ActivityTrackingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(R.string.tracking)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_tracking)
        var jasa : String = ""
        val items = arrayOf("Pengujian", "Kalibrasi", "Serifikasi Produk (LSPro)","Pelatihan","Konsultasi dan Supervisi")
        val spinner = binding.rJasa
        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedItem = items[position]
                jasa = selectedItem
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                jasa = "-"
            }
        }
        binding.rBtn.setOnClickListener {

            val intent = Intent(this,DataActivity::class.java).apply {
                putExtra("nama", binding.rNama.text.toString())
                putExtra("email", binding.rEmail.text.toString())
                putExtra("nohp",binding.rHp.text.toString())
                putExtra("perusahaan",binding.rPerusahaan.text.toString())
                putExtra("alamat",binding.rAlamat.text.toString())
                putExtra("notelp",binding.rTelp.text.toString())
                putExtra("nofax",binding.rFax.text.toString())
                putExtra("bidangusaha",binding.rBidangusaha.text.toString())
                putExtra("pesan",binding.rPesan.text.toString())
                putExtra("jasa", jasa)
            }
            startActivity(intent)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}