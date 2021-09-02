package com.solarexsoft.roomwordsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by houruhou on 2021/9/2/7:43 PM
 * Desc:
 */
class WordViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    companion object {
        fun create(parent: ViewGroup): WordViewHolder {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
            return WordViewHolder(view)
        }
    }
    private val wordItemView: TextView = itemView.findViewById(R.id.textView)

    fun bind(text: String?) {
        wordItemView.text = text
    }
}