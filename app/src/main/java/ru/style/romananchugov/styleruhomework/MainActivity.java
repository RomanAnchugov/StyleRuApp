package ru.style.romananchugov.styleruhomework;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
    public static final int TAB_COUNT = 3;

    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.e("TAG", "onPageScrolled, position = " + position);
            }

            @Override
            public void onPageSelected(int position) {
                Log.e("TAG", "onPageSelected, position = " + position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public class MyPagerAdapter extends FragmentStatePagerAdapter{

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
            Log.e("TAG", "mepageAdapter");
        }

        @Override
        public Fragment getItem(int position) {
            Log.e("TAG", "getItem");
            return PageFragment.newInstance(position);
        }

        @Override
        public int getCount() {
            Log.e("TAG", "getCount");
            return TAB_COUNT;
        }
    }
}
