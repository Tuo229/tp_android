package com.example.tp3_sigl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {
    ImageView call;
    ImageView sms;
    ImageView geo;
    ImageView web;
    ImageView video;
    ImageView audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        call = (ImageView) findViewById(R.id.callImage);
        sms = (ImageView) findViewById(R.id.smsImage);
        geo = (ImageView) findViewById(R.id.Mapsimage2);
        web = (ImageView) findViewById(R.id.webImage);
        video = (ImageView) findViewById(R.id.videoImage);
        audio = (ImageView) findViewById(R.id.audioImage);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, CallActivity.class);
                startActivity(intent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, SmsActivity.class);
                startActivity(intent);
            }
        });

        geo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, GeoActivity.class);
                startActivity(intent);
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, WebActivity.class);
                startActivity(intent);
            }
        });


        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, VideoActivity.class);
                startActivity(intent);
            }
        });

        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, AudioActivity.class);
                startActivity(intent);
            }
        });
    }
}