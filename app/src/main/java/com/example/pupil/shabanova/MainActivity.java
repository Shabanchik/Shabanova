package com.example.pupil.shabanova;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TableLayout;
import android.widget.Toast;

import com.example.pupil.shabanova.ui.adapters.MyFragmentPagerAgapters;
import com.example.pupil.shabanova.ui.base.BaseFragment;
import com.example.pupil.shabanova.ui.fragments.BlueFragment;
import com.example.pupil.shabanova.ui.fragments.MainFragment;
import com.example.pupil.shabanova.ui.fragments.RoseFragment;
import com.example.pupil.shabanova.ui.fragments.TifanyFragment;
import com.example.pupil.shabanova.ui.fragments.YellowFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.container);
        tl=findViewById(R.id.tl);
        Fragment mainFragment= new MainFragment();//с помощью этого мы фрагмент помещается в контейнер 19-21
        Fragment roseFragment= new RoseFragment();
        Fragment tifanyFragment= new TifanyFragment();
        Fragment yellowFragment= new YellowFragment();
        Fragment blueFragment= new BlueFragment();
        ArrayList<BaseFragment> fragments=new ArrayList<BaseFragment>();
        fragments.add((BaseFragment) mainFragment);//указываем принудительно тип бейз фрагмент
        fragments.add((BaseFragment) roseFragment);
        fragments.add((BaseFragment) tifanyFragment);
        fragments.add((BaseFragment) yellowFragment);
        fragments.add((BaseFragment) blueFragment);

        MyFragmentPagerAgapters adapter= new MyFragmentPagerAgapters(getSupportFragmentManager());
        adapter.setList(fragments);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        tl.setupWithViewPager(viewPager);
        tl.addOnTabSelectedListener((new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition()==2){
                    Toast.makeText(getBaseContext(),"Тифаниии"+tab.getPosition(),Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                if (tab.getPosition()==2){
                    Toast.makeText(getBaseContext(),"Тифаниии"+tab.getPosition(),Toast.LENGTH_LONG).show();
                }

            }
        }));

       // FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
       // fragmentTransaction.replace(R.id.container,mainFragment);
       // fragmentTransaction.commit();
    }
}
