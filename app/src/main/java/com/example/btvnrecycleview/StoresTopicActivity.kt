package com.example.btvnrecycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StoresTopicActivity : AppCompatActivity() {
    private lateinit var rctruyen: RecyclerView
    private lateinit var adapter: ItemStoryAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_maintruyen)

       val topicid =  intent.getIntExtra("Topicid",1)
       val truyen = Data.itemStories.filter { it.id_chude == topicid }.toMutableList()

        rctruyen = findViewById(R.id.rc_truyen)
        adapter = ItemStoryAdapter(truyen)
        rctruyen.adapter = adapter
        rctruyen.layoutManager = LinearLayoutManager(this)
        adapter.notifyDataSetChanged()




    }
}