package com.example.pupil.shabanova;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.pupil.shabanova.ui.adapters.MyFragmentPagerAgapters;
import com.example.pupil.shabanova.ui.fragments.MainFragment;
import com.example.pupil.shabanova.ui.fragments.RoseFragment;
import com.example.pupil.shabanova.ui.fragments.TifanyFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.container);
        Fragment mainFragment= new MainFragment();//с помощью этого мы фрагмент помещается в контейнер 19-21
        Fragment roseFragment= new RoseFragment();
        Fragment tifanyFragment= new TifanyFragment();
        ArrayList<Fragment> fragments=new ArrayList<Fragment>();
        fragments.add(mainFragment);
        fragments.add(roseFragment);
        fragments.add(tifanyFragment);
        MyFragmentPagerAgapters adapter= new MyFragmentPagerAgapters(getSupportFragmentManager());
        adapter.setList(fragments);
        viewPager.setAdapter(adapter);
       // FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
       // fragmentTransaction.replace(R.id.container,mainFragment);
       // fragmentTransaction.commit();
    }
}
