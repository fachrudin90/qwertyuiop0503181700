package com.piramidsoft.polisiku.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.piramidsoft.polisiku.Model.ModelKomentar;
import com.piramidsoft.polisiku.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Ayo Maju on 06/03/2018.
 * Updated by Muhammad Iqbal on 06/03/2018.
 */

public class AdKomentar extends RecyclerView.Adapter<AdKomentar.AdKomentarHolder> {

    private ArrayList<ModelKomentar> arrayList;
    private Context context;

    public AdKomentar(ArrayList<ModelKomentar> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public AdKomentarHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_komentar_menu, parent, false);
        return new AdKomentarHolder(view);
    }

    @Override
    public void onBindViewHolder(AdKomentarHolder holder, int position) {
        holder.imgAkun.setImageResource(arrayList.get(position).getImgAkun());
        holder.tvNama.setText(arrayList.get(position).getNama());
        holder.txKomentar.setText(arrayList.get(position).getKomentar());
        holder.tvTgl.setText(arrayList.get(position).getTanggal());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class AdKomentarHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.imgAkun)
        CircleImageView imgAkun;
        @BindView(R.id.tvNama)
        TextView tvNama;
        @BindView(R.id.txKomentar)
        TextView txKomentar;
        @BindView(R.id.tvTgl)
        TextView tvTgl;
        public AdKomentarHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
