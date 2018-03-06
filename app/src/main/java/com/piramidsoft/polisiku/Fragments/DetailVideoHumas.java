package com.piramidsoft.polisiku.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.piramidsoft.polisiku.Adapter.AdKomentar;
import com.piramidsoft.polisiku.Model.ModelKomentar;
import com.piramidsoft.polisiku.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailVideoHumas extends AppCompatActivity {

    @BindView(R.id.btBack)
    ImageButton btBack;
    @BindView(R.id.etTitle)
    TextView etTitle;
    @BindView(R.id.etWaktu)
    TextView etWaktu;
    @BindView(R.id.etViewers)
    TextView etViewers;
    @BindView(R.id.etBerita)
    TextView etBerita;
    @BindView(R.id.btnEmotIcon)
    ImageButton btnEmotIcon;
    @BindView(R.id.etTextKomentar)
    EditText etTextKomentar;
    @BindView(R.id.btnSend)
    ImageButton btnSend;
    @BindView(R.id.RvKomentarVideo)
    RecyclerView RvKomentarVideo;
    String title, news, time, viewers;
    ArrayList<ModelKomentar> arrayList = new ArrayList<>();
    AdKomentar adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_video_humas_fragments);
        ButterKnife.bind(this);

        dataku();

        Intent intent = getIntent();
        title = intent.getStringExtra("title");
        news = intent.getStringExtra("news");
        time = intent.getStringExtra("time");
        viewers = intent.getStringExtra("viewers");

        etTitle.setText(title);
        etBerita.setText(news);
        etWaktu.setText(time);
        etViewers.setText(viewers);

        RvKomentarVideo.setHasFixedSize(true);

        GridLayoutManager layoutManager = new GridLayoutManager(DetailVideoHumas.this, 1,
                GridLayoutManager.VERTICAL, false);
        RvKomentarVideo.setLayoutManager(layoutManager);

        adapter = new AdKomentar(arrayList, DetailVideoHumas.this);
        RvKomentarVideo.setAdapter(adapter);
    }

    private void dataku() {
        arrayList.add(new ModelKomentar(R.drawable.avatar, "Muhammad Iqbal", "Bagus kak beritanya", "10/20/2018"));
        arrayList.add(new ModelKomentar(R.drawable.avatar, "Muhammad Iqbal", "Bagus kak beritanya", "10/20/2018"));
        arrayList.add(new ModelKomentar(R.drawable.avatar, "Muhammad Iqbal", "Bagus kak beritanya", "10/20/2018"));
        arrayList.add(new ModelKomentar(R.drawable.avatar, "Muhammad Iqbal", "Bagus kak beritanya", "10/20/2018"));
        arrayList.add(new ModelKomentar(R.drawable.avatar, "Muhammad Iqbal", "Bagus kak beritanya", "10/20/2018"));
    }
}
