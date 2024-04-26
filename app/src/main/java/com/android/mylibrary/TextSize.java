package com.android.mylibrary;

import android.content.Context;
import android.content.SharedPreferences;

public class TextSize {
    private static final String PREFS_NAME = "MyAppPrefs";
    private static final String TEXT_SIZE_KEY = "text_size";

    private SharedPreferences preferences;
    private float defaultTextSize = 17.0f; // حجم متن پیش‌فرض

    public TextSize(Context context) {
        preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    public void setTextSize(float textSize) {
        preferences.edit().putFloat(TEXT_SIZE_KEY, textSize).apply();
    }

    public float getTextSize() {
        return preferences.getFloat(TEXT_SIZE_KEY, defaultTextSize);
    }
}

