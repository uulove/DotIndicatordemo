package com.example.ui.adpater;

import android.content.Context;
import android.media.Image;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ui.testdotindicator.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by kira on 2016/7/7.
 */
public class DotPagerAdapter extends PagerAdapter {
    private List<ImageView> datas = new ArrayList<>();

    public DotPagerAdapter(Context c) {

        for (int i = 0; i < 5; i ++){
            ImageView iView = new ImageView(c);
            iView.setImageResource(R.mipmap.a5);
            iView.setScaleType(ImageView.ScaleType.FIT_XY);
            datas.add(iView);
        }
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(datas.get(position));
//        super.destroyItem(container, position, object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(datas.get(position));
        return datas.get(position);
    }
}
