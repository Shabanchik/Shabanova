package com.example.pupil.shabanova.ui.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class MyFragmentPagerAgapters extends FragmentPagerAdapter {
    private List<Fragment> fragments;
    public MyFragmentPagerAgapters(FragmentManager fm) {
        super(fm);
    }
    public void setList(List<Fragment> fragments){
        this.fragments=fragments;
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
