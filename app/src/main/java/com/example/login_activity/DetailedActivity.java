package com.example.login_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.login_activity.databinding.ActivityDetailedBinding;

public class DetailedActivity extends AppCompatActivity {

    ActivityDetailedBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        if (intent != null){
            String Fort = intent.getStringExtra("Fort Name");
            String Height = intent.getStringExtra("Height");
            int Details = intent.getIntExtra("Details", R.string.rajgad);
            int Things = intent.getIntExtra("ThingsTODo", R.string.f1);
            int image = intent.getIntExtra("image", R.drawable.rajgad);

            binding.detailName.setText(Fort);
            binding.detailTime.setText(Height);
            binding.detailDesc.setText(getString(Things));
            binding.detailIngredients.setText(getString(Details));
            binding.detailImage.setImageResource(image);
        }
    }
}
