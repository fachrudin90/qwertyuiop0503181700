package com.piramidsoft.polisiku;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.piramidsoft.polisiku.Fragments.CariFragment;
import com.piramidsoft.polisiku.Fragments.HomeFragment;
import com.piramidsoft.polisiku.Fragments.LaporanFragment;
import com.piramidsoft.polisiku.Fragments.MoreFragment;
import com.piramidsoft.polisiku.Fragments.PolisiFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.flContent)
    FrameLayout flContent;
    @BindView(R.id.bottomNav)
    BottomNavigationView bottomNav;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.flContent, new HomeFragment()).commit();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottomNav);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    transaction.replace(R.id.flContent, new HomeFragment()).commit();
                    return true;
                case R.id.navigation_cari:
                    transaction.replace(R.id.flContent, new CariFragment()).commit();
                    return true;
                case R.id.navigation_laporan:
                    transaction.replace(R.id.flContent, new LaporanFragment()).commit();
                    return true;
                case R.id.navigation_polisi:
                    transaction.replace(R.id.flContent, new PolisiFragment()).commit();
                    return true;
                case R.id.navigation_setting:
                    transaction.replace(R.id.flContent, new MoreFragment()).commit();
                    return true;
            }
            return false;
        }

    };

}
