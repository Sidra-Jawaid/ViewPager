package com.example.sidrajawaid.demoviewpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int numberOfTabs;
    public PagerAdapter(FragmentManager fm,int tabs) {
        super(fm);
        this.numberOfTabs=tabs;
    }
    @Override
    public Fragment getItem(int position) {
        {
            switch (position){
                case 0:
                    tab1 tab_1=new tab1();
                    return tab_1;
                case 1:
                    tab2 tab_2=new tab2();
                    return tab_2;
                case 2:
                    tab3 tab_3=new tab3();
                    return tab_3;
                case 3:
                    tab4 tab_4=new tab4();
                    return tab_4;
            }
            return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
