package com.example.filmoteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    private static final long SPLASH_SCREEN_DELAY = 3000;
    Animation topanima, bottonanim;
    ImageView img1, img2;
    static MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        topanima= AnimationUtils.loadAnimation(this,R.anim.top_animacion);
        bottonanim= AnimationUtils.loadAnimation(this,R.anim.boton_animacion);
        img1=findViewById(R.id.imageView1);
        img2=findViewById(R.id.imageView2);

        img1.setAnimation(topanima);
        img2.setAnimation(bottonanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (SPLASH_SCREEN_DELAY==3000 ){
                    mp=MediaPlayer.create(SplashActivity.this,R.raw.click);
                    mp.start();
                }
                Intent intent = new Intent().setClass(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_DELAY);

    }
}