package com.piramidsoft.polisiku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.piramidsoft.polisiku.Adapter.AdKomentar;
import com.piramidsoft.polisiku.Model.ModelKomentar;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class DetailListMenu extends AppCompatActivity {

    @BindView(R.id.ImgdetailListHome)
    ImageView ImgdetailListHome;
    @BindView(R.id.btnback)
    ImageView btnback;
    @BindView(R.id.imgAkun)
    CircleImageView imgAkun;
    @BindView(R.id.txNama)
    TextView txNama;
    @BindView(R.id.tanggal)
    ImageView tanggal;
    @BindView(R.id.txKomentar)
    TextView txKomentar;
    @BindView(R.id.txStatus)
    TextView txStatus;
    @BindView(R.id.RvKomentar)
    RecyclerView RvKomentar;

    ArrayList<ModelKomentar> arrayList;
    AdKomentar adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_menu);
        ButterKnife.bind(this);
        dataku();

        RvKomentar.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(DetailListMenu.this, 1,
                GridLayoutManager.VERTICAL, false);
        RvKomentar.setLayoutManager(layoutManager);

        adapter = new AdKomentar(arrayList, DetailListMenu.this);
        RvKomentar.setAdapter(adapter);
    }

    private void dataku() {
        arrayList.add(new ModelKomentar(R.drawable.avatar, "Muhammad Iqbal","Bagus kak beritanya", "10/20/2018"));
        arrayList.add(new ModelKomentar(R.drawable.avatar, "Muhammad Iqbal","Bagus kak beritanya", "10/20/2018"));
        arrayList.add(new ModelKomentar(R.drawable.avatar, "Muhammad Iqbal","Bagus kak beritanya", "10/20/2018"));
        arrayList.add(new ModelKomentar(R.drawable.avatar, "Muhammad Iqbal","Bagus kak beritanya", "10/20/2018"));
        arrayList.add(new ModelKomentar(R.drawable.avatar, "Muhammad Iqbal","Bagus kak beritanya", "10/20/2018"));
    }
}