package com.example.login_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LauncherActivity extends AppCompatActivity {

    private static final int DELAY_TIME = 3000; // Delay time in milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Launch Introdutive activity
        Intent introdutiveIntent = new Intent(LauncherActivity.this, Introdutive.class);
        startActivity(introdutiveIntent);

        // Delay the start of the login activity by 3 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent loginIntent = new Intent(LauncherActivity.this, login.class);
                startActivity(loginIntent);
                finish();
            }
        }, DELAY_TIME);
    }
}
