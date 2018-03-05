package com.piramidsoft.polisiku.Adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.piramidsoft.polisiku.Model.ModelHome;
import com.piramidsoft.polisiku.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdListHome extends RecyclerView.Adapter<AdListHome.AdlisHomeHolder> {

    private ArrayList<ModelHome> modelHomes;
    private Context context;

    public AdListHome(ArrayList<ModelHome> modelHomes, Context context) {
        this.modelHomes = modelHomes;
        this.context = context;
    }

    @Override
    public AdlisHomeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_home, parent, false);
        return new AdlisHomeHolder(view);
    }

    @Override
    public void onBindViewHolder(AdlisHomeHolder holder, int position) {
        holder.ImgHomeList.setImageResource(modelHomes.get(position).getImgHomeList());
        holder.txLokasi.setText(modelHomes.get(position).getLokasi());
        holder.txDeskripsi.setText(modelHomes.get(position).getDeskripsi());
        holder.txKomentar.setText(modelHomes.get(position).getJmlKomenta());
        holder.txNama.setText(modelHomes.get(position).getNama());
        holder.txSuka.setText(modelHomes.get(position).getJmlSuka());
    }

    @Override
    public int getItemCount() {
        return modelHomes.size();
    }

    public class AdlisHomeHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.ImgHomeList)
        ImageView ImgHomeList;
        @BindView(R.id.txLokasi)
        TextView txLokasi;
        @BindView(R.id.txSuka)
        TextView txSuka;
        @BindView(R.id.txKomentar)
        TextView txKomentar;
        @BindView(R.id.txNama)
        TextView txNama;
        @BindView(R.id.txDeskripsi)
        TextView txDeskripsi;

        public AdlisHomeHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
