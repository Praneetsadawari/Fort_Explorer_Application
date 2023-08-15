package com.example.login_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.login_activity.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ListAdapter listAdapter;
    ArrayList<ListData> dataArrayList = new ArrayList<>();
    ListData listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] FortList = {R.drawable.rajgad, R.drawable.sinhgad, R.drawable.torna, R.drawable.rajmachi, R.drawable.tikona, R.drawable.lohaga_fort, R.drawable.korigad};
        int[] DetailsList = {R.string.rajgad, R.string.sinhgad,R.string.torna,R.string.rajmachi,R.string.tikona, R.string.lohaga_fort, R.string.korigad};
        int[] ThingsList = {R.string.f1, R.string.f2, R.string.f3,R.string.f4,R.string.f5, R.string.f6, R.string.f7};
        String[] nameList = {"Rajgad ", "Sinhgad ", "Torna ", "Rajmachi ", "Tikona ","Lohagad ", "Korigad "};
        String[] HeightList = {"4514 ft", "4304 ft", "4603 ft","3600 ft", "3580 ft", "3389 ft", "3028 ft"};

        for (int i = 0; i < FortList.length; i++){
            listData = new ListData(nameList[i], HeightList[i], DetailsList[i], ThingsList[i], FortList[i]);
            dataArrayList.add(listData);
        }
        listAdapter = new ListAdapter(MainActivity.this, dataArrayList);
        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);

        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailedActivity.class);
                intent.putExtra("Fort Name", nameList[i]);
                intent.putExtra("Height", HeightList[i]);
                intent.putExtra("Details", DetailsList[i]);
                intent.putExtra("ThingsTODo", ThingsList[i]);
                intent.putExtra("image", FortList[i]);
                startActivity(intent);
            }
        });
    }
}
