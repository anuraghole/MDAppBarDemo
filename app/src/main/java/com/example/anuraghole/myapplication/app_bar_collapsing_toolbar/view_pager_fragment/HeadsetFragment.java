package com.example.anuraghole.myapplication.app_bar_collapsing_toolbar.view_pager_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.anuraghole.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HeadsetFragment extends Fragment {


    public HeadsetFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_headset, container, false);
    }

}
