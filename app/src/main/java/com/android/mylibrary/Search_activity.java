package com.android.mylibrary;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;


import com.transitionseverywhere.Fade;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import java.util.ArrayList;

public class Search_activity extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String[] title;
    String[] description;
    ArrayList<Model> arrayList = new ArrayList<Model>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //Gradient -----------
        LinearLayout linearLayout = findViewById(R.id.search);
        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.search);
        final ListView t1 = findViewById(R.id.listView);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Fade();
                transition.setDuration(1200);
                TransitionManager.beginDelayedTransition(r,transition);
                t1.setVisibility(View.VISIBLE);
            }
        },200);



        //------------------------------------------------------------------------

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("");

        title = new String[]{"همه داستان ها", "دسته بندی ها", "کتابخانه من ؟!", "چرا کتاب ؟", "درباره ما"
                , "تنظیمات", "دسته بندی مذهبی", "دسته بندی عاطفی", "دسته بندی خنده و طنز", "دسته بندی غمگین"
                , "دسته بندی درس آموز", "ارتباط قلبی", "ادیسون", "چوپان", "وقتی که او مرد"
                , "یک لنگه کفش", "مجازات شغالان", "خبر مرگ نوبل", "مراقبت", "آتش و گنجشک"
                , "خطر آسایش", "پیرمرد بازنشسته", "پسرک و خدا", "ابوریحان و مزدور", "پنجره طلایی"
                , "دیدن خدا", "اول رئیس", "داروی جدید", "پدر و پسر", "پادشاه بی خرد"
                , "پندهای لقمان", "پند دزد", "پیرمرد", "تور تفریحی پیرزن ها", "بازرگان و انوشیروان"
                , "بلیط سیرک", "بهترین شمشیرزن", "تلفن و طلاق", "تقلا", "بهترین هدیه"
                , "راننده کامیون", "مراحل تشرف", "پلیکان", "جنگ و نیزه", "ادعای خدایی"
                , "فریب", "بیکاری", "مرد فقیر", "توقع زیاد", "پیرمرد خردمند"
                , "خانم و آقای لطفی", "جواب فورد", "خط صاف", "مرد ثروتمند", "دو سطل"
                , "تلاش بیهوده", "استراحت کوتاه مادرانه", "ارزش هر شخص", "نتیجه دروغگویی", "هنر گوش دادن"
                , "سمعک ارزان قیمت", "غذای مجانی", "پل دوستی", "سکوت و راستی", "چهره حق"
                , "مرد فاسق و حضرت موسی", "مرد فقیر و ثروتمند", "مرده متحرک", "خودخواهی", "شکستن چوب ها"
                , "تیمارستان"};

        description = new String[]{"گوشی که دنبالشی اینجاست", "دسته بندی گوشی ها بر اساس سال ساخت", "همه سری گوشی های سامسونگ", "همه چی رو باهم مقایسه کن", "بر اساس سلیقه شما"
                , "یادگیری", "شخصی سازی به سبک رسمی", "تست به روش پیشمهادی سامسونگ", "همه رو غافلگیر کن !", "آنتن دهی بهتر گوشی"
                , "سازندگان برنامه سامسونگ من", "روش های شخصی سازی", "سازندگان برنامه سامسونگ من", "چیزهایی که نمیدونستی!", "برنامه GoodLock"
                , "آپدیت اندروید و امنیتی", "سری های مختلف سامسونگ", "گوشی های تاشو", "گوشی های پرجمدار", "درحد پرچمدار"
                , "میانرده قدرتمند", "اقتصادی", "به صرفه", "تبلت", "میانرده قدیمی"
                , "روش استفاده از افزونه های GoodLock", "بررسی تخصصی سری ها", "بررسی تخصصی سری ها", "بررسی تخصصی سری ها", "بررسی تخصصی سری ها"
                , "بررسی تخصصی سری ها", "بررسی تخصصی سری ها", "بررسی تخصصی سری ها", "بررسی تخصصی سری ها", "بررسی تخصصی سری ها"
                , "گوشی های سال 2022", "گوشی های سال 2021", "گوشی های سال 2020", "گوشی های سال 2018", "Galaxy Z"
                , "Galaxy Z", "Galaxy Z", "Galaxy Z", "Galaxy A", "Galaxy A"
                , "Galaxy A", "Galaxy S", "Galaxy S", "Galaxy S", "Galaxy S"
                , "Galaxy A", "Galaxy NOTE", "Galaxy NOTE", "Galaxy NOTE", "Galaxy M"
                , "Galaxy M", "Galaxy M", "Galaxy F", "Galaxy F", "Galaxy F"
                , "Galaxy TAB", "Galaxy TAB", "Galaxy TAB", "Galaxy J", "Galaxy J"
                , "Galaxy TAB", "Galaxy TAB", "Galaxy TAB", "Galaxy J", "Galaxy J"
                , "Galaxy J"};


        listView = findViewById(R.id.listView);

        for (int i = 0; i < title.length; i++) {
            Model model = new Model(title[i], description[i]);
            //bind all strings in an array
            arrayList.add(model);
        }

        //pass results to listViewAdapter class
        adapter = new ListViewAdapter(this, arrayList);

        //bind the adapter to the listview
        listView.setAdapter(adapter);
    }

    //=============================================
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)) {
                    adapter.filter("");
                    listView.clearTextFilter();
                } else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }
    //=======================

}