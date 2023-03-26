package com.example.btvnrecycleview

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ItemStoryAdapter(val listtruyen : MutableList<ItemStory>) : RecyclerView.Adapter<ItemStoryAdapter.TruyenViewHoler>() {


    class TruyenViewHoler(view :View) : RecyclerView.ViewHolder(view){
        val imgStory :ImageView
        val titlestory :TextView
        val contentStory  : TextView


        init {
            imgStory = view.findViewById(R.id.image)
            titlestory = view.findViewById(R.id.tv_title)
            contentStory = view.findViewById(R.id.tv_content)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TruyenViewHoler {
       val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_truyen,parent,false)
        return TruyenViewHoler(view)
    }

    override fun getItemCount(): Int {
        return listtruyen.size
    }

    override fun onBindViewHolder(holder: TruyenViewHoler, position: Int) {

        val data = listtruyen[position]
        val tvtitle = holder.itemView.findViewById<TextView>(R.id.tv_title)
        val tvcontent = holder.itemView.findViewById<TextView>(R.id.tv_content)
        tvtitle.text = data.tv_title
        tvcontent.text =data.tv_content
        Glide.with(holder.itemView.context).load(listtruyen[position]).into(holder.imgStory)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, ContentActivity::class.java)
            intent.putExtra("baby",listtruyen[position].id_truyen)
            intent.putExtra("baba",listtruyen[position].tv_title)
            intent.putExtra("baba1",listtruyen[position].tv_content)
            holder.itemView.context.startActivity(intent)
            notifyItemChanged(position)

        }

    }

}