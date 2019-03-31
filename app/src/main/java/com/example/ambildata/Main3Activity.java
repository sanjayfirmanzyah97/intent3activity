package com.example.ambildata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView seteks2;
    public static  final  String EXTRA_MESSAGE="pindah";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        seteks2=findViewById(R.id.txt3);
        Intent a=getIntent();
        String pesan3 =a.getStringExtra(Main2Activity.EXTRA_MESSAGE);
        seteks2.setText(pesan3);

    }
}
