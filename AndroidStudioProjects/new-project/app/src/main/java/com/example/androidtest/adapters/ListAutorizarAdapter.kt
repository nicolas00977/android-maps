package com.example.androidtest.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtest.R
import com.example.androidtest.dataClass.DataLugar

class ListAutorizarAdapter(private var items: Array<DataLugar>): RecyclerView.Adapter<ListAutorizarAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textName: TextView
        val textDes: TextView
        val horario: TextView

        init {
            textName = view.findViewById(R.id.tv_nombre)
            textDes = view.findViewById(R.id.tv_descripcion)
            horario = view.findViewById(R.id.txtHorario)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_autorizar_lugar, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
        val obj = items[position]
        holder.textName.text = obj.name
        holder.textDes.text = obj.des
        holder.horario.text = obj.schedule

    }

    override fun getItemCount(): Int = items.size


}