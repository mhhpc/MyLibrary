package com.android.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class About_activity extends AppCompatActivity {

    private TextSize settingsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //Change text size
        settingsManager = new TextSize(this);
        TextView Textview0 = findViewById(R.id.t0);
        TextView Textview1 = findViewById(R.id.t1);
        TextView Textview2 = findViewById(R.id.t2);
        TextView Textview4 = findViewById(R.id.t4);
        TextView Textview5 = findViewById(R.id.t5);
        TextView Textview6 = findViewById(R.id.t6);
        TextView Textview7 = findViewById(R.id.t7);
        TextView Textview8 = findViewById(R.id.t8);

        float textSize = settingsManager.getTextSize();
        Textview0.setTextSize(textSize);
        Textview1.setTextSize(textSize);
        Textview2.setTextSize(textSize);
        Textview4.setTextSize(textSize);
        Textview5.setTextSize(textSize);
        Textview6.setTextSize(textSize);
        Textview7.setTextSize(textSize);
        Textview8.setTextSize(textSize);

        //gradient ------------------
        ConstraintLayout constraintLayout = findViewById(R.id.about);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.about);
        final LottieAnimationView t0 = findViewById(R.id.lottie);
        final LottieAnimationView t00 = findViewById(R.id.lottie2);
        final ImageView t1 = findViewById(R.id.logo);
        final TextView t2 = findViewById(R.id.tx1);
        final TextView t3 = findViewById(R.id.tx2);
        final CardView t4 = findViewById(R.id.cardView);
        final CardView t5 = findViewById(R.id.cardView2);
        final ImageView t6 = findViewById(R.id.bn1);
        final ImageView t7 = findViewById(R.id.bn2);
        final ImageView t8 = findViewById(R.id.bn3);
        final ImageView t9 = findViewById(R.id.bn4);
        final ImageView t10 = findViewById(R.id.bn5);
        final ImageView t11 = findViewById(R.id.bn6);
        final ImageView t12 = findViewById(R.id.bn7);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Slide();
                transition.setDuration(1200);
                TransitionManager.beginDelayedTransition(r,transition);
                t0.setVisibility(View.VISIBLE);
                t00.setVisibility(View.VISIBLE);
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
            }
        },200);

        //button onclick

        @SuppressLint("CutPasteId") LinearLayout b2 = (LinearLayout) findViewById(R.id.item1);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://cafebazaar.ir/app/com.example.short_stories"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b3 = (LinearLayout) findViewById(R.id.item2);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentSend = new Intent();
                intentSend.setAction(Intent.ACTION_SEND);
                intentSend.putExtra(Intent.EXTRA_TEXT, "سلام \n به راحتی میتونی اپلیکیشن کتابخانه من رو از لینک زیر دانلود کنی ;) \n https://cafebazaar.ir/app/com.example.short_stories");
                intentSend.setType("text/plain");

                Intent share = Intent.createChooser(intentSend, null);
                startActivity(share);
            }
        });

        @SuppressLint("CutPasteId") ImageView bn1 = (ImageView) findViewById(R.id.bn1);
        bn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","hamidimhhossein@email.com", null));
                startActivity(Intent.createChooser(intent, "یک گزینه را انتخاب کنید :"));
            }
        });


        @SuppressLint("CutPasteId") ImageView bn2 = (ImageView) findViewById(R.id.bn2);
        bn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("http://myapk.blogfa.com/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") ImageView bn3 = (ImageView) findViewById(R.id.bn3);
        bn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    try {
                        Intent telegram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/mhhpc"));
                        telegram.setPackage("org.telegram.messenger");
                        startActivity(telegram);
                    }catch (Exception e){
                        Intent telegram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/mhhpc"));
                        telegram.setPackage("org.telegram.messenger.web");
                        startActivity(telegram);
                    }
                }catch (Exception e)
                {
                    Toast.makeText(About_activity.this, "تلگرام روی گوشی شما نصب نیست!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        @SuppressLint("CutPasteId") ImageView bn4 = (ImageView) findViewById(R.id.bn4);
        bn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent instagram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/mhhpc"));
                    instagram.setPackage("com.instagram.android");
                    startActivity(instagram);
                }catch (Exception e)
                {
                    Toast.makeText(About_activity.this, "اینستاگرام روی گوشی شما نصب نیست!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        @SuppressLint("CutPasteId") ImageView bn5 = (ImageView) findViewById(R.id.bn5);
        bn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent eitaa = new Intent(Intent.ACTION_VIEW, Uri.parse("https://eitaa.com/mhhpcs"));
                    eitaa.setPackage("ir.eitaa.messenger");
                    startActivity(eitaa);
                }catch (Exception e)
                {
                    Toast.makeText(About_activity.this, "ایتا روی گوشی شما نصب نیست!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        @SuppressLint("CutPasteId") ImageView bn6 = (ImageView) findViewById(R.id.bn6);
        bn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.aparat.com/mhhpc"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") ImageView bn7 = (ImageView) findViewById(R.id.bn7);
        bn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://cafebazaar.ir/developer/781503171866"));
                startActivity(intentRate);
            }
        });

    }
}