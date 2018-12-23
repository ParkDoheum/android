package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.myapplication.join.JoinActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveActivity(View v) {
        Intent intent = null;
        switch(v.getId()) {
            case R.id.btn_calc:
                intent = new Intent(MainActivity.this, SimpleCalcActivity.class);
                break;
            case R.id.btn_join:
                intent = new Intent(MainActivity.this, JoinActivity.class);
                break;
            case R.id.btn_ajaxList:
                intent = new Intent(MainActivity.this, AjaxListActivity.class);
                break;
            case R.id.btn_imageView:
                intent = new Intent(MainActivity.this, ImageViewActivity.class);
                break;
        }

        if (intent != null) {
            startActivity(intent);
        }
    }

}













