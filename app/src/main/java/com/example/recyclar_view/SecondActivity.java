package com.example.recyclar_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       /* TextView textView = findViewById(R.id.t);
        TextView textView1 = findViewById(R.id.tt);
        TextView textView2 = findViewById(R.id.ttt);
        ImageView imageView =findViewById(R.id.p);
        int  number = getIntent().getIntExtra("img",0);
        String desc =getIntent().getStringExtra("rate");
        String desc2 =getIntent().getStringExtra("story");
        String desc3 =getIntent().getStringExtra("num");

        imageView.setImageResource(number);
        textView.setText(desc3);
        textView2.setText(desc2);
        textView1.setText(desc);*/
    }
}
