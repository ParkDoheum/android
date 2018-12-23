package com.example.administrator.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.administrator.myapplication.model.ImageTitleVO;
import java.util.ArrayList;
import java.util.List;

public class ImageListActivity extends AppCompatActivity {
    private ListView listView;
    private List<ImageTitleVO> list = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_list);
        listView = findViewById(R.id.listView);

        ImageTitleVO vo1 = new ImageTitleVO("http://www.topstarnews.net/news/photo/201805/416010_62936_104.jpg", "트와이스");
        ImageTitleVO vo2 = new ImageTitleVO("http://static.hubzum.zumst.com/hubzum/2017/07/19/13/25ae58643b56453da421d17a4e42dbc5_780x0c.jpg", "블랙핑크");
        ImageTitleVO vo3 = new ImageTitleVO("https://i.ytimg.com/vi/aiHSVQy9xN8/maxresdefault.jpg", "레드벨벳");
        ImageTitleVO vo4 = new ImageTitleVO("https://librewiki.net/images/1/15/Lovelyz_Healing_Concept.jpg", "러블리즈");
        ImageTitleVO vo5 = new ImageTitleVO("https://i.ytimg.com/vi/aiHSVQy9xN8/maxresdefault.jpg", "레드벨벳2");
        
        ImageTitleVO vo7 = new ImageTitleVO("https://i.ytimg.com/vi/aiHSVQy9xN8/maxresdefault.jpg", "레드벨벳7");


        list.add(vo1);
        list.add(vo2);
        list.add(vo3);
        list.add(vo4);
        list.add(vo5);
        list.add(vo7);

        list.add(new ImageTitleVO("https://librewiki.net/images/1/15/Lovelyz_Healing_Concept.jpg","러블리즈2"));
    }
}

class ImageListAdapter extends ArrayAdapter<ImageTitleVO> {
    private List<ImageTitleVO> list;

    public ImageListAdapter(Context ctx, List<ImageTitleVO> list) {
        super(ctx, 0, list);
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public View getView(int position, View cv, ViewGroup parent) {

        return cv;
    }
}
