package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    private ImageView iv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        iv = (ImageView) findViewById(R.id.iv) ;
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.transition) ;
        iv.startAnimation(myanim);
        final Intent i = new Intent(this, MainActivity.class);
        Thread timer =new Thread(){
            public void run(){
                try {
                    sleep(4000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }
}
