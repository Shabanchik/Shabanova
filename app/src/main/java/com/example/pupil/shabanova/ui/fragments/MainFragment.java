package com.example.pupil.shabanova.ui.fragments;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pupil.shabanova.R;
import com.example.pupil.shabanova.ui.base.BaseFragment;

public class MainFragment extends BaseFragment {//лемент вю , но элементы принадлежат одной активитилемент вю , но элементы принадлежат одной активитилемент вю , но элементы принадлежат одной активитилемент вю , но элементы принадлежат одной активитилемент вю , но элементы принадлежат одной активитилемент вю , но элементы принадлежат одной активитилемент вю , но элементы принадлежат одной активитилемент вю , но элементы принадлежат одной активитилемент вю , но элементы принадлежат одной активитилемент вю , но элементы принадлежат одной активитилемент вю , но элементы принадлежат одной активитилемент вю , но элементы принадлежат одной активитилемент вю , но элементы принадлежат одной активити

    @Override
    public String getName() {
        return "Main";
    }

    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }

}
