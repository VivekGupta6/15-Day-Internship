package com.example.sharderprefernces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView name,email,contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        name =findViewById(R.id.name);
        email=findViewById(R.id.email);
        contact=findViewById(R.id.contact);

        Intent i = getIntent();
        final String nameT = i.getStringExtra("NAME");
        final String emailT= i.getStringExtra("EMAIL");
        final String contactT= i.getStringExtra("CONTACT");

        name.setText(nameT);
        email.setText(emailT);
        contact.setText(contactT);

    }
}