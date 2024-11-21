package com.android.mylibrary;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Sub2_activity extends AppCompatActivity {

    private TextSize settingsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

//Change text size
        settingsManager = new TextSize(this);
        TextView Textview2 = findViewById(R.id.t1);
        TextView Textview3 = findViewById(R.id.t2);
        TextView Textview4 = findViewById(R.id.t3);

        float textSize = settingsManager.getTextSize();
        Textview2.setTextSize(textSize);
        Textview3.setTextSize(textSize);
        Textview4.setTextSize(textSize);

        //Animation ------------
        final ViewGroup r = findViewById(R.id.sub2);
        final TextView t1 = findViewById(R.id.t1);
        final TextView t2 = findViewById(R.id.t2);
        final ImageView t3 = findViewById(R.id.im1);
        final TextView t4 = findViewById(R.id.t3);
        final ImageView t5 = findViewById(R.id.im2);

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
        ConstraintLayout constraintLayout = findViewById(R.id.sub2);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //image link --------------------------------
        ImageView imageView1 = (ImageView) findViewById(R.id.imv1);
        Picasso.get().load("https://s8.uupload.ir/files/_33dde004-9358-4709-97b8-41deca4d338e(1)_2sk.jpg").error(R.drawable.error).into(imageView1);

        ImageView imageView2 = (ImageView) findViewById(R.id.im1);
        Picasso.get().load("https://s8.uupload.ir/files/_86315d5f-4c3b-4883-91a7-6e7b67b2ac2a(1)_kye7.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(imageView2);

        ImageView imageView3 = (ImageView) findViewById(R.id.im2);
        Picasso.get().load("https://s8.uupload.ir/files/_054a1b21-5c87-48ca-8c62-84c28fd83574(1)_b82m.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(imageView3);
    }
}