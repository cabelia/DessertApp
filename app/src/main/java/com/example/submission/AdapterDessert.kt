package com.example.submission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AdapterDessert(private val listDessert : ArrayList<Dessert>) :
    RecyclerView.Adapter<AdapterDessert.ListViewHolder>() {

    private var onItemClickListener : ((Dessert) -> Unit)? = null
    fun setOnClickListener(listener : (Dessert) -> Unit) {
        onItemClickListener = listener
    }

    override fun onCreateViewHolder(viewGroup : ViewGroup , i : Int) : ListViewHolder {
        val view : View =
            LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.dessert_saya , viewGroup , false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder : ListViewHolder , position : Int) {
        val dessert = listDessert[position]
        holder.bind(dessert , onItemClickListener)
    }

    override fun getItemCount() : Int {
        return listDessert.size
    }

    inner class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        private val tvNama : TextView = itemView.findViewById(R.id.tv_item_nama)
        private val tvDetail : TextView = itemView.findViewById(R.id.tv_item_detail)
        private val photo : ImageView = itemView.findViewById(R.id.img_item_photo)
        private val tvHarga : TextView = itemView.findViewById(R.id.tvharga)

        fun bind(dessert : Dessert , clickListener : ((Dessert) -> Unit)?) {
            Glide.with(itemView.context)
                .load(dessert.photo)
                .apply(RequestOptions().override(60 , 60))
                .into(photo)

            tvNama.text = dessert.nama
            tvDetail.text = dessert.detail
            tvHarga.text = dessert.tvharga

            itemView.setOnClickListener { clickListener?.let { it(dessert) } }
        }
    }
}
