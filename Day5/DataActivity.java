package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    TextView tvName,tvGender,tvEmail,tvContact,tvHobbies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        tvName=findViewById(R.id.tvName);
        tvGender=findViewById(R.id.gender);
        tvEmail=findViewById(R.id.email);
        tvContact=findViewById(R.id.contact);
        tvHobbies=findViewById(R.id.hobiies);

        Intent intent=getIntent();
        String name= intent.getStringExtra("NAME");
        String gender= intent.getStringExtra("GENDER");
        String email= intent.getStringExtra("EMAIL");
        String contact= intent.getStringExtra("CONTACT");
        String hobbies= intent.getStringExtra("HOBBIES");

        tvName.setText(name);
        tvGender.setText(gender);
        tvEmail.setText(email);
        tvContact.setText(contact);
        tvHobbies.setText(hobbies);

    }
}