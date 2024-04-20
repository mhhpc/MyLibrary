package com.android.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class Settings_activity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        MaterialButtonToggleGroup btg_theme = findViewById(R.id.btg_theme);
        btg_theme.addOnButtonCheckedListener((group, selectedBtnId, isChecked) -> {
            if (isChecked) {
                int theme;
                switch (selectedBtnId) {
                    case R.id.btnDefault:
                        theme = AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM;
                        break;
                    case R.id.btnDark:
                        theme = AppCompatDelegate.MODE_NIGHT_YES;
                        break;
                    default:
                        theme = AppCompatDelegate.MODE_NIGHT_NO;
                        break;
                }
                Log.d(TAG, "isChecked:" + isChecked + " theme:" + theme);
                AppCompatDelegate.setDefaultNightMode(theme);
            }
        });

    }
}