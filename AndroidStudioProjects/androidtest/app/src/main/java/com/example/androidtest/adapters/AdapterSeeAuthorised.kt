

package com.example.androidtest.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtest.R
import com.example.androidtest.dataClass.DataLugar


class AdapterSeeAuthorised(private val arrayList: List<DataLugar>): RecyclerView.Adapter<AdapterSeeAuthorised.ViewHolderSeeAuthorised>() {

    class ViewHolderSeeAuthorised(itemView: View): RecyclerView.ViewHolder(itemView) {
        val state : TextView = itemView.findViewById(R.id.tv_state)
        val moderatorName: TextView = itemView.findViewById(R.id.tv_moderator)
        val name: TextView = itemView.findViewById(R.id.tv_nombre)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderSeeAuthorised {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_see_authorised, parent, false)
        return ViewHolderSeeAuthorised(view)
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: ViewHolderSeeAuthorised, position: Int) {

        val lugar = arrayList[position]

        holder.state.text = lugar.isAuthorised.toString()
        holder.name.text = lugar.name
        holder.moderatorName.text = lugar.moderator.name
    }
}