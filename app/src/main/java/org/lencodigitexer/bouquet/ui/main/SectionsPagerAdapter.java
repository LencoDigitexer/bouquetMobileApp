package org.lencodigitexer.bouquet.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.lencodigitexer.bouquet.FirstActivity;
import org.lencodigitexer.bouquet.R;
import org.lencodigitexer.bouquet.SecondActivity;
import org.lencodigitexer.bouquet.ThirdActivity;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new
            int[]{R.string.tab_text_1, R.string.tab_text_2,
            R.string.tab_text_3};

    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FirstActivity tab1 = new FirstActivity();
                return tab1;
            case 1:
                SecondActivity tab2 = new SecondActivity();
                return tab2;
            case 2:
                ThirdActivity tab3 = new ThirdActivity();
                return tab3;
        }
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}