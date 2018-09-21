package com.example.anuraghole.myapplication.app_bar_collapsing_toolbar.view_pager_fragment;


import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.anuraghole.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BluetoothFragment extends Fragment {

    CoordinatorLayout rootLayout;
    FloatingActionButton fab;

    public BluetoothFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bluetooth, container, false);

        fab=view.findViewById(R.id.fab);
        //rootLayout=view.findViewById(R.id.rootLayout);

        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Toast.makeText(SnackbarActivity.this, "FAB Clicked", Toast.LENGTH_SHORT).show();

                Snackbar.make(rootLayout,"Simple Snackbar",Snackbar.LENGTH_SHORT).show();
            }
        });
       */
        return view;

    }

}
