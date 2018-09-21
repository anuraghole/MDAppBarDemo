package com.example.anuraghole.myapplication.app_bar_collapsing_toolbar.view_pager_fragment;

import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;

import com.example.anuraghole.myapplication.R;
import com.example.anuraghole.myapplication.adapters.ViewPagerAdapter;
import com.example.anuraghole.myapplication.app_bar_collapsing_toolbar.view_pager_fragment.BluetoothFragment;
import com.example.anuraghole.myapplication.app_bar_collapsing_toolbar.view_pager_fragment.HeadsetFragment;
import com.example.anuraghole.myapplication.app_bar_collapsing_toolbar.view_pager_fragment.SpeakerFragment;

public class AppBarTabLayoutActivity extends AppCompatActivity {

    FloatingActionButton fab;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar_tab_layout);
        tabLayout=(TabLayout)findViewById(R.id.tabLauout);
        viewPager=(ViewPager)findViewById(R.id.viewPager);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_speaker_black_24dp));


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int position= viewPager.getCurrentItem();
              String fragName="";
              switch (position){
                  case 0:
                      fragName="speaker";
                      break;
                  case 1:
                      fragName="headphone";
                      break;
                  case 2:
                      fragName="bluetooth";
                      break;
              }
                Snackbar.make(view, ""+fragName, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new SpeakerFragment(),"Speaker");
        viewPagerAdapter.addFragment(new HeadsetFragment(),"Headset");
        viewPagerAdapter.addFragment(new BluetoothFragment(),"Bluetooth");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                animateFab(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }


    int[] colorIntArray = {R.color.colorAccent,R.color.colorAccent,R.color.colorAccent};
    int[] iconIntArray = {R.drawable.ic_speaker_black_24dp,R.drawable.ic_headset_black_24dp,R.drawable.ic_bluetooth_black_24dp};

    protected void animateFab(final int position) {
        fab.clearAnimation();
        // Scale down animation
        ScaleAnimation shrink =  new ScaleAnimation(1f, 0.2f, 1f, 0.2f, Animation.RELATIVE_TO_SELF,
                0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        shrink.setDuration(150);     // animation duration in milliseconds
        shrink.setInterpolator(new DecelerateInterpolator());
        shrink.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Change FAB color and icon
                fab.setBackgroundTintList(getResources().getColorStateList(colorIntArray[position]));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    fab.setImageDrawable(getResources().getDrawable(iconIntArray[position], null));
                }

                // Scale up animation
                ScaleAnimation expand =  new ScaleAnimation(0.2f, 1f, 0.2f,
                        1f, Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f);
                expand.setDuration(100);     // animation duration in milliseconds
                expand.setInterpolator(new AccelerateInterpolator());
                fab.startAnimation(expand);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        fab.startAnimation(shrink);
    }

}
