package com.example.uidesign1st

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

data class MovieCardDetails(var name:String,var rating : String, var image: Int)


class MovieGridAdapter(var context : Context,var  dataList : List<MovieCardDetails>) : RecyclerView.Adapter<MovieGridAdapter.MovieCardViewHolder>(){
    class MovieCardViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val poster : ImageView = itemView.findViewById(R.id.movie_card_poster)
        val name : TextView = itemView.findViewById(R.id.movie_name)
        val rating : TextView = itemView.findViewById(R.id.rating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieCardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_card_layout,parent,false)
        return MovieCardViewHolder(view)
    }

    override fun getItemCount(): Int {
       return  dataList.size;
    }

    override fun onBindViewHolder(holder: MovieCardViewHolder, position: Int) {
        holder.poster.setImageResource(dataList[position].image)
        holder.name.text = dataList[position].name
        holder.rating.text = dataList[position].rating
        holder.itemView.setOnClickListener {
//            Toast.makeText(context,dataList[position].name,Toast.LENGTH_SHORT).show()
//            var goToDetails : Intent = Intent(MainActivity(),DetailsScreen::class.java);
            var goToDetails : Intent = Intent(context, DetailsScreen::class.java)
            goToDetails.putExtra("name",dataList[position].name)
            goToDetails.putExtra("image",dataList[position].image)
            goToDetails.putExtra("rating",dataList[position].rating)
               context.startActivity(goToDetails)
        }
    }


}