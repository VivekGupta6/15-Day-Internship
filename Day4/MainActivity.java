package com.example.day4task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    Button sumBtn,subBtn,mulBtn,divBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        sumBtn=findViewById(R.id.sumBtn);
        subBtn=findViewById(R.id.subBtn);
        mulBtn=findViewById(R.id.mulBtn);
        divBtn=findViewById(R.id.divBtn);

        sumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1,n2;
                n1= num1.getText().toString();
                n2=num2.getText().toString();

                int a= Integer.parseInt(n1);
                int b=Integer.parseInt(n2);

                int c= a+b;
                Toast.makeText(MainActivity.this, "Sum is "+c, Toast.LENGTH_SHORT).show();
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1,n2;
                n1= num1.getText().toString();
                n2=num2.getText().toString();

                int a= Integer.parseInt(n1);
                int b=Integer.parseInt(n2);

                int c= a-b;
                Toast.makeText(MainActivity.this, "Subtraction is "+c, Toast.LENGTH_SHORT).show();
            }
        });

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1,n2;
                n1= num1.getText().toString();
                n2=num2.getText().toString();

                int a= Integer.parseInt(n1);
                int b=Integer.parseInt(n2);

                int c= a*b;
                Toast.makeText(MainActivity.this, "Multiplication is "+c, Toast.LENGTH_SHORT).show();
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1,n2;
                n1= num1.getText().toString();
                n2=num2.getText().toString();

                int a= Integer.parseInt(n1);
                int b=Integer.parseInt(n2);

                int c= a/b;
                Toast.makeText(MainActivity.this, "Division is "+c, Toast.LENGTH_SHORT).show();
            }
        });
    }
}