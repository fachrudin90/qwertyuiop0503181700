package com.piramidsoft.polisiku.Adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.piramidsoft.polisiku.Model.ModelItemDiskusi;
import com.piramidsoft.polisiku.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class AdDiskusi extends RecyclerView.Adapter<AdDiskusi.AdDiskusiHolder> {

    private ArrayList<ModelItemDiskusi> arrayList;
    private Context context;

    public AdDiskusi(ArrayList<ModelItemDiskusi> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public AdDiskusiHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_diskusi, parent, false);
        return new AdDiskusiHolder(view);
    }

    @Override
    public void onBindViewHolder(AdDiskusiHolder holder, int position) {
        holder.ImgDiskusi.setImageResource(arrayList.get(position).getImg());
        holder.etTitle.setText(arrayList.get(position).getTitle());
        holder.etTerakhirDilihat.setText(arrayList.get(position).getTerakhir());
        holder.etAlamat.setText(arrayList.get(position).getAlamat());
        holder.etTanggapan.setText(arrayList.get(position).getTanggapan());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class AdDiskusiHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.ImgDiskusi)
        CircleImageView ImgDiskusi;
        @BindView(R.id.etTitle)
        TextView etTitle;
        @BindView(R.id.etTerakhirDilihat)
        TextView etTerakhirDilihat;
        @BindView(R.id.etAlamat)
        TextView etAlamat;
        @BindView(R.id.etTanggapan)
        TextView etTanggapan;

        public AdDiskusiHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
