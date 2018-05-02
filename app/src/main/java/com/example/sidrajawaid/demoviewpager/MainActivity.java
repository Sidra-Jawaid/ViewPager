package com.example.sidrajawaid.demoviewpager;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements tab1.OnFragmentInteractionListener,tab2.OnFragmentInteractionListener,tab3.OnFragmentInteractionListener,tab4.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ViewPager viewPager=findViewById(R.id.viepager);
        TabLayout tabLayout=findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Log In"));
        tabLayout.addTab(tabLayout.newTab().setText("RecyclerView"));
        tabLayout.addTab(tabLayout.newTab().setText("Coordinator"));
        tabLayout.addTab(tabLayout.newTab().setText("ListView"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        PagerAdapter pagerAdapter=new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        //tabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

    }
    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
