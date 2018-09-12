package com.example.anuraghole.myapplication;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;

import com.example.anuraghole.myapplication.animation.FullTransitionActivity;
import com.example.anuraghole.myapplication.animation.TransitionsActivity;
import com.example.anuraghole.myapplication.animation.RippleEffectActivity;
import com.example.anuraghole.myapplication.snackbar.SnackbarActivity;
import com.example.anuraghole.myapplication.toolbar.ToolbarActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpWindowAnimation();
    }

    //slide transition animation for main activity when return back from another activity
    private void setUpWindowAnimation(){
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Slide slideTransition=new Slide();
            slideTransition.setSlideEdge(Gravity.TOP);
            slideTransition.setDuration(1000);
            getWindow().setReenterTransition(slideTransition);
           // getWindow().setEnterTransition(slideTransition);
            getWindow().setAllowReturnTransitionOverlap(false);
        }

    }

    public void toolbarExample(View view) {
        startActivity(new Intent(this,ToolbarActivity.class));
    }

    public void snackbarExample(View view) {
        startActivity(new Intent(this, SnackbarActivity.class));
    }


    public void rippleEffects(View view) {
        startActivity(new Intent(this, RippleEffectActivity.class));
    }

    public void activityTransitions(View view) {
        startActivity(new Intent(this, TransitionsActivity.class));
    }

    public void explodeTransitionXml(View view) {
        ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(this);

        Intent intent=new Intent(this, FullTransitionActivity.class);
        intent.putExtra(Constants.KEY_ANIM_TYPE,Constants.TransitionType.EXPLODE_XML);
        startActivity(intent,optionsCompat.toBundle());
    }

    public void explodeTransitionJava(View view) {
        ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(this);

        Intent intent=new Intent(this, FullTransitionActivity.class);
        intent.putExtra(Constants.KEY_ANIM_TYPE,Constants.TransitionType.EXPLODE_JAVA);
        startActivity(intent,optionsCompat.toBundle());
    }

    public void slideTransitionJava(View view) {
        ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(this);
        Intent intent=new Intent(this, FullTransitionActivity.class);
        intent.putExtra(Constants.KEY_ANIM_TYPE,Constants.TransitionType.SLIDE_JAVA);
        startActivity(intent,optionsCompat.toBundle());
    }

    public void slideTransitionXml(View view) {
        ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(this);
        Intent intent=new Intent(this, FullTransitionActivity.class);
        intent.putExtra(Constants.KEY_ANIM_TYPE,Constants.TransitionType.SLIDE_XML);
        startActivity(intent,optionsCompat.toBundle());
    }

    public void fadeTransitionXml(View view) {
        ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(this);
        Intent intent=new Intent(this, FullTransitionActivity.class);
        intent.putExtra(Constants.KEY_ANIM_TYPE,Constants.TransitionType.FADE_XML);
        startActivity(intent,optionsCompat.toBundle());
    }

    public void fadeTransitionJava(View view) {
        ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(this);
        Intent intent=new Intent(this, FullTransitionActivity.class);
        intent.putExtra(Constants.KEY_ANIM_TYPE,Constants.TransitionType.FADE_JAVA);
        startActivity(intent,optionsCompat.toBundle());
    }


}
