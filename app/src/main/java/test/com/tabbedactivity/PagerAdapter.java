package test.com.tabbedactivity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ContactsFragment contacts = new ContactsFragment();
                return contacts;
            case 1:
                MessagesFragment messages = new MessagesFragment();
                return messages;
            case 2:
                AppsFragment apps = new AppsFragment();
                return apps;
            case 3:
                GamesFragment games = new GamesFragment();
                return games;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
