package com.example.android.tourguideapp;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;
    public static int PAGES_NUMBER = 4;

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AcademicFragment();
        } else if (position == 1) {
            return new ParksFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new SportsFragment();
        }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return PAGES_NUMBER;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {

            case 0:
                return mContext.getString(R.string.section_1);
            case 1:
                return mContext.getString(R.string.section_2);
            case 2:
                return mContext.getString(R.string.section_3);
            case 3:
                return mContext.getString(R.string.section_4);
        }
        return null;
    }
}
