package com.mhpark.listview_second_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 기본 리스트 아이템
//        val list_item = mutableListOf<String>()
//
//        list_item.add("A")
//        list_item.add("B")
//        list_item.add("C")

        // 덩어리로 리스트뷰 아이템 만들어서
        val list_item2 = mutableListOf<ListViewModel>()
        list_item2.add(ListViewModel("a", "b"))
        list_item2.add(ListViewModel("c", "d"))
        list_item2.add(ListViewModel("e", "f"))

        val listview = findViewById<ListView>(R.id.mainListView)

//        val listviewAdapter = ListViewAdapter(list_item)
//        listview.adapter = listviewAdapter

        // 리스트뷰 어댑터에서 String으로 받는다 했는데, Model로 받는다라고 수정
        val listviewAdapter = ListViewAdapter(list_item2)
        listview.adapter = listviewAdapter

        listview.setOnItemClickListener { parent, view, position, id ->

//            Toast.makeText(this, list_item[position], Toast.LENGTH_LONG).show()
            Toast.makeText(this, list_item2[position].text1, Toast.LENGTH_LONG).show()
        }

    }
}