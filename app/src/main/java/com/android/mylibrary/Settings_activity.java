package com.android.mylibrary;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.widget.NestedScrollView;

import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;

public class Settings_activity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private static final String TAG = "SettingsActivity";
    private static final String PREFS_NAME = "MyPrefs";
    private static final String PREF_SELECTED_THEME = "SelectedTheme";

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

        // بازیابی تم انتخاب شده از SharedPreferences
        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        int selectedTheme = preferences.getInt(PREF_SELECTED_THEME, AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
        // تنظیم تم انتخاب شده به عنوان تم پیشفرض
        AppCompatDelegate.setDefaultNightMode(selectedTheme);

        // نمایش گزینه انتخاب شده در RadioGroup
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
            // ذخیره تم انتخاب شده در SharedPreferences
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt(PREF_SELECTED_THEME, theme);
            editor.apply();

            // با استفاده از recreate()، اکتیویتی را مجدداً ایجاد می‌کنیم تا تغییرات اعمال شود.
            recreate();
        });

    }
}
