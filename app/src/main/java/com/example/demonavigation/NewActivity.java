package com.example.demonavigation;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {
    ActionBar ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
    }
}
