package com.ckopecky.rainbow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button red;
    Button orange;
    Button yellow;
    Button green;
    Button blue;
    Button purple;

    LinearLayout layoutBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      buttons
        red = findViewById(R.id.red);
        orange = findViewById(R.id.orange);
        yellow = findViewById(R.id.yellow);
        green = findViewById(R.id.green);
        blue = findViewById(R.id.blue);
        purple = findViewById(R.id.purple);

//      background
        layoutBackground = findViewById(R.id.layout_background);


        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
            }
        });
        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
            }
        });
    }
}
