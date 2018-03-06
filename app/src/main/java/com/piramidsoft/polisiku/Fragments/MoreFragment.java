package com.piramidsoft.polisiku.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.piramidsoft.polisiku.R;
import com.viewpagerindicator.CirclePageIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoreFragment extends Fragment {


    @BindView(R.id.vpSlide)
    ViewPager vpSlide;
    @BindView(R.id.cpIndicator)
    CirclePageIndicator cpIndicator;
    @BindView(R.id.lyIndicator)
    LinearLayout lyIndicator;
    @BindView(R.id.btChatt)
    ImageButton btChatt;
    @BindView(R.id.rlDoctorSearch)
    RelativeLayout rlDoctorSearch;
    @BindView(R.id.btDiskussion)
    ImageButton btDiskussion;
    @BindView(R.id.rlMedicalReport)
    RelativeLayout rlMedicalReport;
    @BindView(R.id.btInfoHumas)
    ImageButton btInfoHumas;
    @BindView(R.id.rlBillPayment)
    RelativeLayout rlBillPayment;
    @BindView(R.id.btPolisiHalo)
    ImageButton btPolisiHalo;
    @BindView(R.id.rlVisit)
    RelativeLayout rlVisit;
    @BindView(R.id.btSIMOnline)
    ImageButton btSIMOnline;
    @BindView(R.id.rlSetting)
    RelativeLayout rlSetting;
    @BindView(R.id.btSKCKOnline)
    ImageButton btSKCKOnline;
    @BindView(R.id.rlEmergency)
    RelativeLayout rlEmergency;
    @BindView(R.id.btSamsatOnline)
    ImageButton btSamsatOnline;
    @BindView(R.id.rlBmi)
    RelativeLayout rlBmi;
    @BindView(R.id.btProfile)
    ImageButton btProfile;
    @BindView(R.id.btSettings)
    ImageButton btSettings;
    Unbinder unbinder;

    public MoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_more, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
