package com.piramidsoft.polisiku.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.piramidsoft.polisiku.Adapter.AdListHome;
import com.piramidsoft.polisiku.Model.ModelHome;
import com.piramidsoft.polisiku.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    @BindView(R.id.rvListHome)
    RecyclerView rvListHome;
    Unbinder unbinder;
    ArrayList<ModelHome> arrayList = new ArrayList<>();
    AdListHome adapterHome;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        unbinder = ButterKnife.bind(this, view);

        mydata();

        rvListHome.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 1,
                GridLayoutManager.VERTICAL, false);
        rvListHome.setLayoutManager(layoutManager);

        adapterHome = new AdListHome(arrayList, getContext());
        rvListHome.setAdapter(adapterHome);
        return view;
    }

    private void mydata() {
        arrayList.add(new ModelHome(R.drawable.gambar_olahraga, "Polsek Lombok Jl. Raya Trosobo Sidoarjo Barat No. 23",
                "102","20","Muhammad Iqbal","Lorem ipsum hmszsas asdhhs asdasf"));
        arrayList.add(new ModelHome(R.drawable.gambar_olahraga, "Polsek Lombok Jl. Raya Trosobo Sidoarjo Barat No. 23",
                "102","20","Muhammad Iqbal","Lorem ipsum hmszsas asdhhs asdasf"));
        arrayList.add(new ModelHome(R.drawable.gambar_olahraga, "Polsek Lombok Jl. Raya Trosobo Sidoarjo Barat No. 23",
                "102","20","Muhammad Iqbal","Lorem ipsum hmszsas asdhhs asdasf"));
        arrayList.add(new ModelHome(R.drawable.gambar_olahraga, "Polsek Lombok Jl. Raya Trosobo Sidoarjo Barat No. 23",
                "102","20","Muhammad Iqbal","Lorem ipsum hmszsas asdhhs asdasf"));
        arrayList.add(new ModelHome(R.drawable.gambar_olahraga, "Polsek Lombok Jl. Raya Trosobo Sidoarjo Barat No. 23",
                "102","20","Muhammad Iqbal","Lorem ipsum hmszsas asdhhs asdasf"));
        arrayList.add(new ModelHome(R.drawable.gambar_olahraga, "Polsek Lombok Jl. Raya Trosobo Sidoarjo Barat No. 23",
                "102","20","Muhammad Iqbal","Lorem ipsum hmszsas asdhhs asdasf"));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
