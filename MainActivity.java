package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button lv,gv,wv,hs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv=findViewById(R.id.lv);
        gv=findViewById(R.id.gv);
        wv=findViewById(R.id.wv);
        hs=findViewById(R.id.hs);

        lv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),listView.class);
                startActivity(intent);
            }
        });

        gv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(getApplicationContext(),GridView.class);
                startActivity(intent2);
            }
        });
        wv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(getApplicationContext(),WebView.class);
                startActivity(intent3);
            }
        });

        hs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(getApplicationContext(),HorizontalScroll.class);
                startActivity(intent4);
            }
        });


    }
}