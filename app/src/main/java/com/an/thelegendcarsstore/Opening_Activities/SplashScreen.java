package com.an.thelegendcarsstore.Opening_Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.ProgressBar;

import com.an.thelegendcarsstore.R;

public class SplashScreen extends AppCompatActivity {
    private ProgressBar mProgressBar;
    private int mProgressStatus = 0;
    private Handler mHandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        mProgressBar = findViewById(R.id.splash_progress_bar);
    }

    @Override
    protected void onStart() {
        super.onStart();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mProgressStatus < 100){
                    mProgressStatus++;
                    android.os.SystemClock.sleep(50);
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            mProgressBar.setProgress(mProgressStatus);
                        }
                    });
                }
            }
        }).start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SplashScreen.this.startActivity(new Intent(SplashScreen.this, Opener.class));
                SplashScreen.this.finish();
            }
        },4000);
    }
}
