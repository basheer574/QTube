package com.example.qtube

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.qtube.data.DataManager
import com.example.qtube.data.domain.VideoDetails
import com.example.qtube.databinding.ItemVideoBinding

class VideoAdapter(private var list: List<VideoDetails>,val listener:VideoIntectionListener):RecyclerView.Adapter<VideoAdapter.VideoHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoHolder {
       val view= LayoutInflater.from(parent.context).inflate(R.layout.item_video,parent,false)
      return VideoHolder(view)
    }

    override fun onBindViewHolder(holder: VideoHolder, position: Int) {
      val currentVideo = list[position]
        holder.apply {
            binding?.title.text = currentVideo.title
            }
        }

    override fun getItemCount(): Int = list.size

    class VideoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemVideoBinding.bind(itemView)
    }
}