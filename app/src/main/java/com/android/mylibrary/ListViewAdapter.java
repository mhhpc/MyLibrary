package com.android.mylibrary;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.mylibrary.Categories.Cat_emotional;
import com.android.mylibrary.Categories.Cat_fun;
import com.android.mylibrary.Categories.Cat_instructive;
import com.android.mylibrary.Categories.Cat_religious;
import com.android.mylibrary.Categories.Cat_sad;
import com.android.mylibrary.Stories.Sto10_activity;
import com.android.mylibrary.Stories.Sto11_activity;
import com.android.mylibrary.Stories.Sto12_activity;
import com.android.mylibrary.Stories.Sto13_activity;
import com.android.mylibrary.Stories.Sto14_activity;
import com.android.mylibrary.Stories.Sto15_activity;
import com.android.mylibrary.Stories.Sto16_activity;
import com.android.mylibrary.Stories.Sto17_activity;
import com.android.mylibrary.Stories.Sto18_activity;
import com.android.mylibrary.Stories.Sto19_activity;
import com.android.mylibrary.Stories.Sto1_activity;
import com.android.mylibrary.Stories.Sto20_activity;
import com.android.mylibrary.Stories.Sto21_activity;
import com.android.mylibrary.Stories.Sto22_activity;
import com.android.mylibrary.Stories.Sto23_activity;
import com.android.mylibrary.Stories.Sto24_activity;
import com.android.mylibrary.Stories.Sto25_activity;
import com.android.mylibrary.Stories.Sto26_activity;
import com.android.mylibrary.Stories.Sto27_activity;
import com.android.mylibrary.Stories.Sto28_activity;
import com.android.mylibrary.Stories.Sto29_activity;
import com.android.mylibrary.Stories.Sto2_activity;
import com.android.mylibrary.Stories.Sto30_activity;
import com.android.mylibrary.Stories.Sto31_activity;
import com.android.mylibrary.Stories.Sto32_activity;
import com.android.mylibrary.Stories.Sto33_activity;
import com.android.mylibrary.Stories.Sto34_activity;
import com.android.mylibrary.Stories.Sto35_activity;
import com.android.mylibrary.Stories.Sto36_activity;
import com.android.mylibrary.Stories.Sto37_activity;
import com.android.mylibrary.Stories.Sto38_activity;
import com.android.mylibrary.Stories.Sto39_activity;
import com.android.mylibrary.Stories.Sto3_activity;
import com.android.mylibrary.Stories.Sto40_activity;
import com.android.mylibrary.Stories.Sto41_activity;
import com.android.mylibrary.Stories.Sto42_activity;
import com.android.mylibrary.Stories.Sto43_activity;
import com.android.mylibrary.Stories.Sto44_activity;
import com.android.mylibrary.Stories.Sto45_activity;
import com.android.mylibrary.Stories.Sto46_activity;
import com.android.mylibrary.Stories.Sto47_activity;
import com.android.mylibrary.Stories.Sto48_activity;
import com.android.mylibrary.Stories.Sto49_activity;
import com.android.mylibrary.Stories.Sto4_activity;
import com.android.mylibrary.Stories.Sto50_activity;
import com.android.mylibrary.Stories.Sto51_activity;
import com.android.mylibrary.Stories.Sto52_activity;
import com.android.mylibrary.Stories.Sto53_activity;
import com.android.mylibrary.Stories.Sto54_activity;
import com.android.mylibrary.Stories.Sto55_activity;
import com.android.mylibrary.Stories.Sto56_activity;
import com.android.mylibrary.Stories.Sto57_activity;
import com.android.mylibrary.Stories.Sto58_activity;
import com.android.mylibrary.Stories.Sto59_activity;
import com.android.mylibrary.Stories.Sto5_activity;
import com.android.mylibrary.Stories.Sto60_activity;
import com.android.mylibrary.Stories.Sto6_activity;
import com.android.mylibrary.Stories.Sto7_activity;
import com.android.mylibrary.Stories.Sto8_activity;
import com.android.mylibrary.Stories.Sto9_activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter{

    //variables
    Context mContext;
    LayoutInflater inflater;
    List<Model> modellist;
    ArrayList<Model> arrayList;

    //constructor
    public ListViewAdapter(Context context, List<Model> modellist) {
        mContext = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder{
        TextView mTitleTv, mDescTv;
        ImageView mIconIv;
    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int postition, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            //locate the views in row.xml
            holder.mTitleTv = view.findViewById(R.id.mainTitle);
            holder.mDescTv = view.findViewById(R.id.mainDesc);

            view.setTag(holder);

        }
        else {
            holder = (ViewHolder)view.getTag();
        }
        //set the results into textviews
        holder.mTitleTv.setText(modellist.get(postition).getTitle());
        holder.mDescTv.setText(modellist.get(postition).getDesc());
        //set the result in imageview

        //listview item clicks
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code later
                if (modellist.get(postition).getTitle().equals("همه داستان ها")){
                    Intent intent = new Intent(mContext, Stories_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("دسته بندی ها")){
                    Intent intent = new Intent(mContext, Categories_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("کتابخانه من ؟!")){
                    Intent intent = new Intent(mContext, MainActivity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("چرا کتاب ؟")){
                    Intent intent = new Intent(mContext, MainActivity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("درباره ما")){
                    Intent intent = new Intent(mContext, About_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("تنظیمات")){
                    Intent intent = new Intent(mContext, Settings_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("دسته بندی مذهبی")){
                    Intent intent = new Intent(mContext, Cat_religious.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("دسته بندی عاطفی")){
                    Intent intent = new Intent(mContext, Cat_emotional.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("دسته بندی خنده و طنز")){
                    Intent intent = new Intent(mContext, Cat_fun.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("دسته بندی غمگین")){
                    Intent intent = new Intent(mContext, Cat_sad.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("دسته بندی درس آموز")){
                    Intent intent = new Intent(mContext, Cat_instructive.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ارتباط قلبی")){
                    Intent intent = new Intent(mContext, Sto1_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ادیسون")){
                    Intent intent = new Intent(mContext, Sto2_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("چوپان")){
                    Intent intent = new Intent(mContext, Sto3_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("وقتی که او مرد")){
                    Intent intent = new Intent(mContext, Sto4_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("یک لنگه کفش")){
                    Intent intent = new Intent(mContext, Sto5_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("مجازات شغالان")){
                    Intent intent = new Intent(mContext, Sto6_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("خبر مرگ نوبل")){
                    Intent intent = new Intent(mContext, Sto7_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("مراقبت")){
                    Intent intent = new Intent(mContext, Sto8_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("آتش و گنجشک")){
                    Intent intent = new Intent(mContext, Sto9_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("خطر آسایش")){
                    Intent intent = new Intent(mContext, Sto10_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("پیرمرد بازنشسته")){
                    Intent intent = new Intent(mContext, Sto11_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("پسرک و خدا")){
                    Intent intent = new Intent(mContext, Sto12_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ابوریحان و مزدور")){
                    Intent intent = new Intent(mContext, Sto13_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("پنجره طلایی")){
                    Intent intent = new Intent(mContext, Sto14_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("دیدن خدا")){
                    Intent intent = new Intent(mContext, Sto15_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("اول رئیس")){
                    Intent intent = new Intent(mContext, Sto16_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("داروی جدید")){
                    Intent intent = new Intent(mContext, Sto17_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("پدر و پسر")){
                    Intent intent = new Intent(mContext, Sto18_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("پادشاه بی خرد")){
                    Intent intent = new Intent(mContext, Sto19_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("پندهای لقمان")){
                    Intent intent = new Intent(mContext, Sto20_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("پند دزد")){
                    Intent intent = new Intent(mContext, Sto21_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("پیرمرد")){
                    Intent intent = new Intent(mContext, Sto22_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("تور تفریحی پیرزن ها")){
                    Intent intent = new Intent(mContext, Sto23_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بازرگان و انوشیروان")){
                    Intent intent = new Intent(mContext, Sto24_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بلیط سیرک")){
                    Intent intent = new Intent(mContext, Sto25_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بهترین شمشیرزن")){
                    Intent intent = new Intent(mContext, Sto26_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("تلفن و طلاق")){
                    Intent intent = new Intent(mContext, Sto27_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("تقلا")){
                    Intent intent = new Intent(mContext, Sto28_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بهترین هدیه")){
                    Intent intent = new Intent(mContext, Sto29_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("راننده کامیون")){
                    Intent intent = new Intent(mContext, Sto30_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("مراحل تشرف")){
                    Intent intent = new Intent(mContext, Sto31_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("پلیکان")){
                    Intent intent = new Intent(mContext, Sto32_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("جنگ و نیزه")){
                    Intent intent = new Intent(mContext, Sto33_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ادعای خدایی")){
                    Intent intent = new Intent(mContext, Sto34_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("فریب")){
                    Intent intent = new Intent(mContext, Sto35_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بیکاری")){
                    Intent intent = new Intent(mContext, Sto36_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("مرد فقیر")){
                    Intent intent = new Intent(mContext, Sto37_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("توقع زیاد")){
                    Intent intent = new Intent(mContext, Sto38_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("پیرمرد خردمند")){
                    Intent intent = new Intent(mContext, Sto39_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("خانم و آقای لطفی")){
                    Intent intent = new Intent(mContext, Sto40_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("جواب فورد")){
                    Intent intent = new Intent(mContext, Sto41_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("خط صاف")){
                    Intent intent = new Intent(mContext, Sto42_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("مرد ثروتمند")){
                    Intent intent = new Intent(mContext, Sto43_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("دو سطل")){
                    Intent intent = new Intent(mContext, Sto44_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("تلاش بیهوده")){
                    Intent intent = new Intent(mContext, Sto45_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("استراحت کوتاه مادرانه")){
                    Intent intent = new Intent(mContext, Sto46_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ارزش هر شخص")){
                    Intent intent = new Intent(mContext, Sto47_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("نتیجه دروغگویی")){
                    Intent intent = new Intent(mContext, Sto48_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("هنر گوش دادن")){
                    Intent intent = new Intent(mContext, Sto49_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سمعک ارزان قیمت")){
                    Intent intent = new Intent(mContext, Sto50_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("غذای مجانی")){
                    Intent intent = new Intent(mContext, Sto51_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("پل دوستی")){
                    Intent intent = new Intent(mContext, Sto52_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سکوت و راستی")){
                    Intent intent = new Intent(mContext, Sto53_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("چهره حق")){
                    Intent intent = new Intent(mContext, Sto54_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("مرد فاسق و حضرت موسی")){
                    Intent intent = new Intent(mContext, Sto55_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("مرد فقیر و ثروتمند")){
                    Intent intent = new Intent(mContext, Sto56_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("مرده متحرک")){
                    Intent intent = new Intent(mContext, Sto57_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("خودخواهی")){
                    Intent intent = new Intent(mContext, Sto58_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("شکستن چوب ها")){
                    Intent intent = new Intent(mContext, Sto59_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("تیمارستان")){
                    Intent intent = new Intent(mContext, Sto60_activity.class);
                    mContext.startActivity(intent);
                }
            }
        });


        return view;
    }

    //filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if (charText.length()==0){
            modellist.addAll(arrayList);
        }
        else {
            for (Model model : arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    modellist.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }

}