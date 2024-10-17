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
import com.android.mylibrary.Stories.Sto10_activity;
import com.android.mylibrary.Stories.Sto11_activity;
import com.android.mylibrary.Stories.Sto12_activity;
import com.android.mylibrary.Stories.Sto13_activity;
import com.android.mylibrary.Stories.Sto14_activity;
import com.android.mylibrary.Stories.Sto15_activity;
import com.android.mylibrary.Stories.Sto16_activity;
import com.android.mylibrary.Stories.Sto17_activity;
import com.android.mylibrary.Stories.Sto18_activity;
import com.android.mylibrary.Stories.Sto19_activity;
import com.android.mylibrary.Stories.Sto1_activity;
import com.android.mylibrary.Stories.Sto20_activity;
import com.android.mylibrary.Stories.Sto21_activity;
import com.android.mylibrary.Stories.Sto22_activity;
import com.android.mylibrary.Stories.Sto23_activity;
import com.android.mylibrary.Stories.Sto24_activity;
import com.android.mylibrary.Stories.Sto25_activity;
import com.android.mylibrary.Stories.Sto26_activity;
import com.android.mylibrary.Stories.Sto27_activity;
import com.android.mylibrary.Stories.Sto28_activity;
import com.android.mylibrary.Stories.Sto29_activity;
import com.android.mylibrary.Stories.Sto2_activity;
import com.android.mylibrary.Stories.Sto30_activity;
import com.android.mylibrary.Stories.Sto31_activity;
import com.android.mylibrary.Stories.Sto32_activity;
import com.android.mylibrary.Stories.Sto33_activity;
import com.android.mylibrary.Stories.Sto34_activity;
import com.android.mylibrary.Stories.Sto35_activity;
import com.android.mylibrary.Stories.Sto36_activity;
import com.android.mylibrary.Stories.Sto37_activity;
import com.android.mylibrary.Stories.Sto38_activity;
import com.android.mylibrary.Stories.Sto39_activity;
import com.android.mylibrary.Stories.Sto3_activity;
import com.android.mylibrary.Stories.Sto40_activity;
import com.android.mylibrary.Stories.Sto41_activity;
import com.android.mylibrary.Stories.Sto42_activity;
import com.android.mylibrary.Stories.Sto43_activity;
import com.android.mylibrary.Stories.Sto44_activity;
import com.android.mylibrary.Stories.Sto45_activity;
import com.android.mylibrary.Stories.Sto46_activity;
import com.android.mylibrary.Stories.Sto47_activity;
import com.android.mylibrary.Stories.Sto48_activity;
import com.android.mylibrary.Stories.Sto49_activity;
import com.android.mylibrary.Stories.Sto4_activity;
import com.android.mylibrary.Stories.Sto50_activity;
import com.android.mylibrary.Stories.Sto51_activity;
import com.android.mylibrary.Stories.Sto52_activity;
import com.android.mylibrary.Stories.Sto53_activity;
import com.android.mylibrary.Stories.Sto54_activity;
import com.android.mylibrary.Stories.Sto55_activity;
import com.android.mylibrary.Stories.Sto56_activity;
import com.android.mylibrary.Stories.Sto57_activity;
import com.android.mylibrary.Stories.Sto58_activity;
import com.android.mylibrary.Stories.Sto59_activity;
import com.android.mylibrary.Stories.Sto5_activity;
import com.android.mylibrary.Stories.Sto60_activity;
import com.android.mylibrary.Stories.Sto6_activity;
import com.android.mylibrary.Stories.Sto7_activity;
import com.android.mylibrary.Stories.Sto8_activity;
import com.android.mylibrary.Stories.Sto9_activity;
import com.android.mylibrary.Stories_activity;
import com.android.mylibrary.TextSize;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Cat_emotional extends AppCompatActivity {

    private TextSize settingsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_emotional);

        //Change text size
        settingsManager = new TextSize(this);
        TextView Textview1 = findViewById(R.id.tv1);
        TextView Textview4 = findViewById(R.id.tv4);
        TextView Textview8 = findViewById(R.id.tv8);
        TextView Textview12 = findViewById(R.id.tv12);
        TextView Textview14 = findViewById(R.id.tv14);
        TextView Textview25 = findViewById(R.id.tv25);
        TextView Textview29 = findViewById(R.id.tv29);
        TextView Textview32 = findViewById(R.id.tv32);
        TextView Textview35 = findViewById(R.id.tv35);
        TextView Textview46 = findViewById(R.id.tv46);

        float textSize = settingsManager.getTextSize();
        Textview1.setTextSize(textSize);
        Textview4.setTextSize(textSize);
        Textview8.setTextSize(textSize);
        Textview12.setTextSize(textSize);
        Textview14.setTextSize(textSize);
        Textview25.setTextSize(textSize);
        Textview29.setTextSize(textSize);
        Textview32.setTextSize(textSize);
        Textview35.setTextSize(textSize);
        Textview46.setTextSize(textSize);

        //Animation ------------
        final ViewGroup r = findViewById(R.id.nested_scrollview);
        final LinearLayout t1 = findViewById(R.id.menu1);
        final LinearLayout t2 = findViewById(R.id.menu2);
        final LinearLayout t3 = findViewById(R.id.menu3);
        final LinearLayout t4 = findViewById(R.id.menu4);
        final LinearLayout t5 = findViewById(R.id.menu5);


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

        @SuppressLint("CutPasteId") CardView cv1 = (CardView) findViewById(R.id.mcv1);
        cv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv1), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv1), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_emotional.this, pair1, pair2);

                Intent intent = new Intent(Cat_emotional.this, Sto1_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv4 = (CardView) findViewById(R.id.mcv4);
        cv4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv4), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv4), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_emotional.this, pair1, pair2);

                Intent intent = new Intent(Cat_emotional.this, Sto4_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv8 = (CardView) findViewById(R.id.mcv8);
        cv8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv8), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv8), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_emotional.this, pair1, pair2);

                Intent intent = new Intent(Cat_emotional.this, Sto8_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv12 = (CardView) findViewById(R.id.mcv12);
        cv12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv12), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv12), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_emotional.this, pair1, pair2);

                Intent intent = new Intent(Cat_emotional.this, Sto12_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv14 = (CardView) findViewById(R.id.mcv14);
        cv14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv14), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv14), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_emotional.this, pair1, pair2);

                Intent intent = new Intent(Cat_emotional.this, Sto14_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv25 = (CardView) findViewById(R.id.mcv25);
        cv25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv25), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv25), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_emotional.this, pair1, pair2);

                Intent intent = new Intent(Cat_emotional.this, Sto25_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv29 = (CardView) findViewById(R.id.mcv29);
        cv29.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv29), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv29), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_emotional.this, pair1, pair2);

                Intent intent = new Intent(Cat_emotional.this, Sto29_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv32 = (CardView) findViewById(R.id.mcv32);
        cv32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv32), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv32), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_emotional.this, pair1, pair2);

                Intent intent = new Intent(Cat_emotional.this, Sto32_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv35 = (CardView) findViewById(R.id.mcv35);
        cv35.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv35), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv35), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_emotional.this, pair1, pair2);

                Intent intent = new Intent(Cat_emotional.this, Sto35_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv46 = (CardView) findViewById(R.id.mcv46);
        cv46.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv46), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv46), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_emotional.this, pair1, pair2);

                Intent intent = new Intent(Cat_emotional.this, Sto46_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        //Image links
        ImageView imageView0 = (ImageView) findViewById(R.id.image);
        Picasso.get().load("https://s8.uupload.ir/files/open-book_auok.png").placeholder(R.drawable.logo2).into(imageView0);

        ImageView imageView1 = (ImageView) findViewById(R.id.miv1);
        Picasso.get().load("https://s8.uupload.ir/files/360_f_688508974_o73n5n95kfabmllpq3kmqci5grlqkvnj_3oqo.jpg").placeholder(R.drawable.logo3).into(imageView1);

        ImageView imageView4 = (ImageView) findViewById(R.id.miv4);
        Picasso.get().load("https://s8.uupload.ir/files/most-expensive-homes-042616-hero1_v0hj.jpg").placeholder(R.drawable.logo3).into(imageView4);

        ImageView imageView8 = (ImageView) findViewById(R.id.miv8);
        Picasso.get().load("https://s8.uupload.ir/files/parenting-parents_7r0.jpg").placeholder(R.drawable.logo3).into(imageView8);

        ImageView imageView12 = (ImageView) findViewById(R.id.miv12);
        Picasso.get().load("https://s8.uupload.ir/files/jakav.com-ax-photo-tabiat-nature-tasavir-iran-ranginkaman_o1u6.jpg").placeholder(R.drawable.logo3).into(imageView12);

        ImageView imageView14 = (ImageView) findViewById(R.id.miv14);
        Picasso.get().load("https://s8.uupload.ir/files/roya_in9.jpg").placeholder(R.drawable.logo3).into(imageView14);

        ImageView imageView25 = (ImageView) findViewById(R.id.miv25);
        Picasso.get().load("https://s8.uupload.ir/files/circus-vancouver-1024x694_75u.jpg").placeholder(R.drawable.logo3).into(imageView25);

        ImageView imageView29 = (ImageView) findViewById(R.id.miv29);
        Picasso.get().load("https://s8.uupload.ir/files/5f0d7f5a19134_merh.jpg").placeholder(R.drawable.logo3).into(imageView29);

        ImageView imageView32 = (ImageView) findViewById(R.id.miv32);
        Picasso.get().load("https://s8.uupload.ir/files/whitepelican_edit_shadowlift_muhg.jpg").placeholder(R.drawable.logo3).into(imageView32);

        ImageView imageView35 = (ImageView) findViewById(R.id.miv35);
        Picasso.get().load("https://s8.uupload.ir/files/coffee-menu4_tkm2.jpg").placeholder(R.drawable.logo3).into(imageView35);

        ImageView imageView46 = (ImageView) findViewById(R.id.miv46);
        Picasso.get().load("https://s8.uupload.ir/files/8d3452e5e0956f2a97768276a3f09a4e-e1705487782263_wdy6.jpg").placeholder(R.drawable.logo3).into(imageView46);

    }
}