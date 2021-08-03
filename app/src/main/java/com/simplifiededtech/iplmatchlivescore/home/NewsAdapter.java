package com.simplifiededtech.iplmatchlivescore.home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.simplifiededtech.iplmatchlivescore.R;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    ArrayList<NewsModel> list;
    Context context;

    public NewsAdapter(ArrayList<NewsModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.news_item, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.NewsViewHolder holder, int position) {
        NewsModel model = list.get(position);
        holder.newsTitle.setText(model.getTitle());
        Glide.with(this.context)
                .load(model.getImgUrl())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.newsImg);
        holder.newsLayout.setOnClickListener((v -> {
//            Intent intent = new Intent()

        }));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {

        TextView newsTitle;
        ImageView newsImg;
        LinearLayout newsLayout;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            newsTitle = itemView.findViewById(R.id.news_title);
            newsImg = itemView.findViewById(R.id.news_img);
            newsLayout = itemView.findViewById(R.id.news_layout);


        }
    }
}