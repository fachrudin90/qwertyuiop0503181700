package com.piramidsoft.polisiku;

import android.os.Bundle;
import android.support.design.internal.NavigationMenu;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.piramidsoft.polisiku.Adapter.AdKomentar;
import com.piramidsoft.polisiku.Adapter.AdapterMenuDetail;
import com.piramidsoft.polisiku.Model.ModelKomentar;
import com.piramidsoft.polisiku.Model.ModelMenuDetail;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;
import io.github.yavski.fabspeeddial.FabSpeedDial;

public class DetailListMenu extends AppCompatActivity {

    @BindView(R.id.ImgdetailListHome)
    ImageView ImgdetailListHome;
    @BindView(R.id.btnback)
    ImageView btnback;
    @BindView(R.id.imgAkun)
    CircleImageView imgAkun;
    @BindView(R.id.txNama)
    TextView txNama;
    @BindView(R.id.txKomentar)
    TextView txKomentar;
    @BindView(R.id.txStatus)
    TextView txStatus;
    @BindView(R.id.RvKomentar)
    RecyclerView RvKomentar;
    @BindView(R.id.RvMenuDetail)
    RecyclerView RvMenuDetail;


    ArrayList<ModelKomentar> arrayList = new ArrayList<>();
    AdKomentar adapter;

    ArrayList<ModelMenuDetail> menuDetails = new ArrayList<>();
    AdapterMenuDetail adapterMenuDetail;
    @BindView(R.id.listLaporan)
    LinearLayout listLaporan;
    @BindView(R.id.Fab)
    FabSpeedDial Fab;
    @BindView(R.id.scrollView)
    ScrollView scrollView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_menu);
        ButterKnife.bind(this);

        dataku();
        menuDetail();

        RvKomentar.setHasFixedSize(true);
        RvMenuDetail.setHasFixedSize(true);

        GridLayoutManager layoutManager = new GridLayoutManager(DetailListMenu.this, 1,
                GridLayoutManager.VERTICAL, false);

        GridLayoutManager menu = new GridLayoutManager(DetailListMenu.this, 1,
                GridLayoutManager.HORIZONTAL, false);

        RvKomentar.setLayoutManager(layoutManager);
        RvMenuDetail.setLayoutManager(menu);

        adapter = new AdKomentar(arrayList, DetailListMenu.this);
        RvKomentar.setAdapter(adapter);

        adapterMenuDetail = new AdapterMenuDetail(menuDetails, DetailListMenu.this);
        RvMenuDetail.setAdapter(adapterMenuDetail);

        FabSpeedDial fabSpeedDial = (FabSpeedDial) findViewById(R.id.Fab);
        fabSpeedDial.setMenuListener(new FabSpeedDial.MenuListener() {
            @Override
            public boolean onPrepareMenu(NavigationMenu navigationMenu) {
                return true;
            }

            @Override
            public boolean onMenuItemSelected(MenuItem menuItem) {
                Toast.makeText(DetailListMenu.this, "" + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }

            @Override
            public void onMenuClosed() {

            }
        });
    }

    private void menuDetail() {
        menuDetails.add(new ModelMenuDetail(R.drawable.love));
        menuDetails.add(new ModelMenuDetail(R.drawable.ic_location));
        menuDetails.add(new ModelMenuDetail(R.drawable.chatt));
        menuDetails.add(new ModelMenuDetail(R.drawable.share));
    }

    private void dataku() {
        arrayList.add(new ModelKomentar(R.drawable.avatar, "Muhammad Iqbal", "Bagus kak beritanya", "10/20/2018"));
        arrayList.add(new ModelKomentar(R.drawable.avatar, "Muhammad Iqbal", "Bagus kak beritanya", "10/20/2018"));
        arrayList.add(new ModelKomentar(R.drawable.avatar, "Muhammad Iqbal", "Bagus kak beritanya", "10/20/2018"));
        arrayList.add(new ModelKomentar(R.drawable.avatar, "Muhammad Iqbal", "Bagus kak beritanya", "10/20/2018"));
        arrayList.add(new ModelKomentar(R.drawable.avatar, "Muhammad Iqbal", "Bagus kak beritanya", "10/20/2018"));
    }

    @OnClick(R.id.btnback)
    public void onViewClicked() {
        finish();
    }
}