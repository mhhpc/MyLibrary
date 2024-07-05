package com.android.mylibrary;


import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;

import com.squareup.picasso.Picasso;

import java.util.Random;

public class Sto1_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sto1);

        //Gradient
        ConstraintLayout constraintLayout = findViewById(R.id.sto1);
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
        Picasso.get().load("https://s8.uupload.ir/files/360_f_666470913_rnumwfo72pdcddirj87klatwznvqcdof_jy4o.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(imageView1);

    }
}