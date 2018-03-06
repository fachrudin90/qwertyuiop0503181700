package com.piramidsoft.polisiku.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.piramidsoft.polisiku.Fragments.DetailVideoHumas;
import com.piramidsoft.polisiku.ItemClickListener;
import com.piramidsoft.polisiku.Model.ModelVideo;
import com.piramidsoft.polisiku.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoHolder> {

    private ArrayList<ModelVideo> arrayList;
    private Context context;

    public VideoAdapter(ArrayList<ModelVideo> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public VideoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list_video, parent, false);
        return new VideoHolder(view);
    }

    @Override
    public void onBindViewHolder(VideoHolder holder, int position) {
        holder.ImgVideo.setImageResource(arrayList.get(position).getVideo());
        holder.etTitle.setText(arrayList.get(position).getTitle());
        holder.etOperator.setText(arrayList.get(position).getReporter());
        holder.etBerita.setText(arrayList.get(position).getBerita());
        holder.etWaktu.setText(arrayList.get(position).getWaktu());
        holder.etViewers.setText(arrayList.get(position).getViewers());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                Intent intent = new Intent(context, DetailVideoHumas.class);
                intent.putExtra("title", arrayList.get(position).getTitle());
                intent.putExtra("news", arrayList.get(position).getBerita());
                intent.putExtra("time", arrayList.get(position).getWaktu());
                intent.putExtra("viewers", arrayList.get(position).getViewers());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class VideoHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.ImgVideo)
        ImageView ImgVideo;
        @BindView(R.id.etTitle)
        TextView etTitle;
        @BindView(R.id.etOperator)
        TextView etOperator;
        @BindView(R.id.etBerita)
        TextView etBerita;
        @BindView(R.id.etWaktu)
        TextView etWaktu;
        @BindView(R.id.etViewers)
        TextView etViewers;
        private ItemClickListener itemClickListener;

        public void setItemClickListener(ItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;
        }

        public VideoHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            itemClickListener.onClick(v, getAdapterPosition(), false);
        }
    }
}
