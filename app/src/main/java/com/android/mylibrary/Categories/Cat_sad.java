package com.android.mylibrary.Categories;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.graphics.Insets;
import androidx.core.util.Pair;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;

import com.android.mylibrary.R;
import com.android.mylibrary.Stories.Sto12_activity;
import com.android.mylibrary.Stories.Sto22_activity;
import com.android.mylibrary.Stories.Sto25_activity;
import com.android.mylibrary.Stories.Sto29_activity;
import com.android.mylibrary.Stories.Sto32_activity;
import com.android.mylibrary.Stories.Sto35_activity;
import com.android.mylibrary.Stories.Sto3_activity;
import com.android.mylibrary.Stories.Sto4_activity;
import com.android.mylibrary.Stories.Sto54_activity;
import com.android.mylibrary.Stories.Sto55_activity;
import com.android.mylibrary.Stories.Sto56_activity;
import com.android.mylibrary.Stories.Sto9_activity;
import com.android.mylibrary.TextSize;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Cat_sad extends AppCompatActivity {

    private TextSize settingsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_sad);

        //Change text size
        settingsManager = new TextSize(this);
        TextView Textview4 = findViewById(R.id.tv4);
        TextView Textview12 = findViewById(R.id.tv12);
        TextView Textview22 = findViewById(R.id.tv22);
        TextView Textview25 = findViewById(R.id.tv25);
        TextView Textview32 = findViewById(R.id.tv32);
        TextView Textview35 = findViewById(R.id.tv35);

        float textSize = settingsManager.getTextSize();
        Textview4.setTextSize(textSize);
        Textview12.setTextSize(textSize);
        Textview22.setTextSize(textSize);
        Textview25.setTextSize(textSize);
        Textview32.setTextSize(textSize);
        Textview35.setTextSize(textSize);

        //Animation ------------
        final ViewGroup r = findViewById(R.id.nested_scrollview);
        final LinearLayout t1 = findViewById(R.id.menu1);
        final LinearLayout t2 = findViewById(R.id.menu2);
        final LinearLayout t3 = findViewById(R.id.menu3);


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

        @SuppressLint("CutPasteId") CardView cv4 = (CardView) findViewById(R.id.mcv4);
        cv4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv4), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv4), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_sad.this, pair1, pair2);

                Intent intent = new Intent(Cat_sad.this, Sto4_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv12 = (CardView) findViewById(R.id.mcv12);
        cv12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv12), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv12), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_sad.this, pair1, pair2);

                Intent intent = new Intent(Cat_sad.this, Sto12_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv22 = (CardView) findViewById(R.id.mcv22);
        cv22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv22), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv22), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_sad.this, pair1, pair2);

                Intent intent = new Intent(Cat_sad.this, Sto22_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv25 = (CardView) findViewById(R.id.mcv25);
        cv25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv25), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv25), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_sad.this, pair1, pair2);

                Intent intent = new Intent(Cat_sad.this, Sto25_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv32 = (CardView) findViewById(R.id.mcv32);
        cv32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv32), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv32), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_sad.this, pair1, pair2);

                Intent intent = new Intent(Cat_sad.this, Sto32_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv35 = (CardView) findViewById(R.id.mcv35);
        cv35.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv35), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv35), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_sad.this, pair1, pair2);

                Intent intent = new Intent(Cat_sad.this, Sto35_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        //Image links
        ImageView imageView0 = (ImageView) findViewById(R.id.image);
        Picasso.get().load("https://s8.uupload.ir/files/sad-face_pwgd.png").placeholder(R.drawable.logo2).into(imageView0);

        ImageView imageView4 = (ImageView) findViewById(R.id.miv4);
        Picasso.get().load("https://s8.uupload.ir/files/most-expensive-homes-042616-hero1_v0hj.jpg").placeholder(R.drawable.logo3).into(imageView4);

        ImageView imageView12 = (ImageView) findViewById(R.id.miv12);
        Picasso.get().load("https://s8.uupload.ir/files/jakav.com-ax-photo-tabiat-nature-tasavir-iran-ranginkaman_o1u6.jpg").placeholder(R.drawable.logo3).into(imageView12);

        ImageView imageView22 = (ImageView) findViewById(R.id.miv22);
        Picasso.get().load("https://s8.uupload.ir/files/shoe-tools9_4nr7.jpg").placeholder(R.drawable.logo3).into(imageView22);

        ImageView imageView25 = (ImageView) findViewById(R.id.miv25);
        Picasso.get().load("https://s8.uupload.ir/files/circus-vancouver-1024x694_75u.jpg").placeholder(R.drawable.logo3).into(imageView25);

        ImageView imageView32 = (ImageView) findViewById(R.id.miv32);
        Picasso.get().load("https://s8.uupload.ir/files/whitepelican_edit_shadowlift_muhg.jpg").placeholder(R.drawable.logo3).into(imageView32);

        ImageView imageView35 = (ImageView) findViewById(R.id.miv35);
        Picasso.get().load("https://s8.uupload.ir/files/coffee-menu4_tkm2.jpg").placeholder(R.drawable.logo3).into(imageView35);


    }
}