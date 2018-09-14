package com.example.android.atlantatourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] {"Parks and Museums",
            "Sports and Theaters", "Places to Eat", "Breweries Distilleries"};

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ParkMuseumExhibitFragment();
        } else if (position == 1){
            return new SportsTheatersFragment();
        } else  if (position == 2) {
            return new MarketRestaurantFragment();
        } else {
            return new BreweryDistilleryFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}