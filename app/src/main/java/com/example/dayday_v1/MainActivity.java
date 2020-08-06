package com.example.dayday_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Chronometer chronometer,chronometer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = findViewById(R.id.textView3);

        chronometer = findViewById(R.id.chronometer);
        chronometer2 = findViewById(R.id.chronometer2);

        Button btn_start = findViewById(R.id.btn_start);
        Button btn_stop = findViewById(R.id.btn_stop);
        Button btn_reset = findViewById(R.id.btn_reset);


        Button btn_start2 = findViewById(R.id.btn_start2);
        Button btn_stop2 = findViewById(R.id.btn_stop2);
        Button btn_reset2 = findViewById(R.id.btn_reset2);

        btn_start.setOnClickListener(this);
        btn_stop.setOnClickListener(this);
        btn_reset.setOnClickListener(this);
        btn_start2.setOnClickListener(this);
        btn_stop2.setOnClickListener(this);
        btn_reset2.setOnClickListener(this);


        tv1.setText("sad");
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_start:
                chronometer.setBase(SystemClock.elapsedRealtime());
                long time = SystemClock.elapsedRealtime()-chronometer.getBase();
                Log.d(null,"Was: "+time);
                Log.d(null,"Was2: "+time);


                chronometer.start();
                break;
            case R.id.btn_stop:
                chronometer.stop();
                break;
            case R.id.btn_reset:
                chronometer.resetPivot();
                break;

            case R.id.btn_start2:
                chronometer2.setBase(SystemClock.elapsedRealtime());
                chronometer2.start();
                break;
            case R.id.btn_stop2:
                chronometer2.stop();
                break;
            case R.id.btn_reset2:
                chronometer2.resetPivot();
                break;
        }


    }
}