package com.example.androidtest.adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtest.R
import com.example.androidtest.dataClass.DataLugar

class MyAdapter(private val arrayList: List<DataLugar>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val name : TextView = itemView.findViewById(R.id.tv_nombre)
        val desp : TextView = itemView.findViewById(R.id.tv_descripcion)
        val horario : TextView = itemView.findViewById(R.id.txtHorario)
        val btnAutorizar : Button = itemView.findViewById(R.id.btn_autorizar)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_autorizar_lugar, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val lugar = arrayList[position]

        // aqui debe estar mal
        holder.name.text = lugar.name
        holder.desp.text = lugar.des
        holder.horario.text = lugar.schedule

        if(lugar.isAuthorised){
            holder.btnAutorizar.isEnabled = false
        }

        holder.btnAutorizar.setOnClickListener {
            arrayList[position].isAuthorised = true
            holder.btnAutorizar.isEnabled = false
        }


    }

    override fun getItemCount(): Int = arrayList.size


}