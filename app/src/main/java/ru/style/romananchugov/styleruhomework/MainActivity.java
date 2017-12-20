package ru.style.romananchugov.styleruhomework;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class MainActivity extends AppCompatActivity {


    public static final int PAGES_NUMBER = 5;

    private ViewPager mPager;
    private ScreenSlideAdapter mPagerAdapter;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlideAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(mPager);

    }

    private class ScreenSlideAdapter extends FragmentStatePagerAdapter{

        public ScreenSlideAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position % 2 == 0){
                return new ButtonTab();
            }else{
                return new TextTab();
            }
        }

        @Override
        public int getCount() {
            Log.e("TAG", "getCount");
            return PAGES_NUMBER;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return "tab " + position;
        }
    }

}
