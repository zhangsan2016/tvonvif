package example.ldgd.com.viewpager2.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import example.ldgd.com.viewpager2.pager.TestFragment;
import example.ldgd.com.viewpager2.pager.TestFragment2;

/**
 * Created by ldgd on 2018/2/28.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private static final String[] CONTENT = new String[] { "Recent", "Artists", "Albums", "Songs", "Playlists", "Genres" };

    private List<Fragment> fragments = new ArrayList<Fragment>();

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        TestFragment t1 = new TestFragment();
        TestFragment2 t2 = new TestFragment2();
        fragments.add(t1);
        fragments.add(t2);

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return CONTENT[position];
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
