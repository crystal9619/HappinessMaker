package com.example.happiness;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);

        tabLayout=(TabLayout)findViewById(R.id.tabs);

        viewPager=(ViewPager)findViewById(R.id.container);

        TabPagerAdapter pagerAdapter = new TabPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    viewPager.setCurrentItem(tab.getPosition());

                }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }


    private class TabPagerAdapter extends FragmentStatePagerAdapter {

        private int tabCount;

        public TabPagerAdapter(FragmentManager supportFragmentManager, int tabCount) {
            super(supportFragmentManager);
            this.tabCount=tabCount;
        }

        @Override
        public Fragment getItem(int position) {

            switch(position)
            {
                case 0:
                    Fragment1 fragment1=new Fragment1();
                    return fragment1;
                case 1:
                    Fragment2 fragment2=new Fragment2();
                    return fragment2;
                case 2:
                    Fragment3 fragment3=new Fragment3();
                    return fragment3;
                case 3:
                    Fragment4 fragment4=new Fragment4();
                    return fragment4;
                case 4:
                    Fragment5 fragment5=new Fragment5();
                    return fragment5;
                default:
                    return null;
            }

        }

        @Override
        public int getCount() {
            return tabCount;
        }
    }
}
