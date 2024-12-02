package com.android.mylibrary.Stories;


import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.android.mylibrary.ImageLoaderUtil;
import com.android.mylibrary.R;
import com.android.mylibrary.TextSize;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Fade;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import java.util.Random;

public class Sto10_activity extends AppCompatActivity {

    private TextSize settingsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        //Set text
        ((TextView) findViewById(R.id.tv1)).setText(getString(R.string.stories_tsto10));
        ((TextView) findViewById(R.id.t1)).setText(getString(R.string.sto10_t1));

        //Change text size
        settingsManager = new TextSize(this);
        TextView Textview1 = findViewById(R.id.tv1);
        TextView Textview2 = findViewById(R.id.t1);
        TextView Textview3 = findViewById(R.id.t2);
        TextView Textview4 = findViewById(R.id.t3);
        TextView Textview5 = findViewById(R.id.t4);
        TextView Textview6 = findViewById(R.id.t5);

        float textSize = settingsManager.getTextSize();
        Textview1.setTextSize(textSize);
        Textview2.setTextSize(textSize);
        Textview3.setTextSize(textSize);
        Textview4.setTextSize(textSize);
        Textview5.setTextSize(textSize);
        Textview6.setTextSize(textSize);


        //Animation ------------
        final ViewGroup r = findViewById(R.id.story);
        final RelativeLayout t0 = findViewById(R.id.view);
        final TextView t1 = findViewById(R.id.t1);
        final ImageView t2 = findViewById(R.id.im1);
        final TextView t3 = findViewById(R.id.t2);
        final ImageView t4 = findViewById(R.id.im2);
        final TextView t5 = findViewById(R.id.t3);
        final ImageView t6 = findViewById(R.id.im3);
        final TextView t7 = findViewById(R.id.t4);
        final ImageView t8 = findViewById(R.id.im4);
        final TextView t9 = findViewById(R.id.t5);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Slide();
                transition.setDuration(600);
                TransitionManager.beginDelayedTransition(r, transition);
                t0.setVisibility(View.VISIBLE);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.GONE);
                t3.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                t6.setVisibility(View.GONE);
                t7.setVisibility(View.GONE);
                t8.setVisibility(View.GONE);
                t9.setVisibility(View.GONE);

            }
        }, 200);

        //Gradient
        ConstraintLayout constraintLayout = findViewById(R.id.story);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

//Random show top image
        ImageView imageView = findViewById(R.id.iv1);
        ImageLoaderUtil.loadRandomImage(imageView);

        ImageView imageView1 = (ImageView) findViewById(R.id.imv1);
        Picasso.get().load("https://s8.uupload.ir/files/kvkrovbjr_qq4w.jpg").noFade().error(R.drawable.error).into(imageView1);

    }
}