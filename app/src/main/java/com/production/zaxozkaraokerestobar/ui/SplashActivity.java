package com.production.zaxozkaraokerestobar.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.production.zaxozkaraokerestobar.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends Activity{

    private static final long SPLASH_SCREEN_DELAY = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // Set portrait orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // Hide title bar
        // requestWindowFeature(Window.FEATURE_NO_TITLE);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                // Start the next activity
                Intent splashIntent = new Intent().setClass(SplashActivity.this, ActividadPrincipal.class);
                startActivity(splashIntent);
                // Close the activity so the user won't able to go back this
                // activity pressing Back button
                //Intent intent = new Intent(MainActivity.this, MainActivity.class);
                //startActivity(intent);
                finish();
            }
        };
        // Simulate a long loading process on application startup.
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);
    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
