package com.h5190019.ibrahim_metehan_barutcu.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.h5190019.ibrahim_metehan_barutcu.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startSplashScreen();

    }

    private void startSplashScreen() {
        CountDownTimer countDownTimer = new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                Intent splashScreenIntent = new Intent(getApplicationContext(), PlayerLoginActivity.class);
                startActivity(splashScreenIntent);
                finish();
            }
        };
        countDownTimer.start();
    }
}