package com.android.mylibrary;

import static android.view.View.VISIBLE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.widget.NestedScrollView;

import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;
import com.transitionseverywhere.extra.Scale;

public class Settings_activity extends AppCompatActivity {

    //for theme ------------
    private RadioGroup radioGroup;
    private static final String PREFS_NAME = "MyPrefs";
    private static final String PREF_SELECTED_THEME = "SelectedTheme";
    //for change text size --------------
    private TextSize settingsManager;
    private TextView sampleText;
    private SeekBar textSizeSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //Animation ------------
        final ViewGroup r = findViewById(R.id.nested_scrollview);
        final TextView t1 = findViewById(R.id.t1);
        final LinearLayout t2 = findViewById(R.id.list);
        final TextView t3 = findViewById(R.id.t2);
        final SeekBar t4 = findViewById(R.id.seekbar);
        final TextView t5 = findViewById(R.id.textview);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Slide();
                transition.setDuration(600);
                TransitionManager.beginDelayedTransition(r, transition);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
            }
        }, 200);

        // If SDK version is lower than 28 (Android9), hide the Theme option
        TextView textView = findViewById(R.id.t1);
        LinearLayout linearLayout = findViewById(R.id.list);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Transition transition = new Slide();
                    transition.setDuration(600);
                    TransitionManager.beginDelayedTransition(r, transition);
                    t1.setVisibility(View.VISIBLE);
                    t2.setVisibility(View.VISIBLE);
                }
            }, 200);
        } else {
            textView.setVisibility(View.GONE);
            linearLayout.setVisibility(View.GONE);
        }

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

        //Change theme -----------------------
        radioGroup = findViewById(R.id.radioGroup);

        // restore theme from SharedPreferences
        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        int selectedTheme = preferences.getInt(PREF_SELECTED_THEME, AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
        // set selected theme to default
        AppCompatDelegate.setDefaultNightMode(selectedTheme);

        // show selected option in RadioGroup
        switch (selectedTheme) {
            case AppCompatDelegate.MODE_NIGHT_NO:
                radioGroup.check(R.id.btnLight);
                break;
            case AppCompatDelegate.MODE_NIGHT_YES:
                radioGroup.check(R.id.btnDark);
                break;
            case AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM:
            default:
                radioGroup.check(R.id.btnDefault);
                break;
        }

        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            int theme;
            switch (checkedId) {
                case R.id.btnLight:
                    theme = AppCompatDelegate.MODE_NIGHT_NO;
                    break;
                case R.id.btnDark:
                    theme = AppCompatDelegate.MODE_NIGHT_YES;
                    break;
                case R.id.btnDefault:
                default:
                    theme = AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM;
                    break;
            }
            // save theme in SharedPreferences
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt(PREF_SELECTED_THEME, theme);
            editor.apply();

            // recreate activity to apply theme
            recreate();
        });

        //Change text size -----------------
        settingsManager = new TextSize(this);
        sampleText = findViewById(R.id.textview);

        float textSize = settingsManager.getTextSize();
        sampleText.setTextSize(textSize);

        settingsManager = new TextSize(this);

        sampleText = findViewById(R.id.textview);
        textSizeSeekBar = findViewById(R.id.seekbar);

        // Default size for text
        textSizeSeekBar.setProgress((int) settingsManager.getTextSize());

        // For changes in seekbar
        textSizeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Min and Max for textsize
                float minTextSize = 10;
                float maxTextSize = 40;

                // Limit progress for min and max
                float textSize = Math.max(minTextSize, Math.min(progress, maxTextSize));
                sampleText.setTextSize(textSize);
                settingsManager.setTextSize(textSize);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });


    }
}
