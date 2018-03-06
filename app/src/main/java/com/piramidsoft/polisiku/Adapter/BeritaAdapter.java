package com.piramidsoft.polisiku.Adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.piramidsoft.polisiku.ItemClickListener;
import com.piramidsoft.polisiku.Model.BeritaModel;
import com.piramidsoft.polisiku.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class BeritaAdapter extends RecyclerView.Adapter<BeritaAdapter.BeritaHolder> {

    private ArrayList<BeritaModel> arrayList;
    private Context context;

    public BeritaAdapter(ArrayList<BeritaModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public BeritaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list_berita, parent, false);
        return new BeritaHolder(view);
    }

    @Override
    public void onBindViewHolder(BeritaHolder holder, int position) {
        holder.ImgVideo.setImageResource(arrayList.get(position).getImage());
        holder.etTitle.setText(arrayList.get(position).getTitile());
        holder.etBerita.setText(arrayList.get(position).getBerita());
        holder.etLike.setText(arrayList.get(position).getLike());
        holder.etComment.setText(arrayList.get(position).getComment());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int pos, boolean isLongClick) {
                Toast.makeText(context, "Active", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class BeritaHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.ImgVideo)
        CircleImageView ImgVideo;
        @BindView(R.id.etTitle)
        TextView etTitle;
        @BindView(R.id.etBerita)
        TextView etBerita;
        @BindView(R.id.etWaktu)
        TextView etWaktu;
        @BindView(R.id.etLike)
        TextView etLike;
        @BindView(R.id.etComment)
        TextView etComment;
        private ItemClickListener itemClickListener;

        public void setItemClickListener(ItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;
        }

        public BeritaHolder(View itemView) {
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
