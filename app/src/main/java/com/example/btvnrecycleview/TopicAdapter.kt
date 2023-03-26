package com.example.btvnrecycleview

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TopicAdapter(val listchude: MutableList<Topic>) :
    RecyclerView.Adapter<TopicAdapter.ChudeViewHolder>() {
    class ChudeViewHolder : RecyclerView.ViewHolder {
        val txchude: TextView

        constructor(view: View) : super(view) {
            txchude = view.findViewById(R.id.tv_chudetruyen)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChudeViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_toppic, parent, false)
        return ChudeViewHolder(v)
    }

    override fun getItemCount(): Int {
        return listchude.size
    }

    override fun onBindViewHolder(holder: ChudeViewHolder, position: Int) {
        val data = listchude[position]
        val chudetruyen = holder.itemView.findViewById<TextView>(R.id.tv_chudetruyen)
        chudetruyen.text = data.topicname
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, StoresTopicActivity::class.java)

            intent.putExtra("Topicid",listchude[position].id)
            holder.itemView.context.startActivity(intent)
            notifyItemChanged(position)
        }
    }

}


