package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Call extends AppCompatActivity {

    EditText etCall;
    Button btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        etCall=findViewById(R.id.etCall);
        btnCall=findViewById(R.id.btnCall);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number=etCall.getText().toString();

                Intent intent= new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+ number));

                if(ActivityCompat.checkSelfPermission(Call.this, Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED){
                return;
                }

                startActivity(intent);
            }
        });
    }
}