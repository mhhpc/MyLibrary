package com.android.mylibrary;

import android.content.SharedPreferences;
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

import com.adivery.sdk.Adivery;
import com.adivery.sdk.AdiveryAdListener;
import com.adivery.sdk.AdiveryBannerAdView;
import com.adivery.sdk.AdiveryNativeAdView;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class BaseStoryActivity extends AppCompatActivity {

    private TextSize settingsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        //adivery
        Adivery.configure(getApplication(), "c6374f27-4788-4704-92b3-7fc1c882f4e2");
        Adivery.prepareAppOpenAd(BaseStoryActivity.this, "b7cdd8e0-2af3-49ed-b612-74d129ece9f0");
        //appopen %5
        checkAndIncreaseRunCount();

        //banner
        AdiveryBannerAdView bannerAd = findViewById(R.id.banner_ad);
        bannerAd.setBannerAdListener(new AdiveryAdListener() {
            @Override
            public void onAdLoaded() {
                // تبلیغ به‌طور خودکار نمایش داده می‌شود، هر کار دیگری لازم است اینجا انجام دهید.
            }
            @Override
            public void onError(String reason){
                // خطا را چاپ کنید تا از دلیل آن مطلع شوید
            }
            @Override
            public void onAdClicked(){
                // کاربر روی بنر کلیک کرده
            }
        });

        //native
        AdiveryNativeAdView adView = findViewById(R.id.native_ad_view);

        adView.setListener(new AdiveryAdListener() {
            @Override
            public void onAdLoaded() {
                // تبلیغ شما بارگذاری شد
            }

            @Override
            public void onAdShown() {
                // تبلیغ نمایش داده شد
            }

            @Override
            public void onAdClicked() {
                // کاربر روی تبلیغ کلیک کرد
            }
        });
        adView.loadAd();

        bannerAd.loadAd();

        // Text size
        setupText();

        // Animation
        setupAnimations();

        // Background
        setupGradientBackground();

        // Load image by url
        setupImages();

        // Load image by url
        setupRandomImage();
    }

    private void checkAndIncreaseRunCount() {
        SharedPreferences prefs2 = getSharedPreferences("AppPrefs", MODE_PRIVATE);
        int storyRunCount2 = prefs2.getInt("appRunCount", 0);

        if (storyRunCount2 > 0 && storyRunCount2 % 5 == 0) {
            if (Adivery.isLoaded("b7cdd8e0-2af3-49ed-b612-74d129ece9f0")){
                Adivery.showAppOpenAd(BaseStoryActivity.this, "b7cdd8e0-2af3-49ed-b612-74d129ece9f0");
            }
        }
        prefs2.edit().putInt("appRunCount", storyRunCount2 + 1).apply();
    }

    //Top Random Image
    private void setupRandomImage() {
        ImageView imageView = findViewById(R.id.iv1);
        ImageLoaderUtil.loadRandomImage(imageView);
    }

    private void setupText() {
        List<Integer> textIds = getTextIds();
        int[] textViewIds = {R.id.tv1, R.id.t1, R.id.t2, R.id.t3, R.id.t4, R.id.t5};

        for (int i = 0; i < textIds.size(); i++) {
            int textId = textIds.get(i);
            TextView textView = findViewById(textViewIds[i]);
            if (textView != null) {
                textView.setText(getString(textId));
            }
        }

        // Set text size
        settingsManager = new TextSize(this);
        float textSize = settingsManager.getTextSize();

        for (int id : textViewIds) {
            TextView textView = findViewById(id);
            if (textView != null) {
                textView.setTextSize(textSize);
            }
        }
    }

    //Set animation
    private void setupAnimations() {
        configureAnimation();
    }

    protected abstract void configureAnimation();

    // Gradient animated background
    private void setupGradientBackground() {
        ConstraintLayout constraintLayout = findViewById(R.id.story);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
    }

    //Set images by picasso
    private void setupImages() {
        List<String> imageUrls = getImageUrls();
        for (int i = 0; i < imageUrls.size(); i++) {
            String url = imageUrls.get(i);
            int imageViewId = getImageViewId(i);

            ImageView imageView = findViewById(imageViewId);
            if (imageView != null && url != null && !url.isEmpty()) {

                if (imageViewId == R.id.imv1) {
                    Picasso.get().load(url).noFade().error(R.drawable.error).into(imageView);
                } else {
                    Picasso.get().load(url).placeholder(R.drawable.progress_animation).error(R.drawable.error).into(imageView);
                }
            }
        }
    }

    protected abstract List<String> getImageUrls();

    protected int getImageViewId(int index) {
        switch (index) {
            case 0:
                return R.id.imv1;
            case 1:
                return R.id.im1;
            case 2:
                return R.id.im2;
            case 3:
                return R.id.im3;
            case 4:
                return R.id.im4;
            default:
                return -1;
        }
    }

    protected abstract List<Integer> getTextIds();

}


