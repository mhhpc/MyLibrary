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

import com.android.mylibrary.R;
import com.android.mylibrary.TextSize;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Fade;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import java.util.Random;

public class Sto25_activity extends AppCompatActivity {

    private TextSize settingsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        //Set text
        ((TextView) findViewById(R.id.tv1)).setText(getString(R.string.stories_tsto25));
        ((TextView) findViewById(R.id.t1)).setText(getString(R.string.sto25_t1));

        //Change text size
        settingsManager = new TextSize(this);
        TextView Textview1 = findViewById(R.id.tv1);
        TextView Textview2 = findViewById(R.id.t1);
        TextView Textview3 = findViewById(R.id.t2);
        TextView Textview4 = findViewById(R.id.t3);
        TextView Textview5 = findViewById(R.id.t4);
        TextView Textview6 = findViewById(R.id.t5);

        float textSize = settingsManager.getTextSize();
        Textview1.setTextSize(textSize);
        Textview2.setTextSize(textSize);
        Textview3.setTextSize(textSize);
        Textview4.setTextSize(textSize);
        Textview5.setTextSize(textSize);
        Textview6.setTextSize(textSize);


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

        //Gradient
        ConstraintLayout constraintLayout = findViewById(R.id.story);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Random show top image
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        switch (randomNumber) {
            case 0:
                ImageView imageView00 = (ImageView) findViewById(R.id.iv1);
                Picasso.get().load("https://s8.uupload.ir/files/library_ct4e.jpg").placeholder(R.drawable.logo2).into(imageView00);
                break;
            case 1:
                ImageView imageView01 = (ImageView) findViewById(R.id.iv1);
                Picasso.get().load("https://s8.uupload.ir/files/istock-1087508538_vtl1.jpg").placeholder(R.drawable.logo2).into(imageView01);
                break;
            case 2:
                ImageView imageView02 = (ImageView) findViewById(R.id.iv1);
                Picasso.get().load("https://s8.uupload.ir/files/gettyimages-900301626_437925_t2i3bm_vfs.jpg").placeholder(R.drawable.logo2).into(imageView02);
                break;
            case 3:
                ImageView imageView03 = (ImageView) findViewById(R.id.iv1);
                Picasso.get().load("https://s8.uupload.ir/files/free-book_o3d2.jpg").placeholder(R.drawable.logo2).into(imageView03);
                break;
            case 4:
                ImageView imageView04 = (ImageView) findViewById(R.id.iv1);
                Picasso.get().load("https://s8.uupload.ir/files/elenaleonova-books_6nrv.jpg").placeholder(R.drawable.logo2).into(imageView04);
                break;
            case 5:
                ImageView imageView05 = (ImageView) findViewById(R.id.iv1);
                Picasso.get().load("https://s8.uupload.ir/files/best-novels-for-beginners_5hhl.jpg").placeholder(R.drawable.logo2).into(imageView05);
                break;
            case 6:
                ImageView imageView06 = (ImageView) findViewById(R.id.iv1);
                Picasso.get().load("https://s8.uupload.ir/files/aacc-library-1-1500x844_7z6g.jpg").placeholder(R.drawable.logo2).into(imageView06);
                break;
            case 7:
                ImageView imageView07 = (ImageView) findViewById(R.id.iv1);
                Picasso.get().load("https://s8.uupload.ir/files/1701414904328_jsg.jpg").placeholder(R.drawable.logo2).into(imageView07);
                break;
            case 8:
                ImageView imageView08 = (ImageView) findViewById(R.id.iv1);
                Picasso.get().load("https://s8.uupload.ir/files/298263934_5270347893061121_2313392580954440863_n_d47340fc-5056-a36a-0a0b7b41989b3bfe-d4733fb35056a36_d4734860-5056-a36a-0aef21d4a2fe22c8_xrz2.jpg").placeholder(R.drawable.logo2).into(imageView08);
                break;
            case 9:
                ImageView imageView09 = (ImageView) findViewById(R.id.iv1);
                Picasso.get().load("https://s8.uupload.ir/files/61897a35583a9b51db018d3e_martinpublicseating-97560-importance-school-library-blogbanner1_2bel.jpg").placeholder(R.drawable.logo2).into(imageView09);
                break;
        }

        ImageView imageView1 = (ImageView) findViewById(R.id.imv1);
        Picasso.get().load("https://s8.uupload.ir/files/circus-vancouver-1024x694_75u.jpg").error(R.drawable.error).into(imageView1);

    }
}