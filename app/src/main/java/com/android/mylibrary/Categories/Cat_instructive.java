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

public class Cat_instructive extends AppCompatActivity {

    private TextSize settingsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_instructive);

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
        TextView Textview12 = findViewById(R.id.tv12);
        TextView Textview13 = findViewById(R.id.tv13);
        TextView Textview14 = findViewById(R.id.tv14);
        TextView Textview15 = findViewById(R.id.tv15);
        TextView Textview20 = findViewById(R.id.tv20);
        TextView Textview21 = findViewById(R.id.tv21);
        TextView Textview22 = findViewById(R.id.tv22);
        TextView Textview24 = findViewById(R.id.tv24);
        TextView Textview25 = findViewById(R.id.tv25);
        TextView Textview26 = findViewById(R.id.tv26);
        TextView Textview27 = findViewById(R.id.tv27);
        TextView Textview28 = findViewById(R.id.tv28);
        TextView Textview29 = findViewById(R.id.tv29);
        TextView Textview31 = findViewById(R.id.tv31);
        TextView Textview32 = findViewById(R.id.tv32);
        TextView Textview35 = findViewById(R.id.tv35);
        TextView Textview37 = findViewById(R.id.tv37);
        TextView Textview38 = findViewById(R.id.tv38);
        TextView Textview39 = findViewById(R.id.tv39);
        TextView Textview41 = findViewById(R.id.tv41);
        TextView Textview42 = findViewById(R.id.tv42);
        TextView Textview43 = findViewById(R.id.tv43);
        TextView Textview44 = findViewById(R.id.tv44);
        TextView Textview46 = findViewById(R.id.tv46);
        TextView Textview47 = findViewById(R.id.tv47);
        TextView Textview49 = findViewById(R.id.tv49);
        TextView Textview51 = findViewById(R.id.tv51);
        TextView Textview52 = findViewById(R.id.tv52);
        TextView Textview53 = findViewById(R.id.tv53);
        TextView Textview54 = findViewById(R.id.tv54);
        TextView Textview55 = findViewById(R.id.tv55);
        TextView Textview56 = findViewById(R.id.tv56);
        TextView Textview57 = findViewById(R.id.tv57);
        TextView Textview58 = findViewById(R.id.tv58);

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
        Textview12.setTextSize(textSize);
        Textview13.setTextSize(textSize);
        Textview14.setTextSize(textSize);
        Textview15.setTextSize(textSize);
        Textview20.setTextSize(textSize);
        Textview21.setTextSize(textSize);
        Textview22.setTextSize(textSize);
        Textview24.setTextSize(textSize);
        Textview25.setTextSize(textSize);
        Textview26.setTextSize(textSize);
        Textview27.setTextSize(textSize);
        Textview28.setTextSize(textSize);
        Textview29.setTextSize(textSize);
        Textview31.setTextSize(textSize);
        Textview32.setTextSize(textSize);
        Textview35.setTextSize(textSize);
        Textview37.setTextSize(textSize);
        Textview38.setTextSize(textSize);
        Textview39.setTextSize(textSize);
        Textview41.setTextSize(textSize);
        Textview42.setTextSize(textSize);
        Textview43.setTextSize(textSize);
        Textview44.setTextSize(textSize);
        Textview46.setTextSize(textSize);
        Textview47.setTextSize(textSize);
        Textview49.setTextSize(textSize);
        Textview51.setTextSize(textSize);
        Textview52.setTextSize(textSize);
        Textview53.setTextSize(textSize);
        Textview54.setTextSize(textSize);
        Textview55.setTextSize(textSize);
        Textview56.setTextSize(textSize);
        Textview57.setTextSize(textSize);
        Textview58.setTextSize(textSize);

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
        final LinearLayout t22 = findViewById(R.id.menu22);


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
                t22.setVisibility(View.VISIBLE);
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

        Cat_instructive activity = Cat_instructive.this;

        @SuppressLint("CutPasteId") CardView cv1 = (CardView) findViewById(R.id.mcv1);
        cv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv1), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv1), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto1_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv2 = (CardView) findViewById(R.id.mcv2);
        cv2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv2), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv2), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto2_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv3 = (CardView) findViewById(R.id.mcv3);
        cv3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv3), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv3), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto3_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv4 = (CardView) findViewById(R.id.mcv4);
        cv4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv4), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv4), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto4_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv5 = (CardView) findViewById(R.id.mcv5);
        cv5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv5), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv5), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto5_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv6 = (CardView) findViewById(R.id.mcv6);
        cv6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv6), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv6), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto6_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv7 = (CardView) findViewById(R.id.mcv7);
        cv7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv7), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv7), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto7_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv8 = (CardView) findViewById(R.id.mcv8);
        cv8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv8), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv8), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto8_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv9 = (CardView) findViewById(R.id.mcv9);
        cv9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv9), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv9), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto9_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv10 = (CardView) findViewById(R.id.mcv10);
        cv10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv10), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv10), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto10_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv12 = (CardView) findViewById(R.id.mcv12);
        cv12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv12), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv12), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto12_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv13 = (CardView) findViewById(R.id.mcv13);
        cv13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv13), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv13), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto13_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv14 = (CardView) findViewById(R.id.mcv14);
        cv14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv14), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv14), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto14_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv15 = (CardView) findViewById(R.id.mcv15);
        cv15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv15), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv15), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto15_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv20 = (CardView) findViewById(R.id.mcv20);
        cv20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv20), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv20), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto20_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv21 = (CardView) findViewById(R.id.mcv21);
        cv21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv21), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv21), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto21_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv22 = (CardView) findViewById(R.id.mcv22);
        cv22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv22), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv22), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto22_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv24 = (CardView) findViewById(R.id.mcv24);
        cv24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv24), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv24), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto24_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv25 = (CardView) findViewById(R.id.mcv25);
        cv25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv25), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv25), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto25_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv26 = (CardView) findViewById(R.id.mcv26);
        cv26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv26), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv26), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto26_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv27 = (CardView) findViewById(R.id.mcv27);
        cv27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv27), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv27), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto27_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv28 = (CardView) findViewById(R.id.mcv28);
        cv28.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv28), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv28), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto28_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv29 = (CardView) findViewById(R.id.mcv29);
        cv29.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv29), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv29), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto29_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv31 = (CardView) findViewById(R.id.mcv31);
        cv31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv31), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv31), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto31_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv32 = (CardView) findViewById(R.id.mcv32);
        cv32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv32), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv32), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto32_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv35 = (CardView) findViewById(R.id.mcv35);
        cv35.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv35), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv35), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto35_activity.class);
                startActivity(intent, options.toBundle());
            }
        });


        @SuppressLint("CutPasteId") CardView cv37 = (CardView) findViewById(R.id.mcv37);
        cv37.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv37), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv37), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto37_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv38 = (CardView) findViewById(R.id.mcv38);
        cv38.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv38), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv38), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto38_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv39 = (CardView) findViewById(R.id.mcv39);
        cv39.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv39), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv39), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto39_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv41 = (CardView) findViewById(R.id.mcv41);
        cv41.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv41), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv41), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto41_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv42 = (CardView) findViewById(R.id.mcv42);
        cv42.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv42), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv42), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto42_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv43 = (CardView) findViewById(R.id.mcv43);
        cv43.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv43), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv43), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto43_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv44 = (CardView) findViewById(R.id.mcv44);
        cv44.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv44), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv44), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto44_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv46 = (CardView) findViewById(R.id.mcv46);
        cv46.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv46), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv46), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto46_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv47 = (CardView) findViewById(R.id.mcv47);
        cv47.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv47), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv47), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto47_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv49 = (CardView) findViewById(R.id.mcv49);
        cv49.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv49), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv49), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto49_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv51 = (CardView) findViewById(R.id.mcv51);
        cv51.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv51), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv51), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto51_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv52 = (CardView) findViewById(R.id.mcv52);
        cv52.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv52), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv52), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto52_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv53 = (CardView) findViewById(R.id.mcv53);
        cv53.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv53), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv53), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto53_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv54 = (CardView) findViewById(R.id.mcv54);
        cv54.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv54), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv54), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto54_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv55 = (CardView) findViewById(R.id.mcv55);
        cv55.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv55), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv55), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto55_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv56 = (CardView) findViewById(R.id.mcv56);
        cv56.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv56), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv56), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto56_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv57 = (CardView) findViewById(R.id.mcv57);
        cv57.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv57), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv57), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto57_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv58 = (CardView) findViewById(R.id.mcv58);
        cv58.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv58), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv58), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pair1, pair2);

                Intent intent = new Intent(activity, Sto58_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        //Image links
        ImageView imageView0 = (ImageView) findViewById(R.id.image);
        Picasso.get().load("https://s8.uupload.ir/files/learning_gb2p.png").placeholder(R.drawable.logo2).into(imageView0);

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

        ImageView imageView9 = (ImageView) findViewById(R.id.miv9);
        Picasso.get().load("https://s8.uupload.ir/files/3002466_brs6.jpg").placeholder(R.drawable.logo3).into(imageView9);

        ImageView imageView10 = (ImageView) findViewById(R.id.miv10);
        Picasso.get().load("https://s8.uupload.ir/files/kvkrovbjr_qq4w.jpg").placeholder(R.drawable.logo3).into(imageView10);

        ImageView imageView12 = (ImageView) findViewById(R.id.miv12);
        Picasso.get().load("https://s8.uupload.ir/files/jakav.com-ax-photo-tabiat-nature-tasavir-iran-ranginkaman_o1u6.jpg").placeholder(R.drawable.logo3).into(imageView12);

        ImageView imageView13 = (ImageView) findViewById(R.id.miv13);
        Picasso.get().load("https://s8.uupload.ir/files/cart1020560www.tiktarh.com__vrx9.jpg").placeholder(R.drawable.logo3).into(imageView13);

        ImageView imageView14 = (ImageView) findViewById(R.id.miv14);
        Picasso.get().load("https://s8.uupload.ir/files/roya_in9.jpg").placeholder(R.drawable.logo3).into(imageView14);

        ImageView imageView15 = (ImageView) findViewById(R.id.miv15);
        Picasso.get().load("https://s8.uupload.ir/files/169770965_5q6n.jpg").placeholder(R.drawable.logo3).into(imageView15);

        ImageView imageView20 = (ImageView) findViewById(R.id.miv20);
        Picasso.get().load("https://s8.uupload.ir/files/hioggoug_chf5.jpg").placeholder(R.drawable.logo3).into(imageView20);

        ImageView imageView21 = (ImageView) findViewById(R.id.miv21);
        Picasso.get().load("https://s8.uupload.ir/files/master_groph_14-4_14_oe8k.jpg").placeholder(R.drawable.logo3).into(imageView21);

        ImageView imageView22 = (ImageView) findViewById(R.id.miv22);
        Picasso.get().load("https://s8.uupload.ir/files/shoe-tools9_4nr7.jpg").placeholder(R.drawable.logo3).into(imageView22);

        ImageView imageView24 = (ImageView) findViewById(R.id.miv24);
        Picasso.get().load("https://s8.uupload.ir/files/large_400ad4e1-d127-4b35-9304-5901b5a4a2de_amg1.jpg").placeholder(R.drawable.logo3).into(imageView24);

        ImageView imageView25 = (ImageView) findViewById(R.id.miv25);
        Picasso.get().load("https://s8.uupload.ir/files/circus-vancouver-1024x694_75u.jpg").placeholder(R.drawable.logo3).into(imageView25);

        ImageView imageView26 = (ImageView) findViewById(R.id.miv26);
        Picasso.get().load("https://s8.uupload.ir/files/amazing_r031.jpg").placeholder(R.drawable.logo3).into(imageView26);

        ImageView imageView27 = (ImageView) findViewById(R.id.miv27);
        Picasso.get().load("https://s8.uupload.ir/files/3037_8ke.jpg").placeholder(R.drawable.logo3).into(imageView27);

        ImageView imageView28 = (ImageView) findViewById(R.id.miv28);
        Picasso.get().load("https://s8.uupload.ir/files/butterflies_mzdr.jpg").placeholder(R.drawable.logo3).into(imageView28);

        ImageView imageView29 = (ImageView) findViewById(R.id.miv29);
        Picasso.get().load("https://s8.uupload.ir/files/5f0d7f5a19134_merh.jpg").placeholder(R.drawable.logo3).into(imageView29);

        ImageView imageView31 = (ImageView) findViewById(R.id.miv31);
        Picasso.get().load("https://s8.uupload.ir/files/animals-634-infinitychap.com-0700696742_pthl.jpg").placeholder(R.drawable.logo3).into(imageView31);

        ImageView imageView32 = (ImageView) findViewById(R.id.miv32);
        Picasso.get().load("https://s8.uupload.ir/files/whitepelican_edit_shadowlift_muhg.jpg").placeholder(R.drawable.logo3).into(imageView32);

        ImageView imageView35 = (ImageView) findViewById(R.id.miv35);
        Picasso.get().load("https://s8.uupload.ir/files/coffee-menu4_tkm2.jpg").placeholder(R.drawable.logo3).into(imageView35);

        ImageView imageView37 = (ImageView) findViewById(R.id.miv37);
        Picasso.get().load("https://s8.uupload.ir/files/3595221_rqaq.jpg").placeholder(R.drawable.logo3).into(imageView37);

        ImageView imageView38 = (ImageView) findViewById(R.id.miv38);
        Picasso.get().load("https://s8.uupload.ir/files/70986950980_f2hw.jpg").placeholder(R.drawable.logo3).into(imageView38);

        ImageView imageView39 = (ImageView) findViewById(R.id.miv39);
        Picasso.get().load("https://s8.uupload.ir/files/8994d7607baec2d7d96239d0cb82f74f_on7j.jpg").placeholder(R.drawable.logo3).into(imageView39);

        ImageView imageView41 = (ImageView) findViewById(R.id.miv41);
        Picasso.get().load("https://s8.uupload.ir/files/rhrh_h52y.jpg").placeholder(R.drawable.logo3).into(imageView41);

        ImageView imageView42 = (ImageView) findViewById(R.id.miv42);
        Picasso.get().load("https://s8.uupload.ir/files/08-01_g6y7.jpg").placeholder(R.drawable.logo3).into(imageView42);

        ImageView imageView43 = (ImageView) findViewById(R.id.miv43);
        Picasso.get().load("https://s8.uupload.ir/files/077206e2-2a2a-4a21-88f1-079c9135fc6e-1200x900_2dpo.jpg").placeholder(R.drawable.logo3).into(imageView43);

        ImageView imageView44 = (ImageView) findViewById(R.id.miv44);
        Picasso.get().load("https://s8.uupload.ir/files/water-well_lfl.jpg").placeholder(R.drawable.logo3).into(imageView44);

        ImageView imageView46 = (ImageView) findViewById(R.id.miv46);
        Picasso.get().load("https://s8.uupload.ir/files/8d3452e5e0956f2a97768276a3f09a4e-e1705487782263_wdy6.jpg").placeholder(R.drawable.logo3).into(imageView46);

        ImageView imageView47 = (ImageView) findViewById(R.id.miv47);
        Picasso.get().load("https://s8.uupload.ir/files/89405_405_vppq.jpg").placeholder(R.drawable.logo3).into(imageView47);

        ImageView imageView49 = (ImageView) findViewById(R.id.miv49);
        Picasso.get().load("https://s8.uupload.ir/files/jasper-boer-1fuu0dratom-unsplash-scaled-1_eh5d.jpg").placeholder(R.drawable.logo3).into(imageView49);

        ImageView imageView51 = (ImageView) findViewById(R.id.miv51);
        Picasso.get().load("https://s8.uupload.ir/files/51951042270_78ea1e8590_h.7_egok.jpg").placeholder(R.drawable.logo3).into(imageView51);

        ImageView imageView52 = (ImageView) findViewById(R.id.miv52);
        Picasso.get().load("https://s8.uupload.ir/files/2-lane-arch-bridge-with-pedestrian-walkway-1000_xfia.jpg").placeholder(R.drawable.logo3).into(imageView52);

        ImageView imageView53 = (ImageView) findViewById(R.id.miv53);
        Picasso.get().load("https://s8.uupload.ir/files/0_h7y9.jpg").placeholder(R.drawable.logo3).into(imageView53);

        ImageView imageView54 = (ImageView) findViewById(R.id.miv54);
        Picasso.get().load("https://s8.uupload.ir/files/campfire_soa7.jpg").placeholder(R.drawable.logo3).into(imageView54);

        ImageView imageView55 = (ImageView) findViewById(R.id.miv55);
        Picasso.get().load("https://s8.uupload.ir/files/1-1_vjl3.jpg").placeholder(R.drawable.logo3).into(imageView55);

        ImageView imageView56 = (ImageView) findViewById(R.id.miv56);
        Picasso.get().load("https://s8.uupload.ir/files/jdjfhfge_7acd.jpg").placeholder(R.drawable.logo3).into(imageView56);

        ImageView imageView57 = (ImageView) findViewById(R.id.miv57);
        Picasso.get().load("https://s8.uupload.ir/files/1713183520401085_0ph4.jpg").placeholder(R.drawable.logo3).into(imageView57);

        ImageView imageView58 = (ImageView) findViewById(R.id.miv58);
        Picasso.get().load("https://s8.uupload.ir/files/61654b3b-99a_dc3.jpg").placeholder(R.drawable.logo3).into(imageView58);
    }
}