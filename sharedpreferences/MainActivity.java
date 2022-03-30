package com.example.sjcet.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3,et4,et5,et6;
    TextView tv1;
    Button bt1;

//    SharedPreferences sharedPreferences;
//    SharedPreferences MyPrefs=getSharedPreferences("MyPREFERENCES",MODE_PRIVATE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        et4=findViewById(R.id.et4);
        et5=findViewById(R.id.et5);
        et6=findViewById(R.id.et6);
        tv1=findViewById(R.id.tv1);
        bt1=findViewById(R.id.bt1);

    }

    public void click(View view) {
        checkDataEntered();
        String str = et1.getText().toString();
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("message_key",str);
        startActivity(intent);
//        SharedPreferences MyPrefs = getSharedPreferences(this,Main2Activity);
//        MyPrefs.Editor editor = sharedPreferences.edit();
//        editor.putString(MyPrefs.getString("fname",et1.toString()));
//        editor.commit();

    }
    public void checkDataEntered()
    {
        if (et1.getText().toString() == null)
            Toast.makeText(this,"Full name required",Toast.LENGTH_SHORT).show();

        if (et2.getText() == null)
            Toast.makeText(this,"Email required",Toast.LENGTH_SHORT).show();

        if (et3.getText() == null)
            Toast.makeText(this,"Mobile required",Toast.LENGTH_SHORT).show();

        if (et4.getText() == null)
            Toast.makeText(this,"Username required",Toast.LENGTH_SHORT).show();

        if (et5.getText() == null)
            Toast.makeText(this,"Password required",Toast.LENGTH_SHORT).show();

        if (et6.getText() == null)
            Toast.makeText(this,"Date of Birth required",Toast.LENGTH_SHORT).show();

    }
}
