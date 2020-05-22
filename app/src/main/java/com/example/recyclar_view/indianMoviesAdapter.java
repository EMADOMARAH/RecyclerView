package com.example.recyclar_view;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class indianMoviesAdapter extends RecyclerView.Adapter<indianMoviesAdapter.IndianMoviesHolder> {

    List<IndianMovies> moviesList;
    public indianMoviesAdapter(List<IndianMovies> moviesList){
        this.moviesList=moviesList;
    }



    @NonNull
    @Override
    public IndianMoviesHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View row = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup,false);
        IndianMoviesHolder holder = new IndianMoviesHolder(row);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final IndianMoviesHolder viewHolder, final int i) {

        final IndianMovies movies = moviesList.get(i);
        viewHolder.movietitle.setText(movies.movieName);
        viewHolder.movierate.setText(movies.movieRate);
        viewHolder.moviedisc.setText(movies.movieStory);
        viewHolder.poster.setImageResource(movies.posterImage);
      /*  viewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),SecondActivity.class);
                intent.putExtra("num",movies.movieName);
                intent.putExtra("rate",movies.movieRate);
                intent.putExtra("story",movies.movieStory);
                intent.putExtra("img",movies.posterImage);
                v.getContext().startActivity(intent);
            }
        });*/


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class IndianMoviesHolder extends RecyclerView.ViewHolder {
        TextView movietitle,movierate,moviedisc;
        ImageView poster;
        LinearLayout linearLayout;


        public IndianMoviesHolder(@NonNull View itemView) {
            super(itemView);

            moviedisc = itemView.findViewById(R.id.moviedescTV);
            movierate = itemView.findViewById(R.id.movieratTV);
            movietitle = itemView.findViewById(R.id.movietitleTV);
            poster = itemView.findViewById(R.id.movieposteIMG);
            linearLayout = itemView.findViewById(R.id.ll);
        }
    }
}


