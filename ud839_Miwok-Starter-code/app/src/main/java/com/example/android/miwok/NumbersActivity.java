package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<String> words = new ArrayList<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        ArrayList<TextView> myArrayList = new ArrayList<>();

        for(int i = 0; i < words.size(); i++)
        {

            TextView textView = new TextView(this);
            textView.setText(words.get(i));
            myArrayList.add(textView);
            rootView.addView(myArrayList.get(i));
        }

    }
}
