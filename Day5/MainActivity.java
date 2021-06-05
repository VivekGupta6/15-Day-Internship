package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName,etGender,etEmail,etContact,etPassword,etHobbies;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName=findViewById(R.id.name);
        etGender=findViewById(R.id.gender);
        etEmail=findViewById(R.id.email);
        etContact=findViewById(R.id.contact);
        etPassword=findViewById(R.id.password);
        etHobbies=findViewById(R.id.hobiies);
        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= etName.getText().toString();
                String gender= etGender.getText().toString();
                String email =etEmail.getText().toString();
                String contact= etContact.getText().toString();

                String hobbies = etHobbies.getText().toString();

                Intent intent=new Intent(getApplicationContext(),DataActivity.class);
                intent.putExtra("NAME",name);
                intent.putExtra("GENDER",gender);
                intent.putExtra("EMAIL",email);
                intent.putExtra("CONTACT",contact);
                intent.putExtra("HOBBIES",hobbies);
                startActivity(intent);

            }
        });
    }
}