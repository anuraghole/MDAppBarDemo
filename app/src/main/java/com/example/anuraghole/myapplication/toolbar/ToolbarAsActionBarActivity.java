package com.example.anuraghole.myapplication.toolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.anuraghole.myapplication.R;

public class ToolbarAsActionBarActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar_as_action_bar);
        setToolbarAsActionBar();
    }

    private void setToolbarAsActionBar() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setTitle("Action BAR Toolbar");
        toolbar.setSubtitle("Subtitle");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        String message = "";
        switch (item.getItemId()) {

            case R.id.save:
                //Toast.makeText(this, item.getTitle().toString() + " : Selected", Toast.LENGTH_SHORT).show();
                message=item.getTitle().toString();
                break;

            case R.id.setting:
               // Toast.makeText(this, item.getTitle().toString() + " : Selected", Toast.LENGTH_SHORT).show();
                message=item.getTitle().toString();
                break;

            case R.id.help:
                //Toast.makeText(this, item.getTitle().toString() + " : Selected", Toast.LENGTH_SHORT).show();
                message=item.getTitle().toString();
                break;

            case R.id.webSearch:
                //Toast.makeText(this, item.getTitle().toString() + " : Selected", Toast.LENGTH_SHORT).show();
                message=item.getTitle().toString();
                break;

            case R.id.mail:
                //Toast.makeText(this, item.getTitle().toString() + " : Selected", Toast.LENGTH_SHORT).show();
                message=item.getTitle().toString();
                break;


        }
        Toast.makeText(this, message+ " : Selected", Toast.LENGTH_SHORT).show();


        return super.onOptionsItemSelected(item);
    }
}
