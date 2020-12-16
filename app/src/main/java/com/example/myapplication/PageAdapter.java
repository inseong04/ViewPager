package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PageAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> mDate = new ArrayList<>();

    PageAdapter (@NonNull FragmentManager fm){
        super(fm);

        mDate = new ArrayList<>();
        mDate.add(new BlankFragment1());
        mDate.add(new BlankFragment2());

    }

    public  CharSequence getPageTitle(int position){
        switch (position){
            case 0 : return "TEST";
            case 1 : return "TEST2";
        }
        return "error";
    }

    @NonNull
    public Fragment getItem(int position){
        return mDate.get(position);
    }

    public int getCount(){
        return mDate.size();
    }
}
