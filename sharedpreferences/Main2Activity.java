package com.example.sjcet.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);
        tv6=findViewById(R.id.tv6);
        tv7=findViewById(R.id.tv7);



        Intent intent=getIntent();
        String str = intent.getStringExtra("message_key");
        tv2.setText(str);
//        SharedPreferences sharedPreferences=getSharedPreferences();
//        String str1 = sharedPreferences.getString("fname");
//        String str2 = sharedPreferences.getString("email");
//        String str3 = sharedPreferences.getString("mobile");
//        String str4 = sharedPreferences.getString("username");
//        String str5 = sharedPreferences.getString("password");
//        String str6 = sharedPreferences.getString("dob");
//
//        tv2.setText(str1);
//        tv3.setText(str2);
//        tv4.setText(str3);
//        tv5.setText(str4);
//        tv6.setText(str5);
//        tv7.setText(str6);
    }
}
