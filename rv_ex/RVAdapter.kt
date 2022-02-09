package com.mhpark.rc_ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RVAdapter (val items : MutableList<String>) : RecyclerView.Adapter<RVAdapter.ViewHolder>() {

    // item 불러오기
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)

        return ViewHolder(view)
    }

    // 아이템 클릭하기 위해서 추가해줘야함 #1
    interface ItemClick {
        fun onClick (view : View, position: Int)
    }
    var itemCLick : ItemClick? = null

    override fun onBindViewHolder(holder: RVAdapter.ViewHolder, position: Int) {
        // 아이템 클릭하기 위해서 추가해줘야함 #2
        if (itemCLick != null) {
            holder.itemView.setOnClickListener { v->
                itemCLick?.onClick(v, position)
            }
        }

        holder.bindItems(items[position])
    }

    // 전체 리사이클러뷰의 개수
    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems (item : String) {
            val rv_text = itemView.findViewById<TextView>(R.id.rvItem)
            rv_text.text = item
        }
    }
}