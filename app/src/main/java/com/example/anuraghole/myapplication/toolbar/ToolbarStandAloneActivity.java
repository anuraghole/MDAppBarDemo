package com.example.anuraghole.myapplication.toolbar;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.anuraghole.myapplication.R;

public class ToolbarStandAloneActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stand_alone);
        setToolbar();

        toolbar.inflateMenu(R.menu.menu);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                String title = menuItem.getTitle().toString();

                Toast.makeText(ToolbarStandAloneActivity.this, title+" : Selected", Toast.LENGTH_SHORT).show();

                switch (menuItem.getItemId()){
                    case R.id.save:

                        break;

                    case R.id.setting:

                        break;
                    case R.id.help:

                        break;

                        /* we can implement many more like above  */
                }
                return true;
            }
        });

    }

    private void setToolbar() {
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Stand Alone Toolbar");
        toolbar.setSubtitle("Sub Title Toolbar");
        //toolbar.setLogo(R.drawable.ic_launcher_foreground);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);


        /* condition check through java code for elevation property */

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setElevation(10f);

        }
    }
}
