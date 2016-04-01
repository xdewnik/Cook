package com.jdstudio.cookingup.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.jdstudio.cookingup.fragment.ExampleFragment;

public class TabAdapter extends FragmentPagerAdapter{

    private String[] tabs;

    public TabAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[] {
                "Recipies",
                "Search"
        };

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return ExampleFragment.getInstance();
            case 1:
                return ExampleFragment.getInstance();


        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
