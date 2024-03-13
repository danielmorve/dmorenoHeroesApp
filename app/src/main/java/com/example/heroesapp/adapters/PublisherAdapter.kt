package com.example.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.models.Publisher
import com.squareup.picasso.Picasso

class PublisherAdapter(val publishers:List<Publisher>, val onClick: (Publisher) ->Unit): RecyclerView.Adapter<PublisherAdapter.publisherViewHolder>() {

    class publisherViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val publisherImage :ImageView = itemView.findViewById(R.id.publisher_image_view)
        val publisherName :TextView = itemView.findViewById(R.id.publisher_name_title)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): publisherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publisher_item,parent,false)
        return publisherViewHolder(view)
    }

    override fun getItemCount(): Int {
        return publishers.size
    }

    override fun onBindViewHolder(holder: publisherViewHolder, position: Int) {
        val publisher = publishers[position]
        holder.publisherName.text = publisher.name
        Picasso.get().load(publisher.image).into(holder.publisherImage)
        holder.itemView.setOnClickListener {
            onClick(publisher)
        }
    }
}