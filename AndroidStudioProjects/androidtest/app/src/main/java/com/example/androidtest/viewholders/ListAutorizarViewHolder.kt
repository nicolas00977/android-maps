package com.example.androidtest.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtest.R

class ListAutorizarViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)  {

    val tv_name = itemView.findViewById<TextView>(R.id.tv_nombre)
    val tv_desp = itemView.findViewById<TextView>(R.id.tv_descripcion)

    val tv_horario = itemView.findViewById<TextView>(R.id.txtHorario)

    val btnAutorizar = itemView.findViewById<TextView>(R.id.btn_autorizar)



}