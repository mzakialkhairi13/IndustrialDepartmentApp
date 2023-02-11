package com.haafizhamdaa.application.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.haafizhamdaa.application.model.SpinnerItem

class SpinnerAdapter(private val context: Context, private val items: List<SpinnerItem>) :
    ArrayAdapter<SpinnerItem>(context, android.R.layout.simple_spinner_item, items) {

    init {
        setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = super.getView(position, convertView, parent)
        val text = view as TextView
        text.text = items[position].text
        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = super.getDropDownView(position, convertView, parent)
        val text = view as TextView
        text.text = items[position].text
        return view
    }
}
