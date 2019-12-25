package com.siroj.trenkur

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.siroj.trenkur.model.ShavingStyle

class ListShavingStyleAdapter(private val listShavingStyle: ArrayList<ShavingStyle>): RecyclerView.Adapter<ListShavingStyleAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_shaving_style, viewGroup, false)
        return ListViewHolder(view)
    }
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val shavingStyle = listShavingStyle[position]
        Glide.with(holder.itemView.context)
            .load(shavingStyle.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvTitle.text = shavingStyle.title
        holder.tvDetail.text = shavingStyle.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listShavingStyle[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listShavingStyle.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.tv_item_title)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: ShavingStyle)
    }
}