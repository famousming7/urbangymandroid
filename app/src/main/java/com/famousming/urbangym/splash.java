package com.famousming.urbangym;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        delaySplash();


    }

    void delaySplash(){

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                openMain();
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }

    void openMain(){
        Intent mainIntent = new Intent(splash.this, MainActivity.class);
        startActivity(mainIntent);
    }

}
