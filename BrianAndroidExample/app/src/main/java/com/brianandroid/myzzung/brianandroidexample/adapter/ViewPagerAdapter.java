package com.brianandroid.myzzung.brianandroidexample.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by myZZUNG on 2016. 3. 6..
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> mFragmentList;
    private List<String> mTitleList;
    public ViewPagerAdapter(FragmentManager fm){
        super(fm);
        mFragmentList = new ArrayList<Fragment>();
        mTitleList = new ArrayList<String>();
    }

    public void addFragment(Fragment fg, String title){
        mFragmentList.add(fg);
        mTitleList.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitleList.get(position);
    }
}
