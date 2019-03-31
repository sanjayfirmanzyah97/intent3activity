package com.example.ambildata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView seteks;
    Button kirim;
    public static  final  String EXTRA_MESSAGE="pindah";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        seteks=findViewById(R.id.txt2);
        kirim=findViewById(R.id.kirim2);
        Intent a=getIntent();
        String pesan =a.getStringExtra(MainActivity.EXTRA_MESSAGE);
        seteks.setText(pesan);

    }

    public void pinda2(View view) {
        Intent i=new Intent(this,Main3Activity.class) ;
        String pesan2=seteks.getText().toString();
        i.putExtra(EXTRA_MESSAGE,pesan2);
        startActivity(i);
    }
}
