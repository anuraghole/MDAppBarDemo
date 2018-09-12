package com.example.anuraghole.myapplication.animation;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.anuraghole.myapplication.R;

public class TransitionsActivity extends AppCompatActivity {

    ImageView ivShared;
    LinearLayout llInfoShared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transitions);
        ivShared = findViewById(R.id.ivShared);
        llInfoShared = findViewById(R.id.llInfoShared);

    }

    public void sharedElementTransitions(View view) {
        //min sdk 16(Jelly bean) is require for
            Pair[] pair = new Pair[2];
            pair[0] = new Pair<View, String>(ivShared, "iv_shared");
            pair[1] = new Pair<View, String>(llInfoShared, "ll_info_shared");

            ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this,pair);


            Intent intent = new Intent(this, FullTransitionActivity.class);
            startActivity(intent, options.toBundle());
    }
}
