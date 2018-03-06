package com.piramidsoft.polisiku.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.piramidsoft.polisiku.Adapter.BeritaAdapter;
import com.piramidsoft.polisiku.Model.BeritaModel;
import com.piramidsoft.polisiku.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class BeritaHumasFragments extends Fragment {

    @BindView(R.id.RvBerita)
    RecyclerView RvBerita;
    Unbinder unbinder;
    ArrayList<BeritaModel> arrayList = new ArrayList<>();
    BeritaAdapter adapter;

    public BeritaHumasFragments() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.berita_humas_fragments, container, false);
        unbinder = ButterKnife.bind(this, view);

        dataku();

        RvBerita.setHasFixedSize(true);

        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 1,
                GridLayoutManager.VERTICAL, false);
        RvBerita.setLayoutManager(layoutManager);

        adapter = new BeritaAdapter(arrayList, getActivity());
        RvBerita.setAdapter(adapter);
        return view;
    }

    private void dataku() {
        arrayList.add(new BeritaModel(R.drawable.mopol, "PELAKOR LONCAT DARI TANGGA","Kamu pasti sudah sering mendengar nama UGM, kan? Kampus kondang yang berada di wilayah Yogyakarta ini memang gudangnya orang cerdas.","10:00 12/01/2018","10","100"));
        arrayList.add(new BeritaModel(R.drawable.mopol, "PELAKOR LONCAT DARI TANGGA","Kamu pasti sudah sering mendengar nama UGM, kan? Kampus kondang yang berada di wilayah Yogyakarta ini memang gudangnya orang cerdas.","10:00 12/01/2018","10","100"));
        arrayList.add(new BeritaModel(R.drawable.mopol, "PELAKOR LONCAT DARI TANGGA","Kamu pasti sudah sering mendengar nama UGM, kan? Kampus kondang yang berada di wilayah Yogyakarta ini memang gudangnya orang cerdas.","10:00 12/01/2018","10","100"));
        arrayList.add(new BeritaModel(R.drawable.mopol, "PELAKOR LONCAT DARI TANGGA","Kamu pasti sudah sering mendengar nama UGM, kan? Kampus kondang yang berada di wilayah Yogyakarta ini memang gudangnya orang cerdas.","10:00 12/01/2018","10","100"));
        arrayList.add(new BeritaModel(R.drawable.mopol, "PELAKOR LONCAT DARI TANGGA","Kamu pasti sudah sering mendengar nama UGM, kan? Kampus kondang yang berada di wilayah Yogyakarta ini memang gudangnya orang cerdas.","10:00 12/01/2018","10","100"));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
