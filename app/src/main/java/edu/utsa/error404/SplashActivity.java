package edu.utsa.error404;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.ComponentActivity;

public class SplashActivity extends ComponentActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Change this to whatever the old main activity was
                startActivity(new Intent(SplashActivity.this, loginActivity.class));
            }
        }, 2000);
    }

}