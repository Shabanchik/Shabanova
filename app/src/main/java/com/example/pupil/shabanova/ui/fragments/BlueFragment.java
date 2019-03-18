package com.example.pupil.shabanova.ui.fragments;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.pupil.shabanova.R;
import com.example.pupil.shabanova.ui.base.BaseFragment;

public class BlueFragment extends BaseFragment {

    private BlueViewModel mViewModel;
    Button btn;


    public static BlueFragment newInstance() {
        return new BlueFragment();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.blue_fragment, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(BlueViewModel.class);
        btn=getView().findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.setIsActive(true);
            }
        });
        mViewModel.isActive.observe(this,new Observer<Boolean>() {

            @Override
            public void onChanged(@Nullable Boolean aBoolean) {
                Toast.makeText(getContext(), "isActive = " + String.valueOf(aBoolean), Toast.LENGTH_SHORT).show();
            }
        });

}

    @Override
    public String getName() {
        return "Blue";
    }
}
