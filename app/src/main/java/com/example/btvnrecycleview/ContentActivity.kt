package com.example.btvnrecycleview

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContentActivity : AppCompatActivity(){
   private lateinit var img : TextView
   private lateinit var tv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content)
        img =findViewById(R.id.tv_namecontent)
        tv = findViewById(R.id.tv_content)

        val contenttruyen = intent.getIntExtra("baby",1)
        val content = Data.itemStories.filter { it.id_truyen == contenttruyen }
        val name = intent.getStringExtra("baba")
        img.setText(name)
        val nam2 = intent.getStringExtra("baba1")
        tv.setText(nam2)

    }
}