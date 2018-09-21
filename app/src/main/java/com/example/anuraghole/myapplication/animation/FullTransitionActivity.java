package com.example.anuraghole.myapplication.animation;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.Toast;

import com.example.anuraghole.myapplication.Constants;
import com.example.anuraghole.myapplication.R;

public class FullTransitionActivity extends AppCompatActivity {
    private static final String TAG = FullTransitionActivity.class.getSimpleName();
    Constants.TransitionType type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //inside your activity (if you did not enable transition in your theme )
        //for AppCompat getWindow must be called before calling super.onCreate()
        //must be called before setContentView()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_transition);
        initPage();
        initAnimation();

    }

    private void initPage() {
        type = (Constants.TransitionType) getIntent().getSerializableExtra(Constants.KEY_ANIM_TYPE);
        Log.d(TAG, "initAnimation: "+type);
    }

    private void initAnimation() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            switch (type) {


                case EXPLODE_JAVA:
                    Explode enterTransition = new Explode();
                    enterTransition.setInterpolator(new LinearInterpolator());//try different Interpolators
                    enterTransition.setDuration(getResources().getInteger(R.integer.anim_duration_long));
                    getWindow().setEnterTransition(enterTransition);
                    break;

                case EXPLODE_XML:
                    Transition transition = TransitionInflater.from(this).inflateTransition(R.transition.xplode_transition);
                    getWindow().setEnterTransition(transition);
                    break;

                case SLIDE_JAVA:
                    Slide slide = new Slide();
                    slide.setInterpolator(new LinearInterpolator());//try different Interpolators
                    slide.setSlideEdge(Gravity.TOP);
                    slide.setDuration(getResources().getInteger(R.integer.anim_duration_long));
                    getWindow().setEnterTransition(slide);
                    break;

                case SLIDE_XML:
                    Transition slidetransition = TransitionInflater.from(this).inflateTransition(R.transition.slide_transition);
                    getWindow().setEnterTransition(slidetransition);
                    break;

                case FADE_JAVA:
                    Fade fade = new Fade();
                  //  fade.setInterpolator(new LinearInterpolator());//try different Interpolators
                 //   fade.setSlideEdge(Gravity.TOP);
                    fade.setDuration(getResources().getInteger(R.integer.anim_duration_long));
                    getWindow().setEnterTransition(fade);
                    break;

                case FADE_XML:
                    Transition fadetransition = TransitionInflater.from(this).inflateTransition(R.transition.fade_taransition);
                    getWindow().setEnterTransition(fadetransition);
                    break;
                case NONE:
                  break;
            }
        }
    }

    public void goBack(View view) {
        onBackPressed();
    }
}
