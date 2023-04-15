package com.example.chatapp.PremierLeague;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.chatapp.adapters.football.ViewPagerPremierLeagueAdapter;
import com.example.chatapp.databinding.ActivityPremierLeagueBinding;


public class PremierLeagueActivity extends AppCompatActivity {

    private ActivityPremierLeagueBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPremierLeagueBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setUpView();
    }

    private void setUpView() {
        binding.topAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ViewPagerPremierLeagueAdapter viewPagerPremierLeagueAdapter = new ViewPagerPremierLeagueAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        binding.viewPager.setAdapter(viewPagerPremierLeagueAdapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);
        binding.viewPager.setOffscreenPageLimit(2);
    }

}