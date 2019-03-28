package com.example.week7day3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState) ;
        setContentView(R.layout.activity_main) ;
    }
}



/*
Homework:
1. Create a custom layout by extending the layout class (should have at least 4 children)

- Add more functionality to the custom views

- Add setters and getters to the views to set/get values in the Activities
- Animate at least one view

2.  Start an activity using the fade in/ out transition

3. Use LeakCanary to memory leaks

4. Use Fabric and flury for analytics
 */