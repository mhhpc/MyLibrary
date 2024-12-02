package com.android.mylibrary;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.Random;

public class ImageLoaderUtil {
    public static void loadRandomImage(ImageView imageView) {
        String[] imageUrls = {
                "https://s8.uupload.ir/files/library_ct4e.jpg",
                "https://s8.uupload.ir/files/istock-1087508538_vtl1.jpg",
                "https://s8.uupload.ir/files/gettyimages-900301626_437925_t2i3bm_vfs.jpg",
                "https://s8.uupload.ir/files/free-book_o3d2.jpg",
                "https://s8.uupload.ir/files/elenaleonova-books_6nrv.jpg",
                "https://s8.uupload.ir/files/best-novels-for-beginners_5hhl.jpg",
                "https://s8.uupload.ir/files/aacc-library-1-1500x844_7z6g.jpg",
                "https://s8.uupload.ir/files/1701414904328_jsg.jpg",
                "https://s8.uupload.ir/files/298263934_5270347893061121_2313392580954440863_n_d47340fc-5056-a36a-0a0b7b41989b3bfe-d4733fb35056a36_d4734860-5056-a36a-0aef21d4a2fe22c8_xrz2.jpg",
                "https://s8.uupload.ir/files/61897a35583a9b51db018d3e_martinpublicseating-97560-importance-school-library-blogbanner1_2bel.jpg"
        };

        Random random = new Random();
        int randomNumber = random.nextInt(imageUrls.length);

        Picasso.get()
                .load(imageUrls[randomNumber])
                .noFade()
                .placeholder(R.drawable.logo2)
                .into(imageView);
    }
}

