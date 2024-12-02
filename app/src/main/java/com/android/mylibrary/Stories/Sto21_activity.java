package com.android.mylibrary.Stories;


import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.android.mylibrary.BaseStoryActivity;
import com.android.mylibrary.ImageLoaderUtil;
import com.android.mylibrary.R;
import com.android.mylibrary.TextSize;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Fade;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Sto21_activity extends BaseStoryActivity {

    @Override
    protected List<Integer> getTextIds() {
        return Arrays.asList(R.string.stories_tsto21, R.string.sto21_t1);
    }

    @Override
    protected void configureAnimation() {

        //Animation ------------
        final ViewGroup r = findViewById(R.id.story);
        final RelativeLayout t0 = findViewById(R.id.view);
        final TextView t1 = findViewById(R.id.t1);
        final ImageView t2 = findViewById(R.id.im1);
        final TextView t3 = findViewById(R.id.t2);
        final ImageView t4 = findViewById(R.id.im2);
        final TextView t5 = findViewById(R.id.t3);
        final ImageView t6 = findViewById(R.id.im3);
        final TextView t7 = findViewById(R.id.t4);
        final ImageView t8 = findViewById(R.id.im4);
        final TextView t9 = findViewById(R.id.t5);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Fade();
                transition.setDuration(600);
                TransitionManager.beginDelayedTransition(r, transition);
                t0.setVisibility(View.VISIBLE);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.GONE);
                t3.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                t6.setVisibility(View.GONE);
                t7.setVisibility(View.GONE);
                t8.setVisibility(View.GONE);
                t9.setVisibility(View.GONE);

            }
        }, 200);

    }

    @Override
    protected List<String> getImageUrls() {
        return Arrays.asList("https://s8.uupload.ir/files/master_groph_14-4_14_oe8k.jpg");
    }
}