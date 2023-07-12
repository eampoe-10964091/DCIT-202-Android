package com.group8journal.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                NextPage();
            }
        }, 3000);
    }

    public void NextPage() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}