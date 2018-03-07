package com.piramidsoft.polisiku.Fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.piramidsoft.polisiku.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DetailBeritaHumasFragments extends AppCompatActivity {

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
    @BindView(R.id.RvBeritaHumas)
    RecyclerView RvBeritaHumas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_berita_humas_fragments);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btBack, R.id.btnSend})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btBack:
                break;
            case R.id.btnSend:
                break;
        }
    }
}
