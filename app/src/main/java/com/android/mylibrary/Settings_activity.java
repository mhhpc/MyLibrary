package com.android.mylibrary;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class Settings_activity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private SharedPreferences sharedPreferences;
    private static final String THEME_PREF = "theme_pref";
    private static final String TAG = "SettingsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        radioGroup = findViewById(R.id.radioGroup);
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
                    theme = AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM;
                    break;
                default:
                    theme = AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM;
                    break;
            }
            Log.d(TAG, "isChecked:" + (checkedId != -1) + " theme:" + theme);
            AppCompatDelegate.setDefaultNightMode(theme);
        });

    }
}