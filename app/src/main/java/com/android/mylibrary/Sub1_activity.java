package com.android.mylibrary;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Fade;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Sub1_activity extends AppCompatActivity {

    private TextSize settingsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        //Change text size
        settingsManager = new TextSize(this);
        TextView Textview2 = findViewById(R.id.t1);
        TextView Textview3 = findViewById(R.id.t2);

        float textSize = settingsManager.getTextSize();
        Textview2.setTextSize(textSize);
        Textview3.setTextSize(textSize);

        //Animation ------------
        final ViewGroup r = findViewById(R.id.sub1);
        final TextView t1 = findViewById(R.id.t1);
        final ImageView t2 = findViewById(R.id.im1);
        final TextView t3 = findViewById(R.id.t2);
        final ImageView t4 = findViewById(R.id.im2);

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
        ConstraintLayout constraintLayout = findViewById(R.id.sub1);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //image link --------------------------------
        ImageView imageView1 = (ImageView) findViewById(R.id.imv1);
        Picasso.get().load("https://s8.uupload.ir/files/_ff62c125-76ab-4859-8587-8ebc154fabb4(1)_2sie.jpg").error(R.drawable.error).into(imageView1);

        ImageView imageView2 = (ImageView) findViewById(R.id.im1);
        Picasso.get().load("https://s8.uupload.ir/files/_55ce567d-71d7-410a-9480-449d8602407d(1)_hd4f.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(imageView2);

        ImageView imageView3 = (ImageView) findViewById(R.id.im2);
        Picasso.get().load("https://s8.uupload.ir/files/_0198d57a-4a80-4119-a834-ca953425b116(1)_9a3m.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(imageView3);
    }
}