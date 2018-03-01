package com.suzaneringoringo.finbeefrontend;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.List;
import java.util.Vector;

public class WelcomeActivity extends FragmentActivity {
    /** maintains the pager adapter*/
    private MyPagerAdapter mPagerAdapter;
    /* (non-Javadoc)
     * @see android.support.v4.app.FragmentActivity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_welcome);
        //initialsie the pager
        this.initialisePaging();
    }

    /**
     * Initialise the fragments to be paged
     */
    private void initialisePaging() {

        List<Fragment> fragments = new Vector<Fragment>();
        fragments.add(Fragment.instantiate(this, Welcome1.class.getName()));
        fragments.add(Fragment.instantiate(this, Welcome2.class.getName()));
        fragments.add(Fragment.instantiate(this, Welcome3.class.getName()));
        fragments.add(Fragment.instantiate(this, Welcome4.class.getName()));
        fragments.add(Fragment.instantiate(this, Welcome5.class.getName()));
        fragments.add(Fragment.instantiate(this, Welcome6.class.getName()));
        this.mPagerAdapter  = new MyPagerAdapter(super.getSupportFragmentManager(), fragments);
        //
        ViewPager pager = (ViewPager)super.findViewById(R.id.welcome_viewpager);
        pager.setAdapter(this.mPagerAdapter);

    }

    public void signUp(View view) {
        Intent intent = new Intent(this, RegisterBasicInfo.class);
        startActivity(intent);
        finish();
    }
}