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
import com.android.mylibrary.Stories.Sto1_activity;
import com.android.mylibrary.Stories.Sto2_activity;
import com.android.mylibrary.Stories.Sto3_activity;
import com.android.mylibrary.Stories.Sto4_activity;
import com.android.mylibrary.Stories.Sto5_activity;
import com.android.mylibrary.Stories.Sto6_activity;
import com.android.mylibrary.Stories.Sto7_activity;
import com.android.mylibrary.Stories.Sto8_activity;
import com.android.mylibrary.Stories_activity;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Cat_emotional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_emotional);

        //Animation ------------
        final ViewGroup r = findViewById(R.id.nested_scrollview);
        final LinearLayout t1 = findViewById(R.id.menu1);
        final LinearLayout t2 = findViewById(R.id.menu2);
        final LinearLayout t3 = findViewById(R.id.menu3);
        final LinearLayout t4 = findViewById(R.id.menu4);

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

        @SuppressLint("CutPasteId") CardView cv2 = (CardView) findViewById(R.id.mcv2);
        cv2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv2), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv2), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_emotional.this, pair1, pair2);

                Intent intent = new Intent(Cat_emotional.this, Sto2_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv3 = (CardView) findViewById(R.id.mcv3);
        cv3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv3), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv3), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_emotional.this, pair1, pair2);

                Intent intent = new Intent(Cat_emotional.this, Sto3_activity.class);
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

        @SuppressLint("CutPasteId") CardView cv5 = (CardView) findViewById(R.id.mcv5);
        cv5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv5), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv5), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_emotional.this, pair1, pair2);

                Intent intent = new Intent(Cat_emotional.this, Sto5_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv6 = (CardView) findViewById(R.id.mcv6);
        cv6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv6), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv6), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_emotional.this, pair1, pair2);

                Intent intent = new Intent(Cat_emotional.this, Sto6_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv7 = (CardView) findViewById(R.id.mcv7);
        cv7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv7), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv7), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_emotional.this, pair1, pair2);

                Intent intent = new Intent(Cat_emotional.this, Sto7_activity.class);
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

        //Image links
        ImageView imageView0 = (ImageView) findViewById(R.id.image);
        Picasso.get().load("https://s8.uupload.ir/files/open-book_auok.png").placeholder(R.drawable.logo2).into(imageView0);

        ImageView imageView1 = (ImageView) findViewById(R.id.miv1);
        Picasso.get().load("https://s8.uupload.ir/files/360_f_688508974_o73n5n95kfabmllpq3kmqci5grlqkvnj_3oqo.jpg").placeholder(R.drawable.logo3).into(imageView1);

        ImageView imageView2 = (ImageView) findViewById(R.id.miv2);
        Picasso.get().load("https://s8.uupload.ir/files/ed2b1b0ad5e44bd58d05de6a8558b19e_djlo.jpg").placeholder(R.drawable.logo3).into(imageView2);

        ImageView imageView3 = (ImageView) findViewById(R.id.miv3);
        Picasso.get().load("https://s8.uupload.ir/files/choopan_5ssq.jpg").placeholder(R.drawable.logo3).into(imageView3);

        ImageView imageView4 = (ImageView) findViewById(R.id.miv4);
        Picasso.get().load("https://s8.uupload.ir/files/most-expensive-homes-042616-hero1_v0hj.jpg").placeholder(R.drawable.logo3).into(imageView4);

        ImageView imageView5 = (ImageView) findViewById(R.id.miv5);
        Picasso.get().load("https://s8.uupload.ir/files/f_-bus-invece-di-treni-bxyc_6ya4.jpg").placeholder(R.drawable.logo3).into(imageView5);

        ImageView imageView6 = (ImageView) findViewById(R.id.miv6);
        Picasso.get().load("https://s8.uupload.ir/files/jackal-symbolism-and-meaning-04a4efbd_3df4.jpg").placeholder(R.drawable.logo3).into(imageView6);

        ImageView imageView7 = (ImageView) findViewById(R.id.miv7);
        Picasso.get().load("https://s8.uupload.ir/files/alfred-bernhard-nobel-portrait-emil-osterman-foundation-1915_tkim.jpg").placeholder(R.drawable.logo3).into(imageView7);

        ImageView imageView8 = (ImageView) findViewById(R.id.miv8);
        Picasso.get().load("https://s8.uupload.ir/files/parenting-parents_7r0.jpg").placeholder(R.drawable.logo3).into(imageView8);

    }
}