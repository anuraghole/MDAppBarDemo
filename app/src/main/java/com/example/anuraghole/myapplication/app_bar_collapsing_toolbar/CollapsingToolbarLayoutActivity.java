package com.example.anuraghole.myapplication.app_bar_collapsing_toolbar;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anuraghole.myapplication.R;

public class CollapsingToolbarLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_layout);

        CollapsingToolbarLayout collapsingToolbarLayout=findViewById(R.id.collapsingToolbar);
        collapsingToolbarLayout.setTitle("Collapsing Toolbar");
    }
}
