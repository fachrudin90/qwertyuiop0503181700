package com.piramidsoft.polisiku.Adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.piramidsoft.polisiku.R;

import java.util.ArrayList;

public class SlidePageAdapter extends PagerAdapter {
    // Declare Variables
    Context context;
    ArrayList<Integer> dataList;
    LayoutInflater inflater;

    public SlidePageAdapter(Context context, ArrayList<Integer> dataList) {
        this.context = context;
        this.dataList = dataList;

    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {


        final int value = dataList.get(position);

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.item_list_slide, container,
                false);

        ImageView imgSlide = itemView.findViewById(R.id.imgSlide);
        imgSlide.setAdjustViewBounds(true);
        Glide.with(context).load(value).into(imgSlide);

        ((ViewPager) container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // Remove viewpager_item.xml from ViewPager
        ((ViewPager) container).removeView((RelativeLayout) object);


    }
}
