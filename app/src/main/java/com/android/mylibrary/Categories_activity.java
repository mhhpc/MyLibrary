package com.android.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import com.android.mylibrary.Categories.Cat_emotional;
import com.android.mylibrary.Categories.Cat_fun;
import com.android.mylibrary.Categories.Cat_instructive;
import com.android.mylibrary.Categories.Cat_religious;
import com.android.mylibrary.Categories.Cat_sad;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Categories_activity extends AppCompatActivity {

    private TextSize settingsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        //Change text size
        settingsManager = new TextSize(this);
        TextView Textview1 = findViewById(R.id.t1);
        TextView Textview2 = findViewById(R.id.t2);
        TextView Textview3 = findViewById(R.id.t3);
        TextView Textview4 = findViewById(R.id.t4);
        TextView Textview5 = findViewById(R.id.t5);

        float textSize = settingsManager.getTextSize();
        Textview1.setTextSize(textSize);
        Textview2.setTextSize(textSize);
        Textview3.setTextSize(textSize);
        Textview4.setTextSize(textSize);
        Textview5.setTextSize(textSize);

        //Animation ------------
        final ViewGroup r = findViewById(R.id.nested_scrollview);
        final LinearLayout t1 = findViewById(R.id.list1);
        final LinearLayout t2 = findViewById(R.id.list2);
        final LinearLayout t3 = findViewById(R.id.list3);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Slide();
                transition.setDuration(600);
                TransitionManager.beginDelayedTransition(r, transition);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
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

        // onclick
        @SuppressLint("CutPasteId") LinearLayout ln1 = (LinearLayout) findViewById(R.id.item1);
        ln1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Categories_activity.this, Cat_emotional.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout ln2 = (LinearLayout) findViewById(R.id.item2);
        ln2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Categories_activity.this, Cat_religious.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout ln3 = (LinearLayout) findViewById(R.id.item3);
        ln3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Categories_activity.this, Cat_sad.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout ln4 = (LinearLayout) findViewById(R.id.item4);
        ln4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Categories_activity.this, Cat_fun.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout ln5 = (LinearLayout) findViewById(R.id.item5);
        ln5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Categories_activity.this, Cat_instructive.class));
            }
        });

        //Image links
        ImageView imageView0 = (ImageView) findViewById(R.id.image);
        Picasso.get().load("https://s8.uupload.ir/files/application_945j.png").placeholder(R.drawable.logo2).into(imageView0);

        ImageView imageView1 = (ImageView) findViewById(R.id.pic1);
        Picasso.get().load("https://s8.uupload.ir/files/emotional_pu6n.png").placeholder(R.drawable.logo3).into(imageView1);

        ImageView imageView2 = (ImageView) findViewById(R.id.pic2);
        Picasso.get().load("https://s8.uupload.ir/files/prayer-rug_cfg0.png").placeholder(R.drawable.logo3).into(imageView2);

        ImageView imageView3 = (ImageView) findViewById(R.id.pic3);
        Picasso.get().load("https://s8.uupload.ir/files/sad-face_pwgd.png").placeholder(R.drawable.logo3).into(imageView3);

        ImageView imageView4 = (ImageView) findViewById(R.id.pic4);
        Picasso.get().load("https://s8.uupload.ir/files/happy_kjty.png").placeholder(R.drawable.logo3).into(imageView4);

        ImageView imageView5 = (ImageView) findViewById(R.id.pic5);
        Picasso.get().load("https://s8.uupload.ir/files/learning_gb2p.png").placeholder(R.drawable.logo3).into(imageView5);

    }
}