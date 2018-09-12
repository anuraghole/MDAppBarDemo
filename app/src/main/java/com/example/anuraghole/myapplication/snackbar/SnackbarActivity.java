package com.example.anuraghole.myapplication.snackbar;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.anuraghole.myapplication.R;

public class SnackbarActivity extends AppCompatActivity {

    CoordinatorLayout rootLayout;
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);
        rootLayout =findViewById(R.id.frameLayout);
        fab=findViewById(R.id.fab);
        
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // Toast.makeText(SnackbarActivity.this, "FAB Clicked", Toast.LENGTH_SHORT).show();

                Snackbar.make(rootLayout,"Simple Snackbar",Snackbar.LENGTH_SHORT).show();
            }
        });
    }


    public void callSimpleSnackbar(View view) {
        //startActivity(new Intent(this,SimpleSnackbarActivity.class));

        Snackbar.make(rootLayout,"Simple Snackbar",Snackbar.LENGTH_SHORT).show();

    }

    public void callSnackbarActionCallback(View view) {
        //startActivity(new Intent(this,SncakbarActionCallbackActivity.class));
       Snackbar snackbar= Snackbar.make(rootLayout,"No Internet Connection..!",Snackbar.LENGTH_LONG);
       snackbar.setAction("Retry", new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                Snackbar.make(rootLayout,"Retry Clicked",Snackbar.LENGTH_SHORT).show();
           }
       }).show();
    }

    public void callCustomSnackbar(View view) {
     //   startActivity(new Intent(this,CustomSnackbarActivity.class));
    }
}
