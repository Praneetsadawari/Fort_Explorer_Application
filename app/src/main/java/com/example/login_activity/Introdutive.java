package com.example.login_activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import android.os.Bundle;
import android.widget.ImageView;


import com.airbnb.lottie.LottieAnimationView;

public class Introdutive extends AppCompatActivity {

    ImageView img,logo,app_name,animation;
    LottieAnimationView lottieAnimationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introdutive);

        img = findViewById(R.id.img);
        logo = findViewById(R.id.logo);
        app_name = findViewById(R.id.app_name);
        animation = findViewById(R.id.animation);

       img.animate().translationY(-2700).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(2600).setDuration(1000).setStartDelay(4000);
        app_name.animate().translationY(2600).setDuration(1000).setStartDelay(4000);
        animation.animate().translationY(2600).setDuration(1000).setStartDelay(4000);

    }



}