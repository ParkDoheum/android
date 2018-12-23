package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleCalcActivity extends AppCompatActivity {

    EditText et_1, et_2;
    TextView tv_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calc);

        et_1 = findViewById(R.id.et_1);
        et_2 = findViewById(R.id.et_2);
        tv_1 = findViewById(R.id.tv_1);
    }

    public void clkCalc(View v) {
        String strEt1 = et_1.getText().toString();
        String strEt2 = et_2.getText().toString();

        Button btn = (Button)v;
        String calcSymbol = btn.getText().toString();

        if (strEt1.equals("") || strEt2.equals("")) {
            Toast.makeText(SimpleCalcActivity.this, "빈 값이 있습니다.", Toast.LENGTH_SHORT).show();
            return;
        } else if(calcSymbol.equals("/") && strEt2.equals("0")) {
            Toast.makeText(SimpleCalcActivity.this, "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
            return;
        }

        int intEt1 = Integer.parseInt(strEt1);
        int intEt2= Integer.parseInt(strEt2);

        String strResult = "";
        switch(calcSymbol) {
            case "+":
                strResult = Integer.toString(intEt1 + intEt2);
                break;
            case "-":
                strResult = Integer.toString(intEt1 - intEt2);
                break;
            case "/":
                strResult = Integer.toString(intEt1 / intEt2);
                break;
            case "*":
                strResult = Integer.toString(intEt1 * intEt2);
                break;
            default:
                break;
        }

        tv_1.setText(strResult);
    }
}











