package com.example.pupil.shabanova.ui.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.pupil.shabanova.ui.base.BaseFragment;

import java.util.List;

public class MyFragmentPagerAgapters extends FragmentPagerAdapter {
    private List<BaseFragment> fragments;

    public MyFragmentPagerAgapters(FragmentManager fm) {
        super(fm);
    }

    public void setList(List<BaseFragment> fragments){
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

    @Override
    public CharSequence getPageTitle(int position){
        return fragments.get(position).getName();
    }
}
