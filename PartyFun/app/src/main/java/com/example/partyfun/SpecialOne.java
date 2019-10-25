package com.example.partyfun;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SpecialOne extends AppCompatActivity {
    public int counter;
    public int click = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special_one);
        Button button = findViewById(R.id.button3);
        button.setEnabled(false);
    }

    public void onContinue(View v){
        Intent opt = new Intent(this,FourthActivity.class);
        startActivity(opt);
    }

    public void onStart(View v){
        Button button = findViewById(R.id.button3);
        button.setEnabled(true);
        counter = 0;
        int i = 1;
        final TextView counttime=findViewById(R.id.counttime);
        new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                counttime.setText(String.valueOf(counter));
                if (counter<10){
                    counter++;}
            }
            @Override
            public void onFinish() {
                Button button = findViewById(R.id.button3);
                button.setEnabled(false);
                counttime.setText("Finished");
            }
        }.start();
    }

    public void onClickClick(View v){
        click++;
        TextView display = findViewById(R.id.display);
        Log.d("Alert",String.valueOf(click));
        display.setText(Integer.toString(click));

    }
}