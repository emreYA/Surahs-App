package com.emreakkasdesign.surahsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager2 viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager2) findViewById(R.id.viewpager);

        CategoryAdapter adapter = new CategoryAdapter(this);

        viewPager.setAdapter(adapter);

    }
}