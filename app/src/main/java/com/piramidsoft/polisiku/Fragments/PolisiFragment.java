package com.piramidsoft.polisiku.Fragments;


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
import com.piramidsoft.polisiku.R;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class PolisiFragment extends Fragment {


    @BindView(R.id.vpSlide)
    ViewPager vpSlide;
    @BindView(R.id.cpIndicator)
    CirclePageIndicator cpIndicator;
    @BindView(R.id.lyIndicator)
    LinearLayout lyIndicator;
    @BindView(R.id.btSIM)
    ImageButton btSIM;
    @BindView(R.id.rlDoctorSearch)
    RelativeLayout rlDoctorSearch;
    @BindView(R.id.btSKCK)
    ImageButton btSKCK;
    @BindView(R.id.rlMedicalReport)
    RelativeLayout rlMedicalReport;
    @BindView(R.id.btIzinKeramaian)
    ImageButton btIzinKeramaian;
    @BindView(R.id.rlBillPayment)
    RelativeLayout rlBillPayment;
    @BindView(R.id.btPengamanan)
    ImageButton btPengamanan;
    @BindView(R.id.rlVisit)
    RelativeLayout rlVisit;
    @BindView(R.id.btSamsat)
    ImageButton btSamsat;
    @BindView(R.id.rlSetting)
    RelativeLayout rlSetting;
    @BindView(R.id.btUGD)
    ImageButton btUGD;
    @BindView(R.id.rlEmergency)
    RelativeLayout rlEmergency;
    @BindView(R.id.btPemadan)
    ImageButton btPemadan;
    @BindView(R.id.rlBmi)
    RelativeLayout rlBmi;
    @BindView(R.id.btSPBU)
    ImageButton btSPBU;
    @BindView(R.id.btPanicBUtton)
    ImageButton btPanicBUtton;
    Unbinder unbinder;
    private Handler handler;
    private int slidePage;
    private ArrayList<Integer> slideList;
    private int SLIDE_DELAY = 5000;
    private FragmentActivity mActivity;

    public PolisiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_polisi, container, false);
        unbinder = ButterKnife.bind(this, view);
        mActivity = getActivity();
        slidePage = 0;
        handler = new Handler();
        slideList = new ArrayList<>();
        slideList.add(R.drawable.slipol);
        slideList.add(R.drawable.mopol);

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
}
