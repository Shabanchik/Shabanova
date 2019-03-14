package com.example.pupil.shabanova.ui.fragments;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pupil.shabanova.R;
import com.example.pupil.shabanova.ui.base.BaseFragment;

public class YellowFragment extends BaseFragment {

    private YellowViewModel mViewModel;

    public static YellowFragment newInstance() {
        return new YellowFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.yellow_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(YellowViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public String getName() {
        return "Yellow";
    }
}
