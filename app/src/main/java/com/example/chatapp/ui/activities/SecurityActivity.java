package com.example.chatapp.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.chatapp.R;
import com.example.chatapp.databinding.ActivitySecurityBinding;

public class SecurityActivity extends AppCompatActivity {

    private ActivitySecurityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivitySecurityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.topAppBarMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}