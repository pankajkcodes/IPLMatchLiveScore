package com.simplifiededtech.iplmatchlivescore.match;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.simplifiededtech.iplmatchlivescore.R;

import java.util.ArrayList;

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder> {

    ArrayList<ScheduleModel> list;
    Context context;

    public ScheduleAdapter(ArrayList<ScheduleModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull

    @Override
    public ScheduleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.schedule_item, parent, false);
        return new ScheduleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ScheduleAdapter.ScheduleViewHolder holder, int position) {
        ScheduleModel model = list.get(position);
        Glide.with(this.context)
                .load(model.getImgUrl1())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.image1);
        Glide.with(this.context)
                .load(model.imgUrl2)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.image2);
        holder.team1.setText(model.getTeam1());
        holder.team2.setText(model.getTeam2());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ScheduleViewHolder extends RecyclerView.ViewHolder {
        private ImageView image1;
        private ImageView image2;
        private TextView team1;
        private TextView team2;

        public ScheduleViewHolder(@NonNull View itemView) {
            super(itemView);
            image1 = itemView.findViewById(R.id.schedule_img1);
            image2 = itemView.findViewById(R.id.schedule_img2);
            team1 = itemView.findViewById(R.id.team1);
            team2 = itemView.findViewById(R.id.team2);

        }
    }
}
