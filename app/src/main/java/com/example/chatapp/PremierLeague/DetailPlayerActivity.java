package com.example.chatapp.PremierLeague;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.chatapp.databinding.ActivityDetailPlayerBinding;

public class DetailPlayerActivity extends AppCompatActivity {
    private ActivityDetailPlayerBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailPlayerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setUpView();
    }

    private void setUpView() {

        Intent intent = getIntent();
        String birth  =intent.getStringExtra("birth");
        String name = intent.getStringExtra("name");
        String photo = intent.getStringExtra("photo");
        String nationality = intent.getStringExtra("nationality");
        String vitri = intent.getStringExtra("vitri");
        String logo = intent.getStringExtra("logo");
        Double rate = intent.getDoubleExtra("rate",0);
        String number = intent.getStringExtra("number");
        Boolean captain = intent.getBooleanExtra("captain",false);
        Boolean injury = intent.getBooleanExtra("injury",false);

        binding.birth.setText(birth);
        binding.namePlayer.setText(name);

        if (vitri.equals("Attacker")){
            binding.viTri.setText("Tiền đạo");
        }else if(vitri.equals("Midfielder")){
            binding.viTri.setText("Tiền vệ");
        }
        if (number != null) {
            binding.number.setText(number);
        }else {
            binding.number.setText("null");
        }

        binding.nation.setText(nationality);
        if (captain == true){
            binding.captain.setVisibility(View.VISIBLE);
        }

        if (rate > 7.0){
            binding.star.setVisibility(View.VISIBLE);
            binding.rating.setText(rate+"");
        }else if (rate == null){
            binding.rating.setText("null");
        }
        if (injury == true){
            binding.injury.setText("Có");
        }else {
            binding.injury.setText("Không");
        }
        Glide.with(this)
                .load(logo) // image url
                .centerCrop()
                .into(binding.imageLogo);

        Glide.with(this)
                .load(photo) // image url
                .centerCrop()
                .into(binding.imageDetailPlayer);
    }
}