package com.example.ambildata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText txt;
    public static  final  String EXTRA_MESSAGE="pindah";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.kirim);
        txt=findViewById(R.id.txt1);
    }

    public void pindah(View view) {
        Intent i=new Intent(this,Main2Activity.class) ;
        String pesan=txt.getText().toString();
        i.putExtra(EXTRA_MESSAGE,pesan);
        startActivity(i);
    }
}
