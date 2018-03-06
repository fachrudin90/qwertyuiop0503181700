package com.piramidsoft.polisiku.Fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageButton;

import com.piramidsoft.polisiku.Adapter.AdDiskusi;
import com.piramidsoft.polisiku.Model.ModelItemDiskusi;
import com.piramidsoft.polisiku.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DiskusiFragments extends AppCompatActivity {

    @BindView(R.id.RvDiskusi)
    RecyclerView RvDiskusi;
    ArrayList<ModelItemDiskusi> arrayList = new ArrayList<>();
    AdDiskusi adapter;
    @BindView(R.id.back)
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diskusi_fragments);
        ButterKnife.bind(this);
        dataku();

        RvDiskusi.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(DiskusiFragments.this, 1,
                GridLayoutManager.VERTICAL, false);
        RvDiskusi.setLayoutManager(layoutManager);

        adapter = new AdDiskusi(arrayList, DiskusiFragments.this);
        RvDiskusi.setAdapter(adapter);
    }

    private void dataku() {
        arrayList.add(new ModelItemDiskusi(R.drawable.avatar, "Terakhir dilihat pada 10:20", "Judul", "Alamat alamat alamat", "12"));
        arrayList.add(new ModelItemDiskusi(R.drawable.avatar, "Terakhir dilihat pada 10:20", "Judul", "Alamat alamat alamat", "12"));
        arrayList.add(new ModelItemDiskusi(R.drawable.avatar, "Terakhir dilihat pada 10:20", "Judul", "Alamat alamat alamat", "12"));
        arrayList.add(new ModelItemDiskusi(R.drawable.avatar, "Terakhir dilihat pada 10:20", "Judul", "Alamat alamat alamat", "12"));
        arrayList.add(new ModelItemDiskusi(R.drawable.avatar, "Terakhir dilihat pada 10:20", "Judul", "Alamat alamat alamat", "12"));
    }

    @OnClick(R.id.back)
    public void onViewClicked() {
        finish();
    }
}
