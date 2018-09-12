package com.example.anuraghole.myapplication.animation;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anuraghole.myapplication.R;

public class RippleEffectActivity extends AppCompatActivity {

    TextView rwb,rwob,crwb,crwob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripple_effect);
        /*init();
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP) {
            crwb.setBackground(getDrawable(R.drawable.custom_ripple_border));
            crwob.setBackground(getDrawable(R.drawable.custom_ripple_borderless));
        }
        setListeners();*/

    }

    private void setRippleBG() {
       
    }

    private void setListeners() {
        rwb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RippleEffectActivity.this, "clicked", Toast.LENGTH_SHORT).show();
            }
        });

        rwob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        crwb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        crwob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

   /* private void init() {
        rwb=findViewById(R.id.rwb);
        rwob=findViewById(R.id.rwob);
        crwb=findViewById(R.id.crwb);
        crwob=findViewById(R.id.crwob);

    }
*/
    private boolean manageCompatibility() {
        
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            
            return true;
        }

        return false;
    }

    public void dummyClick(View view) {

    }
}
