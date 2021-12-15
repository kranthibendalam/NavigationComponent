package com.example.navigationcomponent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReAdapt : RecyclerView.Adapter<ReAdapt.ViewHolder>() {
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
      var imageView :ImageView
      var firstText: TextView
      var secondText :TextView
      init {
                 imageView =itemView.findViewById(R.id.im11)
                 firstText = itemView.findViewById(R.id.teeX)
                 secondText =itemView.findViewById(R.id.teOn)
      }


    }

    private var name= arrayOf("1.WhatsappMessenger","2.Facebook","3.Amazon","4.Twitter","5.Instagram","6.mxPlayer")
    private var discript = arrayOf("Whatsapp Inc","facebook","amazon","twitter","instagram","mxplayer")
    private var images = intArrayOf(R.drawable.whatsapp,
        R.drawable.facebook,
        R.drawable.amazon,
        R.drawable.twitter,
        R.drawable.download,
        R.drawable.mxplayer)




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReAdapt.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_middle,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReAdapt.ViewHolder, position: Int) {
        holder.firstText.text=name[position]
        holder.secondText.text=discript[position]
        holder.imageView.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return name.size
    }
}