package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.RequiresApi;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTaskDescription(new ActivityManager.TaskDescription("哈哈哈", R.drawable.icon));
    }
}