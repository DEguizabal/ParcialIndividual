package com.example.uno.parcialindividual;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tablayoutid);
        viewPager = (ViewPager) findViewById(R.id.viewpagerid);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new LlamadaFragmento(), "");
        adapter.AddFragment(new FragmentoContacto(), "");
        adapter.AddFragment(new FragmentoFavoritos(), "");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_group);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_star);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);

    }
}
