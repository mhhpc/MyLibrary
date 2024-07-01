package com.android.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Stories_activity extends AppCompatActivity {

    private TextSize settingsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);

        //Change text size
        settingsManager = new TextSize(this);
        TextView Textview1 = findViewById(R.id.tv1);
        TextView Textview2 = findViewById(R.id.tv2);
        TextView Textview3 = findViewById(R.id.tv3);
        TextView Textview4 = findViewById(R.id.tv4);
        TextView Textview5 = findViewById(R.id.tv5);
        TextView Textview6 = findViewById(R.id.tv6);
        TextView Textview7 = findViewById(R.id.tv7);
        TextView Textview8 = findViewById(R.id.tv8);
        TextView Textview9 = findViewById(R.id.tv9);
        TextView Textview10 = findViewById(R.id.tv10);

        float textSize = settingsManager.getTextSize();
        Textview1.setTextSize(textSize);
        Textview2.setTextSize(textSize);
        Textview3.setTextSize(textSize);
        Textview4.setTextSize(textSize);
        Textview5.setTextSize(textSize);
        Textview6.setTextSize(textSize);
        Textview7.setTextSize(textSize);
        Textview8.setTextSize(textSize);
        Textview9.setTextSize(textSize);
        Textview10.setTextSize(textSize);

        //Animation ------------
        final ViewGroup r = findViewById(R.id.nested_scrollview);
        final LinearLayout t1 = findViewById(R.id.menu1);
        final LinearLayout t2 = findViewById(R.id.menu2);
        final LinearLayout t3 = findViewById(R.id.menu3);
        final LinearLayout t4 = findViewById(R.id.menu4);
        final LinearLayout t5 = findViewById(R.id.menu5);
        final LinearLayout t6 = findViewById(R.id.menu6);
        final LinearLayout t7 = findViewById(R.id.menu7);
        final LinearLayout t8 = findViewById(R.id.menu8);
        final LinearLayout t9 = findViewById(R.id.menu9);
        final LinearLayout t10 = findViewById(R.id.menu10);
        final LinearLayout t11 = findViewById(R.id.menu11);
        final LinearLayout t12 = findViewById(R.id.menu12);
        final LinearLayout t13 = findViewById(R.id.menu13);
        final LinearLayout t14 = findViewById(R.id.menu14);
        final LinearLayout t15 = findViewById(R.id.menu15);
        final LinearLayout t16 = findViewById(R.id.menu16);
        final LinearLayout t17 = findViewById(R.id.menu17);
        final LinearLayout t18 = findViewById(R.id.menu18);
        final LinearLayout t19 = findViewById(R.id.menu19);
        final LinearLayout t20 = findViewById(R.id.menu20);
        final LinearLayout t21 = findViewById(R.id.menu21);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Slide();
                transition.setDuration(600);
                TransitionManager.beginDelayedTransition(r, transition);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                t7.setVisibility(View.VISIBLE);
                t8.setVisibility(View.VISIBLE);
                t9.setVisibility(View.VISIBLE);
                t10.setVisibility(View.VISIBLE);
                t11.setVisibility(View.VISIBLE);
                t12.setVisibility(View.VISIBLE);
                t13.setVisibility(View.VISIBLE);
                t14.setVisibility(View.VISIBLE);
                t15.setVisibility(View.VISIBLE);
                t16.setVisibility(View.VISIBLE);
                t17.setVisibility(View.VISIBLE);
                t18.setVisibility(View.VISIBLE);
                t19.setVisibility(View.VISIBLE);
                t20.setVisibility(View.VISIBLE);
                t21.setVisibility(View.VISIBLE);
            }
        }, 200);

        //Gradient
        NestedScrollView nestedScrollView = findViewById(R.id.nested_scrollview);
        AnimationDrawable animationDrawable = (AnimationDrawable) nestedScrollView.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);
        AnimationDrawable animationDrawable2 = (AnimationDrawable) collapsingToolbarLayout.getBackground();
        animationDrawable2.setEnterFadeDuration(2000);
        animationDrawable2.setExitFadeDuration(4000);
        animationDrawable2.start();

        //Image links
        ImageView imageView0 = (ImageView) findViewById(R.id.image);
        Picasso.get().load("https://s8.uupload.ir/files/open-book_auok.png").placeholder(R.drawable.logo2).into(imageView0);
    }
}