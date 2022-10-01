package dev.lchang.fragmentsue.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.lchang.fragmentsue.R

import dev.lchang.fragmentsue.ui.model.Song

class SongAdapter(private var lstSong: List<Song>)
    : RecyclerView.Adapter<SongAdapter.ViewHolder>()
{
        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            val ivSong: ImageView = itemView.findViewById(R.id.ivSong)
            val tvAlbum: TextView = itemView.findViewById(R.id.tvAlbum)
            val tvSong: TextView = itemView.findViewById(R.id.tvSong)
            val tvNumberPLays: TextView = itemView.findViewById(R.id.tvNumberPlays)
            val tvSongtime: TextView = itemView.findViewById(R.id.tvSongTime)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_music,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemSong = lstSong[position]
        holder.tvAlbum.text = itemSong.album
        holder.tvSong.text = itemSong.songName
        holder.tvNumberPLays.text = itemSong.numberPlays
        holder.tvSongtime.text = itemSong.songTime
        holder.ivSong.setImageResource(itemSong.image)

    }

    override fun getItemCount(): Int {
        return lstSong.size
    }
}