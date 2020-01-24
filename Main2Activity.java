package com.example.validaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);


        Intent i=getIntent();
        t1.setText("E_Mail: "+i.getStringExtra("ankit"));
        t2.setText("Number: "+i.getStringExtra("uday"));
        t3.setText("UserName: "+i.getStringExtra("nirav"));
        t4.setText("Password: "+i.getStringExtra("raj"));
        t5.setText("Address: "+i.getStringExtra("ajay"));
    }
}
