package com.example.project1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    PageFragment pageFragment = new PageFragment();
    int pageNum = pageFragment.subsLength();
    public MyAdapter(FragmentManager mgr){
        super(mgr);
    }

    @NonNull

    @Override
    public int getCount() {
        return (pageNum);
    }
    @Override
    public Fragment getItem(int position) {
        return (PageFragment.newInstance(position));
    }



}
