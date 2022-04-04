package com.example.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Object Number;
    private Button Inc;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Number = (TextView) findViewById(R.id.value_to_increment);
        Inc = (Button) findViewById(R.id.incButton);

        Inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count += 5;
                Number.setText(String.valueOf(count));
            }
        });

    }
}