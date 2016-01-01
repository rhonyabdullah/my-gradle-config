package com.labsgn.my_gradle_config;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Sample
        if (savedInstanceState.describeContents()< 1) {
            new IllegalArgumentException("Missing required argument");
        }

    }
}
