package com.example.devicedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtOrientation, txtResolution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         txtOrientation = findViewById(R.id.txtOrientation);
        txtResolution = findViewById(R.id.txtResolution);
    }


    public void detectDevice (View v){
        Display display = getWindowManager().getDefaultDisplay();
        txtOrientation.setText(""+display.getRotation());
        Point xy = new Point();
        display.getSize(xy);
        txtResolution.setText("x = "+xy.x+ " y = "+xy.y);
    }
}