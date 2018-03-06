package com.piramidsoft.polisiku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class KomentarActivity extends AppCompatActivity {

    @BindView(R.id.btnEmotIcon)
    ImageButton btnEmotIcon;
    @BindView(R.id.etTextKomentar)
    EditText etTextKomentar;
    @BindView(R.id.btnSend)
    ImageButton btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komentar);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnEmotIcon, R.id.btnSend})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnEmotIcon:
                break;
            case R.id.btnSend:
                break;
        }
    }
}
