package com.example.myapplication4mt19cs104pgm8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button callbtn,savebtn,delbutton;
    EditText phoneed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callbtn = (Button) findViewById(R.id.call);
        savebtn = (Button) findViewById(R.id.save);
        phoneed = (EditText) findViewById(R.id.ed1);
        delbutton = (Button) findViewById(R.id.del);
        delbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phoneed.setText("");
            }
        });
        callbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call_intent = new Intent(Intent.ACTION_DIAL);
                call_intent.setData(Uri.parse("tel:"+phoneed.getText().toString()));
                startActivity(call_intent);
            }
        });
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_INSERT);
                intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
                intent.putExtra(ContactsContract.Intents.Insert.PHONE,phoneed.getText().toString());
                startActivity(intent);
            }
        });
    }
    public void entered_number(View V){
        Button btn = (Button) V;
        String digit = btn.getText().toString();
        String phoneNumber = phoneed.getText().toString();
        phoneed.setText(phoneNumber +digit);
    }
}