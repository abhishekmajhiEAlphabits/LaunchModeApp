package com.example.launchmodeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activityB(View view) {
        Intent i = new Intent(this, Activity_B.class);
        startActivity(i);
    }

    public void activityC(View view) {
        Intent i = new Intent(this, Activity_C.class);
        startActivity(i);
    }

    public void activityD(View view) {
        Intent i = new Intent(this, Activity_D.class);
        startActivity(i);
    }
}