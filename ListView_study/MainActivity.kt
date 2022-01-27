package com.mhpark.listview_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val list_item = mutableListOf<String>()
        val list_itme2 = mutableListOf<ListViewModel>()

//        list_item.add("A")
//        list_item.add("B")
//        list_item.add("C")

        list_itme2.add(ListViewModel("a", "b"))
        list_itme2.add(ListViewModel("c", "d"))
        list_itme2.add(ListViewModel("e", "f"))

        val listview = findViewById<ListView>(R.id.mainListview)

//        val listAdapter = ListViewAdapter(list_item)
        val listAdapter = ListViewAdapter(list_itme2)

        listview.adapter = listAdapter
    }
}