package com.piramidsoft.polisiku;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    private Handler handler;
    private int DELAY_MS = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        handler = new Handler();
        handler.postDelayed(runnable, DELAY_MS);

    }


    private Runnable runnable = new Runnable() {
        @Override
        public void run() {

            goTo();
        }
    };


    private void goTo() {
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if (handler != null) {

            handler.removeCallbacks(runnable);
        }
    }
}
