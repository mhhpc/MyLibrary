package com.android.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.widget.NestedScrollView;

import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class Settings_activity extends AppCompatActivity {

    //for theme ------------
    private RadioGroup radioGroup;
    private static final String PREFS_NAME = "MyPrefs";
    private static final String PREF_SELECTED_THEME = "SelectedTheme";

    private TextSize settingsManager;
    private TextView sampleText;
    private SeekBar textSizeSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

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

        settingsManager = new TextSize(this);
        sampleText = findViewById(R.id.textview);

        float textSize = settingsManager.getTextSize();
        sampleText.setTextSize(textSize);

        settingsManager = new TextSize(this);

        sampleText = findViewById(R.id.textview);
        textSizeSeekBar = findViewById(R.id.seekbar);

// مقدار اولیه برای سایز متن
        textSizeSeekBar.setProgress((int) settingsManager.getTextSize());

// برای تغییرات در SeekBar
        textSizeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // تعیین حداقل و حداکثر مقدار برای اندازه متن
                float minTextSize = 10;
                float maxTextSize = 40;

                // محدود کردن مقدار progress به حداقل و حداکثر مقادیر مجاز
                float textSize = Math.max(minTextSize, Math.min(progress, maxTextSize));
                sampleText.setTextSize(textSize);
                settingsManager.setTextSize(textSize);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });


    }
}
