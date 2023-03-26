package com.example.btvnrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TopicActivity : AppCompatActivity() {
    private lateinit var rcChude: RecyclerView
    private lateinit var adapter: TopicAdapter
    private val chude = Data.topics


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toppic_main)
        rcChude = findViewById(R.id.rc_theloaitruyen)
        adapter = TopicAdapter(chude)
        rcChude.adapter = adapter
        rcChude.layoutManager = LinearLayoutManager(this)
//        initdata()
        adapter.notifyDataSetChanged()
    }
}