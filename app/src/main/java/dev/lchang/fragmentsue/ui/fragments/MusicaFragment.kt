package dev.lchang.fragmentsue.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.lchang.fragmentsue.R
import dev.lchang.fragmentsue.ui.adapter.SongAdapter
import dev.lchang.fragmentsue.ui.model.Song

class MusicaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View =  inflater.inflate(R.layout.fragment_musica, container, false)
        val rvMusica: RecyclerView = view.findViewById(R.id.rvMusica)
        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        //(rvMusica.adapter = SongAdapter(listSongLP())
        return view
    }

    private fun listSongLP(): List<Song>{
        val lstSong: ArrayList<Song> = ArrayList()

        lstSong.add(Song(1,R.drawable.intheend,"In the end","Hybrid Theory","20,000","3:36"))
        lstSong.add(Song(2,R.drawable.numb,"Numb","Meteora","18,000","3:05"))
        lstSong.add(Song(3,R.drawable.whativedone,"What I've done","Minutes to Midnight","19,000","3:25"))
        lstSong.add(Song(4,R.drawable.onestepcloser,"One Step Close","Hybrid Theory","14,000","2:37"))
        lstSong.add(Song(5,R.drawable.castleofglass,"Castle of Glass","Living Thins","5,000","3:47"))

        // Holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        //asdasdasdasdasd
        //asdasdasdasdasd



        return lstSong
    }


}