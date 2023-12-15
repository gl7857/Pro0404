package com.example.pro0404;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;

    int clicksNumber=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
    }

    // method that start when button clicked
    public void clicked(View view) {
        clicksNumber++;
        btn.setText("This is a click number:"+clicksNumber);
        if (clicksNumber%7==0){
            btn.setText("BOOM!");
        }
    }
}