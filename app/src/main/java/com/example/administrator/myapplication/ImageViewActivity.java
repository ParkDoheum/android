package com.example.administrator.myapplication;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;

public class ImageViewActivity extends AppCompatActivity {
    private TextView tv_title;
    private ImageView iv_1, iv_2, iv_3, iv_4, iv_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        setTitle(R.string.title_imageview);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText(R.string.title_imageview);
        iv_1 = findViewById(R.id.iv_1);
        iv_2 = findViewById(R.id.iv_2);
        iv_3 = findViewById(R.id.iv_3);
        iv_4 = findViewById(R.id.iv_4);
        iv_5 = findViewById(R.id.iv_5);

        iv_1.setImageResource(R.drawable.twice);
        new DownloadImageTask(iv_2).execute("http://www.topstarnews.net/news/photo/201805/416010_62936_104.jpg");
        new DownloadImageTask(iv_3).execute("http://static.hubzum.zumst.com/hubzum/2017/07/19/13/25ae58643b56453da421d17a4e42dbc5_780x0c.jpg");
        new DownloadImageTask(iv_4).execute("https://i.ytimg.com/vi/aiHSVQy9xN8/maxresdefault.jpg");
        new DownloadImageTask(iv_5).execute("https://librewiki.net/images/1/15/Lovelyz_Healing_Concept.jpg");
    }


    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }
}

