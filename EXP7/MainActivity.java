package com.example.myapplication4mt19cs104pgm7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText text_to_speech;
    Button button;
    TextToSpeech ob1;
    String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        text_to_speech = (EditText) findViewById(R.id.ed1);
        button = (Button) findViewById(R.id.bt1);
        ob1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status!=TextToSpeech.ERROR)
                    ob1.setLanguage(Locale.UK);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = text_to_speech.getText().toString();
                ob1.speak(msg,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
    }
}