package com.example.kogebog.Adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.dicerally.R

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private  var titles = arrayOf("title 1 ","title 2 ","title 3 ","title 4 ","title 5 ","title 6 ","title 7 ","title 8 ","title 9 ")
    private var details = arrayOf("This is detail 1","This is detail 2","This is detail 3","This is detail 4","This is detail 5",
        "This is detail 6","This is detail 7","This is detail 8","This is detail 9",)
    private  var images = intArrayOf(R.drawable.drunk, R.drawable.drunk, R.drawable.drunk,R.drawable.drunk,
        R.drawable.drunk, R.drawable.drunk,R.drawable.drunk, R.drawable.drunk, R.drawable.drunk)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)

        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])

    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner  class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)

            itemView.setOnClickListener{
                val position: Int = adapterPosition

                Toast.makeText(itemView.context, "you clicked on ${titles[position]}", Toast.LENGTH_LONG).show()

            }

        }
    }
}