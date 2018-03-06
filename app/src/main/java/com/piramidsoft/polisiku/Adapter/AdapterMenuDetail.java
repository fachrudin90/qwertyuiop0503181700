package com.piramidsoft.polisiku.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.piramidsoft.polisiku.Model.ModelMenuDetail;
import com.piramidsoft.polisiku.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class AdapterMenuDetail extends RecyclerView.Adapter<AdapterMenuDetail.MenuHolder> {

    private ArrayList<ModelMenuDetail> arrayList;
    private Context context;

    public AdapterMenuDetail(ArrayList<ModelMenuDetail> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public MenuHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_menu_detail, parent, false);
        return new MenuHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuHolder holder, int position) {
        holder.Image.setImageResource(arrayList.get(position).getImage());
        holder.Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Active", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @OnClick(R.id.Image)
    public void onViewClicked() {
    }

    public class MenuHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.Image)
        ImageView Image;

        public MenuHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
