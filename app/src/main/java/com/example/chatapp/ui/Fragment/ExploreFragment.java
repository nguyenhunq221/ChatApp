package com.example.chatapp.ui.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chatapp.PremierLeague.PremierLeagueActivity;
import com.example.chatapp.R;
import com.example.chatapp.databinding.FragmentExploreBinding;
import com.example.chatapp.ui.activities.WebViewActivity;

public class ExploreFragment extends Fragment {
    private FragmentExploreBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentExploreBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUpView();
    }

    private void setUpView() {
        binding.cardNews1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), WebViewActivity.class);
                intent.putExtra("urlnew","https://didongviet.vn/dchannel/iphone-15-co-gi-moi/");
                startActivity(intent);
            }
        });
        binding.cardNews2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), WebViewActivity.class);
                intent.putExtra("urlnew","https://vnexpress.net/nhung-diem-moi-tren-smartphone-2023-4562393.html");
                startActivity(intent);
            }
        });

        binding.cardNews3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), WebViewActivity.class);
                intent.putExtra("urlnew","https://vnexpress.net/messenger-lai-duoc-gop-vao-facebook-4578786.html");
                startActivity(intent);
            }
        });
        binding.cardNews4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), WebViewActivity.class);
                intent.putExtra("urlnew","https://vtv.vn/xa-hoi/tre-em-nghien-mang-xa-hoi-nhung-he-luy-khon-luong-20220916110208987.htm");
                startActivity(intent);
            }
        });
        binding.cardNews5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), WebViewActivity.class);
                intent.putExtra("urlnew","https://vietnamnet.vn/thoi-tiet-ha-noi-15-4-mua-to-dem-chuyen-lanh-2132803.html");
                startActivity(intent);
            }
        });

        binding.cardViewLeague.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), PremierLeagueActivity.class));
            }
        });
    }
}