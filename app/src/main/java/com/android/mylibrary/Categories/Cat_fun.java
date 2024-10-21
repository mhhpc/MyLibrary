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
import com.android.mylibrary.Stories.Sto11_activity;
import com.android.mylibrary.Stories.Sto12_activity;
import com.android.mylibrary.Stories.Sto14_activity;
import com.android.mylibrary.Stories.Sto16_activity;
import com.android.mylibrary.Stories.Sto17_activity;
import com.android.mylibrary.Stories.Sto18_activity;
import com.android.mylibrary.Stories.Sto19_activity;
import com.android.mylibrary.Stories.Sto1_activity;
import com.android.mylibrary.Stories.Sto23_activity;
import com.android.mylibrary.Stories.Sto25_activity;
import com.android.mylibrary.Stories.Sto29_activity;
import com.android.mylibrary.Stories.Sto30_activity;
import com.android.mylibrary.Stories.Sto32_activity;
import com.android.mylibrary.Stories.Sto33_activity;
import com.android.mylibrary.Stories.Sto34_activity;
import com.android.mylibrary.Stories.Sto35_activity;
import com.android.mylibrary.Stories.Sto36_activity;
import com.android.mylibrary.Stories.Sto40_activity;
import com.android.mylibrary.Stories.Sto45_activity;
import com.android.mylibrary.Stories.Sto46_activity;
import com.android.mylibrary.Stories.Sto48_activity;
import com.android.mylibrary.Stories.Sto49_activity;
import com.android.mylibrary.Stories.Sto4_activity;
import com.android.mylibrary.Stories.Sto50_activity;
import com.android.mylibrary.Stories.Sto51_activity;
import com.android.mylibrary.Stories.Sto57_activity;
import com.android.mylibrary.Stories.Sto59_activity;
import com.android.mylibrary.Stories.Sto60_activity;
import com.android.mylibrary.Stories.Sto8_activity;
import com.android.mylibrary.TextSize;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Cat_fun extends AppCompatActivity {

    private TextSize settingsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_fun);

        //Change text size
        settingsManager = new TextSize(this);
        TextView Textview11 = findViewById(R.id.tv11);
        TextView Textview16 = findViewById(R.id.tv16);
        TextView Textview17 = findViewById(R.id.tv17);
        TextView Textview18 = findViewById(R.id.tv18);
        TextView Textview19 = findViewById(R.id.tv19);
        TextView Textview23 = findViewById(R.id.tv23);
        TextView Textview30 = findViewById(R.id.tv30);
        TextView Textview33 = findViewById(R.id.tv33);
        TextView Textview34 = findViewById(R.id.tv34);
        TextView Textview36 = findViewById(R.id.tv36);
        TextView Textview40 = findViewById(R.id.tv40);
        TextView Textview45 = findViewById(R.id.tv45);
        TextView Textview48 = findViewById(R.id.tv48);
        TextView Textview49 = findViewById(R.id.tv49);
        TextView Textview50 = findViewById(R.id.tv50);
        TextView Textview51 = findViewById(R.id.tv51);
        TextView Textview57 = findViewById(R.id.tv57);
        TextView Textview59 = findViewById(R.id.tv59);
        TextView Textview60 = findViewById(R.id.tv60);

        float textSize = settingsManager.getTextSize();
        Textview11.setTextSize(textSize);
        Textview16.setTextSize(textSize);
        Textview17.setTextSize(textSize);
        Textview18.setTextSize(textSize);
        Textview19.setTextSize(textSize);
        Textview23.setTextSize(textSize);
        Textview30.setTextSize(textSize);
        Textview33.setTextSize(textSize);
        Textview34.setTextSize(textSize);
        Textview36.setTextSize(textSize);
        Textview40.setTextSize(textSize);
        Textview45.setTextSize(textSize);
        Textview48.setTextSize(textSize);
        Textview49.setTextSize(textSize);
        Textview50.setTextSize(textSize);
        Textview51.setTextSize(textSize);
        Textview57.setTextSize(textSize);
        Textview59.setTextSize(textSize);
        Textview60.setTextSize(textSize);

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

        @SuppressLint("CutPasteId") CardView cv11 = (CardView) findViewById(R.id.mcv11);
        cv11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv11), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv11), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto11_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv16 = (CardView) findViewById(R.id.mcv16);
        cv16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv16), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv16), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto16_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv17 = (CardView) findViewById(R.id.mcv17);
        cv17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv17), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv17), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto17_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv18 = (CardView) findViewById(R.id.mcv18);
        cv18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv18), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv18), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto18_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv19 = (CardView) findViewById(R.id.mcv19);
        cv19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv19), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv19), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto19_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv23 = (CardView) findViewById(R.id.mcv23);
        cv23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv23), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv23), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto23_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv30 = (CardView) findViewById(R.id.mcv30);
        cv30.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv30), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv30), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto30_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv33 = (CardView) findViewById(R.id.mcv33);
        cv33.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv33), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv33), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto33_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv34 = (CardView) findViewById(R.id.mcv34);
        cv34.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv34), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv34), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto34_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv36 = (CardView) findViewById(R.id.mcv36);
        cv36.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv36), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv36), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto36_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv40 = (CardView) findViewById(R.id.mcv40);
        cv40.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv40), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv40), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto40_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv45 = (CardView) findViewById(R.id.mcv45);
        cv45.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv45), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv45), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto45_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv48 = (CardView) findViewById(R.id.mcv48);
        cv48.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv48), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv48), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto48_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv49 = (CardView) findViewById(R.id.mcv49);
        cv49.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv49), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv49), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto49_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv50 = (CardView) findViewById(R.id.mcv50);
        cv50.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv50), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv50), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto50_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv51 = (CardView) findViewById(R.id.mcv51);
        cv51.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv51), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv51), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto51_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv57 = (CardView) findViewById(R.id.mcv57);
        cv57.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv57), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv57), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto57_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv59 = (CardView) findViewById(R.id.mcv59);
        cv59.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv59), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv59), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto59_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        @SuppressLint("CutPasteId") CardView cv60 = (CardView) findViewById(R.id.mcv60);
        cv60.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Pair<View, String> pair1 = Pair.create(findViewById(R.id.miv60), "trans1");
                Pair<View, String> pair2 = Pair.create(findViewById(R.id.tv60), "trans2");

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Cat_fun.this, pair1, pair2);

                Intent intent = new Intent(Cat_fun.this, Sto60_activity.class);
                startActivity(intent, options.toBundle());
            }
        });

        //Image links
        ImageView imageView0 = (ImageView) findViewById(R.id.image);
        Picasso.get().load("https://s8.uupload.ir/files/happy_kjty.png").placeholder(R.drawable.logo2).into(imageView0);

        ImageView imageView11 = (ImageView) findViewById(R.id.miv11);
        Picasso.get().load("https://s8.uupload.ir/files/15637826_4phi.jpg").placeholder(R.drawable.logo3).into(imageView11);

        ImageView imageView16 = (ImageView) findViewById(R.id.miv16);
        Picasso.get().load("https://s8.uupload.ir/files/gwl-chrg-jdw_0crf.jpg").placeholder(R.drawable.logo3).into(imageView16);

        ImageView imageView17 = (ImageView) findViewById(R.id.miv17);
        Picasso.get().load("https://s8.uupload.ir/files/ydz8pjeigxim_z5bx.jpg").placeholder(R.drawable.logo3).into(imageView17);

        ImageView imageView18 = (ImageView) findViewById(R.id.miv18);
        Picasso.get().load("https://s8.uupload.ir/files/1-6_w7vh.jpg").placeholder(R.drawable.logo3).into(imageView18);

        ImageView imageView19 = (ImageView) findViewById(R.id.miv19);
        Picasso.get().load("https://s8.uupload.ir/files/502018121_univ_lsr_lg_21l.jpg").placeholder(R.drawable.logo3).into(imageView19);

        ImageView imageView23 = (ImageView) findViewById(R.id.miv23);
        Picasso.get().load("https://s8.uupload.ir/files/shtrvl1000219www.tiktarh.com__sani.jpg").placeholder(R.drawable.logo3).into(imageView23);

        ImageView imageView30 = (ImageView) findViewById(R.id.miv30);
        Picasso.get().load("https://s8.uupload.ir/files/demonios_s1000rr-group-riding_4eq4.jpg").placeholder(R.drawable.logo3).into(imageView30);

        ImageView imageView33 = (ImageView) findViewById(R.id.miv33);
        Picasso.get().load("https://s8.uupload.ir/files/nwjkowi43bke_2e6u.jpg").placeholder(R.drawable.logo3).into(imageView33);

        ImageView imageView34 = (ImageView) findViewById(R.id.miv34);
        Picasso.get().load("https://s8.uupload.ir/files/74d1e572-2120-43f1-894b-c15b2af6e64f_kemw.jpg").placeholder(R.drawable.logo3).into(imageView34);

        ImageView imageView36 = (ImageView) findViewById(R.id.miv36);
        Picasso.get().load("https://s8.uupload.ir/files/sbberbhr_a90.jpg").placeholder(R.drawable.logo3).into(imageView36);

        ImageView imageView40 = (ImageView) findViewById(R.id.miv40);
        Picasso.get().load("https://s8.uupload.ir/files/15550031_t28x.jpg").placeholder(R.drawable.logo3).into(imageView40);

        ImageView imageView45 = (ImageView) findViewById(R.id.miv45);
        Picasso.get().load("https://s8.uupload.ir/files/d557ec67f01a4fe49dd9f84fadbe9d72_dlcc.jpg").placeholder(R.drawable.logo3).into(imageView45);

        ImageView imageView48 = (ImageView) findViewById(R.id.miv48);
        Picasso.get().load("https://s8.uupload.ir/files/table-with-phone_pp14.jpg").placeholder(R.drawable.logo3).into(imageView48);

        ImageView imageView49 = (ImageView) findViewById(R.id.miv49);
        Picasso.get().load("https://s8.uupload.ir/files/jasper-boer-1fuu0dratom-unsplash-scaled-1_eh5d.jpg").placeholder(R.drawable.logo3).into(imageView49);

        ImageView imageView50 = (ImageView) findViewById(R.id.miv50);
        Picasso.get().load("https://s8.uupload.ir/files/marry-a-poor-man_g605.jpg").placeholder(R.drawable.logo3).into(imageView50);

        ImageView imageView51 = (ImageView) findViewById(R.id.miv51);
        Picasso.get().load("https://s8.uupload.ir/files/51951042270_78ea1e8590_h.7_egok.jpg").placeholder(R.drawable.logo3).into(imageView51);

        ImageView imageView57 = (ImageView) findViewById(R.id.miv57);
        Picasso.get().load("https://s8.uupload.ir/files/1713183520401085_0ph4.jpg").placeholder(R.drawable.logo3).into(imageView57);

        ImageView imageView59 = (ImageView) findViewById(R.id.miv59);
        Picasso.get().load("https://s8.uupload.ir/files/4707376_1uba.jpg").placeholder(R.drawable.logo3).into(imageView59);

        ImageView imageView60 = (ImageView) findViewById(R.id.miv60);
        Picasso.get().load("https://s8.uupload.ir/files/how-to-clean-a-jetted-tub-5073242-06-f99bf9e94cb64923b37a990899c9a400_aowa.jpg").placeholder(R.drawable.logo3).into(imageView60);


    }
}