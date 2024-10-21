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
import com.android.mylibrary.Stories.Sto14_activity;
import com.android.mylibrary.Stories.Sto1_activity;
import com.android.mylibrary.Stories.Sto25_activity;
import com.android.mylibrary.Stories.Sto29_activity;
import com.android.mylibrary.Stories.Sto32_activity;
import com.android.mylibrary.Stories.Sto35_activity;
import com.android.mylibrary.Stories.Sto3_activity;
import com.android.mylibrary.Stories.Sto46_activity;
import com.android.mylibrary.Stories.Sto4_activity;
import com.android.mylibrary.Stories.Sto54_activity;
import com.android.mylibrary.Stories.Sto55_activity;
import com.android.mylibrary.Stories.Sto56_activity;
import com.android.mylibrary.Stories.Sto8_activity;
import com.android.mylibrary.Stories.Sto9_activity;
import com.android.mylibrary.TextSize;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Cat_religious extends AppCompatActivity {

    private TextSize settingsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_religious);

        //Change text size
        settingsManager = new TextSize(this);
        TextView Textview3 = findViewById(R.id.tv3);
        TextView Textview9 = findViewById(R.id.tv9);
        TextView Textview29 = findViewById(R.id.tv29);
        TextView Textview54 = findViewById(R.id.tv54);
        TextView Textview55 = findViewById(R.id.tv55);
        TextView Textview56 = findViewById(R.id.tv56);

        float textSize = settingsManager.getTextSize();
        Textview3.setTextSize(textSize);
        Textview9.setTextSize(textSize);
        Textview29.setTextSize(textSize);
        Textview54.setTextSize(textSize);
        Textview55.setTextSize(textSize);
        Textview56.setTextSize(textSize);

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

        @SuppressLint("CutPasteId") CardView cv3 = (CardView) findViewById(R.id.mcv3);
        cv3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv3), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv3), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_religious.this, pair1, pair2);

                Intent intent = new Intent(Cat_religious.this, Sto3_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv9 = (CardView) findViewById(R.id.mcv9);
        cv9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv9), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv9), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_religious.this, pair1, pair2);

                Intent intent = new Intent(Cat_religious.this, Sto9_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv29 = (CardView) findViewById(R.id.mcv29);
        cv29.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv29), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv29), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_religious.this, pair1, pair2);

                Intent intent = new Intent(Cat_religious.this, Sto29_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv54 = (CardView) findViewById(R.id.mcv54);
        cv54.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv54), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv54), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_religious.this, pair1, pair2);

                Intent intent = new Intent(Cat_religious.this, Sto54_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv55 = (CardView) findViewById(R.id.mcv55);
        cv55.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv55), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv55), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_religious.this, pair1, pair2);

                Intent intent = new Intent(Cat_religious.this, Sto55_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv56 = (CardView) findViewById(R.id.mcv56);
        cv56.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv56), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv56), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_religious.this, pair1, pair2);

                Intent intent = new Intent(Cat_religious.this, Sto56_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        //Image links
        ImageView imageView0 = (ImageView) findViewById(R.id.image);
        Picasso.get().load("https://s8.uupload.ir/files/prayer-rug_cfg0.png").placeholder(R.drawable.logo2).into(imageView0);

        ImageView imageView3 = (ImageView) findViewById(R.id.miv3);
        Picasso.get().load("https://s8.uupload.ir/files/choopan_5ssq.jpg").placeholder(R.drawable.logo3).into(imageView3);

        ImageView imageView9 = (ImageView) findViewById(R.id.miv9);
        Picasso.get().load("https://s8.uupload.ir/files/3002466_brs6.jpg").placeholder(R.drawable.logo3).into(imageView9);

        ImageView imageView29 = (ImageView) findViewById(R.id.miv29);
        Picasso.get().load("https://s8.uupload.ir/files/5f0d7f5a19134_merh.jpg").placeholder(R.drawable.logo3).into(imageView29);

        ImageView imageView54 = (ImageView) findViewById(R.id.miv54);
        Picasso.get().load("https://s8.uupload.ir/files/campfire_soa7.jpg").placeholder(R.drawable.logo3).into(imageView54);

        ImageView imageView55 = (ImageView) findViewById(R.id.miv55);
        Picasso.get().load("https://s8.uupload.ir/files/1-1_vjl3.jpg").placeholder(R.drawable.logo3).into(imageView55);

        ImageView imageView56 = (ImageView) findViewById(R.id.miv56);
        Picasso.get().load("https://s8.uupload.ir/files/jdjfhfge_7acd.jpg").placeholder(R.drawable.logo3).into(imageView56);

    }
}