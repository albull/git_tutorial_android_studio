package com.example.andrewbull.datapassingactivitytutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String textValue;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textValue = getIntent().getStringExtra("text_value");
        textView = (TextView) findViewById(R.id.textView);
        textView.setText(textValue);
    }
}
