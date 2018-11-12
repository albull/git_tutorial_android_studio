package com.example.andrewbull.datapassingactivitytutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener {

    private Button goToSecondActivityButton;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToSecondActivityButton = (Button) findViewById(R.id.goToSecondActivityButton);
        editText = (EditText) findViewById(R.id.mainActivityEditText);

        goToSecondActivityButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == goToSecondActivityButton) {
            //Change is the only constant
            // another change
            // A third change
            // a fourth change
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("text_value", editText.getText().toString());
            startActivity(intent);
        }
    }
}
