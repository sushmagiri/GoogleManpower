package com.example.user.googlemanpower.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.example.user.googlemanpower.Fragment.TabFragment1;
import com.example.user.googlemanpower.Fragment.TabFragment2;
import com.example.user.googlemanpower.Fragment.TabFragment3;
import com.example.user.googlemanpower.Fragment.TabFragment4;


public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    String Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    public PagerAdapter(FragmentManager fm, String [] titles){
        super(fm);
        this.Titles = titles;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TabFragment1 tab1 = new TabFragment1();
                return tab1;
            case 1:
                TabFragment2 tab2 = new TabFragment2();
                return tab2;
            case 2:
                TabFragment3 tab3 = new TabFragment3();
                return tab3;
            case 3:
                TabFragment4 tab4=new TabFragment4();
                return tab4;
            default:
                return null;
        }
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    @Override
    public int getCount() {
        return Titles.length;
    }
}