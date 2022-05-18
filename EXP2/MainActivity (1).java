package com.example.myapplication4mt19cs104program2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b0;
    float v1,v2;
    boolean add=false,sub=false,mul=false,div=false;
    EditText e1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 =(EditText)findViewById(R.id.ed1);
        b1 =(Button) findViewById(R.id.bt1);
        b2 =(Button)findViewById(R.id.bt2);
        b3 =(Button)findViewById(R.id.bt3);
        b4 =(Button)findViewById(R.id.bt4);
        b5 =(Button)findViewById(R.id.bt5);
        b6 =(Button)findViewById(R.id.bt6);
        b7 =(Button)findViewById(R.id.bt7);
        b8 =(Button)findViewById(R.id.bt8);
        b9 =(Button)findViewById(R.id.bt9);
        b10 =(Button)findViewById(R.id.bt10);
        b11=(Button)findViewById(R.id.bt11);
        b12=(Button)findViewById(R.id.bt12);
        b13=(Button)findViewById(R.id.bt13);
        b14=(Button)findViewById(R.id.bt14);
        b15=(Button)findViewById(R.id.bt15);
        b0=(Button)findViewById(R.id.bt0);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("0");
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1= Float.parseFloat(String.valueOf(e1.getText()));
                sub=true;
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1= Float.parseFloat(String.valueOf(e1.getText()));
                add=true;
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1= Float.parseFloat(String.valueOf(e1.getText()));
                div=true;


            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1= Float.parseFloat(String.valueOf(e1.getText()));
                mul=true;
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v2= Float.parseFloat(String.valueOf(e1.getText()));
                if(add==true){
                    e1.setText(String.valueOf (v1+v2));
                    add=false;
                }
                if(sub==true){
                    e1.setText(String.valueOf(v1-v2));
                    sub=false;
                }
                if(mul==true){
                    e1.setText(String.valueOf(v1*v2));
                    mul=false;
                }
                if(div==true){
                    e1.setText(String.valueOf(v1/v2));
                    div=false;
                }
            }
        });
    }
}