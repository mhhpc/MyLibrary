package com.android.mylibrary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;
import com.transitionseverywhere.extra.Scale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView imageView_menu, imageView_search, imageView_settings, imageView_about;

    private TextSize settingsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //apply selected theme ----------
        applyTheme();
        setContentView(R.layout.activity_main);

        //Change text size
        settingsManager = new TextSize(this);
        TextView Textview1 = findViewById(R.id.text1);
        TextView Textview2 = findViewById(R.id.t1);
        TextView Textview3 = findViewById(R.id.t2);
        TextView Textview4 = findViewById(R.id.tv1);
        TextView Textview5 = findViewById(R.id.tv2);
        TextView Textview6 = findViewById(R.id.tv3);

        float textSize = settingsManager.getTextSize();
        Textview1.setTextSize(textSize);
        Textview2.setTextSize(textSize);
        Textview3.setTextSize(textSize);
        Textview4.setTextSize(textSize);
        Textview5.setTextSize(textSize);
        Textview6.setTextSize(textSize);

        //Gradient -----------
        drawerLayout = findViewById(R.id.main);
        AnimationDrawable animationDrawable = (AnimationDrawable) drawerLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //first run dialog --------------
        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        boolean firstStart = prefs.getBoolean("firstStart", true);
        if (firstStart) {
            showStartDialog();
        }

        //Animation ------------
        final ViewGroup r = findViewById(R.id.main);
        final LinearLayout t1 = findViewById(R.id.list);
        final LinearLayout t2 = findViewById(R.id.menu1);
        final LinearLayout t3 = findViewById(R.id.list2);
        final LinearLayout t4 = findViewById(R.id.ll1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Scale();
                transition.setDuration(600);
                TransitionManager.beginDelayedTransition(r, transition);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
            }
        }, 200);

        //Image links
        ImageView ImageView = (ImageView) findViewById(R.id.miv1);
        Picasso.get().load("https://s8.uupload.ir/files/_ff62c125-76ab-4859-8587-8ebc154fabb4(1)_2sie.jpg").into(ImageView);

        ImageView ImageView2 = (ImageView) findViewById(R.id.miv2);
        Picasso.get().load("https://s8.uupload.ir/files/_33dde004-9358-4709-97b8-41deca4d338e(1)_2sk.jpg").into(ImageView2);

        //text onclick
        @SuppressLint("CutPasteId") TextView txt1 = (TextView) findViewById(R.id.t1);
        txt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Stories_activity.class));
            }
        });

        @SuppressLint("CutPasteId") TextView txt2 = (TextView) findViewById(R.id.t2);
        txt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Categories_activity.class));
            }
        });

        //Image buttons onclick
        @SuppressLint("CutPasteId") ImageView btn1 = (ImageView) findViewById(R.id.b1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Stories_activity.class));
            }
        });

        @SuppressLint("CutPasteId") ImageView btn2 = (ImageView) findViewById(R.id.b2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Categories_activity.class));
            }
        });

        //button onclick
        @SuppressLint("CutPasteId") CardView bt1 = (CardView) findViewById(R.id.cv1);
        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, About_activity.class));
            }
        });

        //-------------
        init();
        onclick();

    }

    //first run dialog ----------------------
    private void showStartDialog() {
        new AlertDialog.Builder(this)
                .setTitle("توجه!")
                .setMessage("هنگام ورود به هر قسمت از برنامه برای اولین بار، اینترنت خود را روشن نگه دارید تا بهترین تجربه را از کتابخانه من داشته باشید (:")
                .setPositiveButton("تایید", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create().show();

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("firstStart", false);
        editor.apply();
    }

    //apply selected theme ----------
    @Override
    protected void onResume() {
        super.onResume();
        applyTheme();
    }
    //apply selected theme ----------
    private void applyTheme() {
        // بازیابی تم انتخاب شده از SharedPreferences
        SharedPreferences preferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        int selectedTheme = preferences.getInt("SelectedTheme", AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
        // تنظیم تم انتخاب شده
        AppCompatDelegate.setDefaultNightMode(selectedTheme);
    }

    private void init() {
        drawerLayout = findViewById(R.id.main);
        navigationView = findViewById(R.id.navigationView);
        imageView_menu = findViewById(R.id.imageView_menu);
        imageView_search = findViewById(R.id.imageView_search);
        imageView_settings = findViewById(R.id.imageView_settings);
        imageView_about = findViewById(R.id.imageView_about);

        navigationView.bringToFront();
    }

    private void onclick() {

        imageView_menu.setOnClickListener(this);
        imageView_search.setOnClickListener(this);
        imageView_settings.setOnClickListener(this);
        imageView_about.setOnClickListener(this);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.menu_rate:
                        drawerLayout.closeDrawers();
                        Intent intentRate = new Intent(Intent.ACTION_VIEW);
                        intentRate.setData(Uri.parse("https://cafebazaar.ir/app/com.example.short_stories"));
                        startActivity(intentRate);
                        break;

                    case R.id.menu_aboutUs:
                        drawerLayout.closeDrawers();
                        startActivity(new Intent(MainActivity.this, About_activity.class));
                        break;

                    case R.id.menu_exit:
                        drawerLayout.closeDrawers();
                        finish();
                        break;

                    case R.id.menu_share:
                        Intent intentSend = new Intent();
                        intentSend.setAction(Intent.ACTION_SEND);
                        intentSend.putExtra(Intent.EXTRA_TEXT, "سلام \n به راحتی میتونی اپلیکیشن کتابخانه من رو از لینک زیر دانلود کنی ;) \n https://cafebazaar.ir/app/com.example.short_stories");
                        intentSend.setType("text/plain");

                        Intent share = Intent.createChooser(intentSend, null);
                        startActivity(share);
                }
                return true;
            }
        });
    }

    @Override
    public void onClick(View v) {

        if (v == imageView_menu) {
            drawerLayout.openDrawer(Gravity.RIGHT);
        }

        if (v == imageView_search) {
            Intent intent = new Intent(this, Search_activity.class);
            startActivity(intent);
        }

        if (v == imageView_settings) {
            Intent intent = new Intent(this, Settings_activity.class);
            startActivityForResult(intent, REQUEST_SETTINGS);
        }
        if (v == imageView_about) {
            Intent intent = new Intent(this, About_activity.class);
            startActivity(intent);
        }

    }

    //if onresume from activity_settings recreate() activity_main
    static final int REQUEST_SETTINGS = 1;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_SETTINGS && resultCode == RESULT_OK) {
            recreate();
        }
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(Gravity.RIGHT)) {
            drawerLayout.closeDrawers();
        } else {
            super.onBackPressed();
        }
    }

}