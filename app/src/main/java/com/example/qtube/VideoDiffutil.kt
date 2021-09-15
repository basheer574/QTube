package com.example.qtube

import androidx.recyclerview.widget.DiffUtil
import com.example.qtube.data.domain.VideoDetails

class VideoDiffutil( val oldList:List<VideoDetails>, val newList:List<VideoDetails>): DiffUtil.Callback(){
    override fun getOldListSize()=oldList.size
    override fun getNewListSize()=newList.size


    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return (
                oldList[oldItemPosition].title==newList[newItemPosition].title
                        && oldList[oldItemPosition].duration==newList[newItemPosition].duration
                )
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return true
    }

}