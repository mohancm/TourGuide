package com.mohancm.tourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);
        PlacesPagerAdapter placesPagerAdapter = new PlacesPagerAdapter(getSupportFragmentManager());
        TabLayout tabLayout = findViewById(R.id.tabs);

        placesPagerAdapter.add(new PlaceFragment(), getString(R.string.places));
        placesPagerAdapter.add(new RestaurantsFragment(), getString(R.string.restauratns));
        placesPagerAdapter.add(new AttractionsFragment(), getString(R.string.attractions));

        viewPager.setAdapter(placesPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    class PlacesPagerAdapter extends FragmentStatePagerAdapter {

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentName = new ArrayList<>();

        public PlacesPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public void add(Fragment fm, String name) {
            mFragmentList.add(fm);
            mFragmentName.add(name);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentName.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }
    }
}
