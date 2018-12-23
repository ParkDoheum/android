package com.example.administrator.myapplication.join;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.myapplication.R;

public class JoinResultActivity extends AppCompatActivity {
    private TextView tv_name_value, tv_age_value, tv_habbit_value, tv_sex_value;
    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_result);
        tv_name_value = findViewById(R.id.tv_name_value);
        tv_age_value = findViewById(R.id.tv_age_value);
        tv_habbit_value = findViewById(R.id.tv_habbit_value);
        tv_sex_value = findViewById(R.id.tv_sex_value);
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String age = intent.getStringExtra("age");
        String habbit = intent.getStringExtra("habbit");
        String sex = intent.getStringExtra("sex");
        tv_name_value.setText(name);
        tv_age_value.setText(age);
        tv_habbit_value.setText(habbit);
        tv_sex_value.setText(sex);
    }
}
