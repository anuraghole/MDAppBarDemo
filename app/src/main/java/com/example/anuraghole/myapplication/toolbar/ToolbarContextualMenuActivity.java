package com.example.anuraghole.myapplication.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.example.anuraghole.myapplication.R;

public class ToolbarContextualMenuActivity extends AppCompatActivity {

    Toolbar toolbar;
    Button btnContextual;
    ActionMode actionMode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextual_menu_toolbar);
        btnContextual=findViewById(R.id.btnContextual);
        setContextualToolbar();

        btnContextual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionMode=ToolbarContextualMenuActivity.this.startActionMode(new ContextualCallback());
            }
        });
    }


    private void setContextualToolbar() {
        toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("Contextual Toolbar ");
        toolbar.setSubtitle("Contextual Subtitle");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.inflateMenu(R.menu.menu);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                String message = "";
                switch (item.getItemId()) {

                    case R.id.save:
                        //Toast.makeText(this, item.getTitle().toString() + " : Selected", Toast.LENGTH_SHORT).show();
                        message = item.getTitle().toString();
                        break;

                    case R.id.setting:
                        // Toast.makeText(this, item.getTitle().toString() + " : Selected", Toast.LENGTH_SHORT).show();
                        message = item.getTitle().toString();
                        break;

                    case R.id.help:
                        //Toast.makeText(this, item.getTitle().toString() + " : Selected", Toast.LENGTH_SHORT).show();
                        message = item.getTitle().toString();
                        break;

                    case R.id.webSearch:
                        //Toast.makeText(this, item.getTitle().toString() + " : Selected", Toast.LENGTH_SHORT).show();
                        message = item.getTitle().toString();
                        break;

                    case R.id.mail:
                        //Toast.makeText(this, item.getTitle().toString() + " : Selected", Toast.LENGTH_SHORT).show();
                        message = item.getTitle().toString();
                        break;


                }
                Toast.makeText(ToolbarContextualMenuActivity.this, message + " : Selected", Toast.LENGTH_SHORT).show();

                return true;
            }

        });
    }

    private class ContextualCallback implements ActionMode.Callback {

        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {

           getMenuInflater().inflate(R.menu.contextual_menu,menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            actionMode.setTitle("Action");
            actionMode.setSubtitle("Subtitle");
            return true;
        }



        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem item) {

            String message="";
            switch (item.getItemId()) {

                case R.id.save:
                    //Toast.makeText(this, item.getTitle().toString() + " : Selected", Toast.LENGTH_SHORT).show();
                    message = item.getTitle().toString();
                    break;

                case R.id.setting:
                    // Toast.makeText(this, item.getTitle().toString() + " : Selected", Toast.LENGTH_SHORT).show();
                    message = item.getTitle().toString();
                    break;

                case R.id.help:
                    //Toast.makeText(this, item.getTitle().toString() + " : Selected", Toast.LENGTH_SHORT).show();
                    message = item.getTitle().toString();
                    break;

                case R.id.webSearch:
                    //Toast.makeText(this, item.getTitle().toString() + " : Selected", Toast.LENGTH_SHORT).show();
                    message = item.getTitle().toString();
                    break;

                case R.id.mail:
                    //Toast.makeText(this, item.getTitle().toString() + " : Selected", Toast.LENGTH_SHORT).show();
                    message = item.getTitle().toString();
                    break;


            }
            Toast.makeText(ToolbarContextualMenuActivity.this, message+" : Clicked", Toast.LENGTH_SHORT).show();
            return true;
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {

            Toast.makeText(ToolbarContextualMenuActivity.this, "Destroyed", Toast.LENGTH_SHORT).show();

        }

    }
}
