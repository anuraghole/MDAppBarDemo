package com.example.anuraghole.myapplication.toolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.anuraghole.myapplication.R;

public class ToolbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
    }

    public void toolbarAsActionBar(View view) {
        startActivity(new Intent(this,ToolbarAsActionBarActivity.class));

    }

    public void standAloneToolabr(View view) {
        startActivity(new Intent(this,ToolbarStandAloneActivity.class));

    }

    public void contextualMenuToolbar(View view) {
        startActivity(new Intent(this,ToolbarContextualMenuActivity.class));

    }
}
