package com.example.myapplication4mt19cs104program3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button b2;
    EditText e3,e4;
    String reg_uname;
    String reg_pass;
    String ent_uname;
    String ent_pass;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b2=(Button) findViewById(R.id.bt2);
        e3=(EditText)findViewById(R.id.ed3);
        e4=(EditText)findViewById(R.id.ed4);

        Bundle extras=getIntent().getExtras();
        reg_uname =extras.getString("un");
        reg_pass =extras.getString("pwd");

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ent_uname=e3.getText().toString();
                ent_pass=e4.getText().toString();

             if (reg_uname.equals(ent_uname)  &&  reg_pass.equals(ent_pass)){

                   System.out.println("Correct Username and password");
                 Toast.makeText(MainActivity2.this, "Valid Data", Toast.LENGTH_SHORT).show();
               }
               else{
                   System.out.println("wrong username or password");
                 Toast.makeText(MainActivity2.this, "Inavalid Data", Toast.LENGTH_SHORT).show();
               }
            }
        });
    }
}