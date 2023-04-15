package com.example.chatapp.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.chatapp.R;
import com.example.chatapp.databinding.ActivityHelpBinding;

public class HelpActivity extends AppCompatActivity {

    private ActivityHelpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityHelpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setUpView();
    }

    private void setUpView() {
        binding.topAppBarMenu.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.star1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.star1.setBackgroundResource(R.drawable.ic_baseline_star2);
            }
        });
        binding.star2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.star2.setBackgroundResource(R.drawable.ic_baseline_star2);
            }
        });
        binding.star3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.star3.setBackgroundResource(R.drawable.ic_baseline_star2);
            }
        });
        binding.star4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.star4.setBackgroundResource(R.drawable.ic_baseline_star2);
            }
        });
        binding.star5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.star5.setBackgroundResource(R.drawable.ic_baseline_star2);
            }
        });


        binding.call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "0393634991", null));
                startActivity(intent);
            }
        });

        binding.email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HelpActivity.this, WebViewActivity.class);
                intent.putExtra("urlnew","https://accounts.google.com/AccountChooser/signinchooser?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser");
                startActivity(intent);
            }
        });
    }
}