package com.example.ui.testdotindicator;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.ui.adpater.DotPagerAdapter;
import com.example.ui.widget.DotIndicator;

public class MainActivity extends AppCompatActivity{

    private ViewPager viewPager;
    private DotIndicator dotIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        dotIndicator = (DotIndicator) findViewById(R.id.dot_indicator);
        DotPagerAdapter adapter = new DotPagerAdapter(this);
        viewPager.setAdapter(adapter);

        dotIndicator.setViewPager(viewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Toast.makeText(MainActivity.this,"position:"+position,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


}
