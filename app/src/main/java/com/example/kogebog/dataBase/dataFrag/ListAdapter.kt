package com.example.kogebog.dataBase.dataFrag

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.dicerally.R
import com.example.kogebog.dataBase.Food
import com.example.kogebog.homeOption.ForretFragment
import kotlinx.android.synthetic.main.custom_row.view.*

class ListAdapter: RecyclerView.Adapter<ListAdapter.MyViewHolder>() {
    private var foodList = emptyList<Food>()

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_row, parent, false))
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = foodList[position]
        holder.itemView.titel_txt.text = currentItem.FoodTitle

        holder.itemView.rowLayout.setOnClickListener {



        }

    }

    fun setData(food: List<Food>){
        this.foodList = food
        notifyDataSetChanged()
    }




}