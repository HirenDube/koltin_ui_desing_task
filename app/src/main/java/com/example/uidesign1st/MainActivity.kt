package com.example.uidesign1st

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.uidesign1st.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.newMovies.layoutManager = GridLayoutManager(this,1,GridLayoutManager.HORIZONTAL,false)
        binding.upcoingMovies.layoutManager = GridLayoutManager(this,1,GridLayoutManager.HORIZONTAL,false)

        var newMoviesCardList = listOf<MovieCardDetails>(
            MovieCardDetails("Intersteller","8.7",R.drawable.intersteller_poster),
            MovieCardDetails("It's a Wonderful Life","8.6",R.drawable.wonderful_life),
            MovieCardDetails("Chronicles Of Narnia","7.8",R.drawable.chronicles_of_narnia),
            MovieCardDetails("Avengers : Endgame","8.4",R.drawable.endgame),
        )
        var upcomingMoviesCardList = listOf<MovieCardDetails>(
            MovieCardDetails("Detective Conan: Crossroad in the Ancient Capital","Not Rated Yet",R.drawable.detective_conan),
            MovieCardDetails("Anime Supremacy!","Not Rated Yet",R.drawable.anime_supermacy),
            MovieCardDetails("A Man","Not Rated Yet",R.drawable.a_man),
            MovieCardDetails("Ghost","Not Rated Yet",R.drawable.ghost),
        )

        binding.newMovies.adapter = MovieGridAdapter(this,newMoviesCardList)
        binding.upcoingMovies.adapter = MovieGridAdapter(this,upcomingMoviesCardList)


    }
}