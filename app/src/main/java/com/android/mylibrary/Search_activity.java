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

        description = new String[]{"از همه نوع", "بر اساس سلیقه شما", "چرا کتابخانه من؟", "اصلا کتاب بخونم؟", "ارتباط مستقیم"
                , "شخصی سازی", "دسته بندی 1", "دسته بندی 2", "دسته بندی 3", "دسته بندی 4"
                , "دسته بندی 5", "داستان 1", "داستان 2", "داستان 3", "داستان 4"
                , "داستان 5", "داستان 6", "داستان 7", "داستان 8", "داستان 9"
                , "داستان 10", "داستان 11", "داستان 12", "داستان 13", "داستان 14"
                , "داستان 15", "داستان 16", "داستان 17", "داستان 18", "داستان 19"
                , "داستان 20", "داستان 21", "داستان 22", "داستان 23", "داستان 24"
                , "داستان 25", "داستان 26", "داستان 27", "داستان 28", "داستان 29"
                , "داستان 30", "داستان 31", "داستان 32", "داستان 33", "داستان 34"
                , "داستان 35", "داستان 36", "داستان 37", "داستان 38", "داستان 39"
                , "داستان 40", "داستان 41", "داستان 42", "داستان 43", "داستان 44"
                , "داستان 45", "داستان 46", "داستان 47", "داستان 48", "داستان 49"
                , "داستان 50", "داستان 51", "داستان 52", "داستان 53", "داستان 54"
                , "داستان 55", "داستان 56", "داستان 57", "داستان 58", "داستان 59"
                , "داستان 60"};


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