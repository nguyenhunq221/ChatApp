package com.example.chatapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;

import com.example.chatapp.databinding.ActivitySplashBinding;
import com.example.chatapp.ui.Fragment.NavigationActivity;

public class SplashActivity extends AppCompatActivity {

    Animation amimSplash;
    private ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        amimSplash = AnimationUtils.loadAnimation(this,
//                R.anim.slide);
//        binding.logoSplash.startAnimation(amimSplash);

        SharedPreferences sharedPref = this.getSharedPreferences("MyPreferences", this.MODE_PRIVATE);
        boolean hasLogIn = sharedPref.getBoolean("hasLogIn", false);
        Handler handler = new Handler();
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                if (hasLogIn) {
                    Intent mainIntent = new Intent(SplashActivity.this, NavigationActivity.class);
                    SplashActivity.this.startActivity(mainIntent);
                    SplashActivity.this.finish();
                }else {
                    Intent intent = new Intent(SplashActivity.this, SignInactivity.class);
                    SplashActivity.this.startActivity(intent);
                    SplashActivity.this.finish();
                }

            }
        }, 3500);
    }
}