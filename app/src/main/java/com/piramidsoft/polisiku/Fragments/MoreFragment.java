package com.piramidsoft.polisiku.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.piramidsoft.polisiku.Adapter.SlidePageAdapter;
import com.piramidsoft.polisiku.ChattActivity;
import com.piramidsoft.polisiku.R;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
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
    private Handler handler;
    private int slidePage;
    private ArrayList<Integer> slideList;
    private int SLIDE_DELAY = 5000;
    private FragmentActivity mActivity;

    public MoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_more, container, false);
        unbinder = ButterKnife.bind(this, view);

        mActivity = getActivity();
        slidePage = 0;
        handler = new Handler();
        slideList = new ArrayList<>();
        slideList.add(R.drawable.mopol);
        slideList.add(R.drawable.slipol);

        SlidePageAdapter adapter = new SlidePageAdapter(mActivity, slideList);
        vpSlide.setAdapter(adapter);

        cpIndicator.setCentered(true);
        cpIndicator.setViewPager(vpSlide);

        handler.post(runnable);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    private Runnable runnable = new Runnable() {
        public void run() {
            vpSlide.setCurrentItem(slidePage, true);

            if (slideList.size() == (slidePage + 1)) {
                slidePage = 0;
            } else {
                slidePage++;
            }
            handler.postDelayed(runnable, SLIDE_DELAY);
        }
    };

    @Override
    public void onDestroy() {
        super.onDestroy();

        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    @OnClick({R.id.btChatt, R.id.btDiskussion, R.id.btInfoHumas, R.id.btPolisiHalo, R.id.btSIMOnline, R.id.btSKCKOnline, R.id.btSamsatOnline, R.id.btProfile, R.id.btSettings})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btChatt:
                Intent intent = new Intent(getActivity(), ChattActivity.class);
                startActivity(intent);
                break;
            case R.id.btDiskussion:
                Intent intents = new Intent(getActivity(), DiskusiFragments.class);
                startActivity(intents);
                break;
            case R.id.btInfoHumas:
                Intent intent1 = new Intent(getActivity(), InfoHumasFragments.class);
                startActivity(intent1);
                break;
            case R.id.btPolisiHalo:
                break;
            case R.id.btSIMOnline:
                break;
            case R.id.btSKCKOnline:
                Intent intent4 = new Intent(getActivity(), InfoHumasFragments.class);
                startActivity(intent4);
                break;
            case R.id.btSamsatOnline:
                break;
            case R.id.btProfile:
                break;
            case R.id.btSettings:
                break;
        }
    }
}
