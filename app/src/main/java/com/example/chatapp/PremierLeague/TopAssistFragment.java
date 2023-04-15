package com.example.chatapp.PremierLeague;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.chatapp.adapters.football.TopAssistAdapter;
import com.example.chatapp.databinding.FragmentTopAssistBinding;
import com.example.chatapp.model.Standing.StandingDetail;
import com.example.chatapp.model.topScore.ResponseDetail;

import java.util.ArrayList;
import java.util.List;

public class TopAssistFragment extends Fragment implements PremierLeagueLogic.PremierLeagueEvent {

    private FragmentTopAssistBinding binding;

    PremierLeagueLogic logic = new PremierLeagueLogic(getActivity(), this);

    TopAssistAdapter adapter;


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTopAssistBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        adapter = new TopAssistAdapter(this.getActivity(),new ArrayList<>());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        binding.rcvTopAssist.setLayoutManager(linearLayoutManager);
        binding.rcvTopAssist.setAdapter(adapter);

        logic.showTopAssist(39);

        adapter.setClickListener(new TopAssistAdapter.ItemClickListener() {
            @Override
            public void onClickPlayer(ResponseDetail responseDetail) {
                Intent intent = new Intent(getActivity(),DetailPlayerActivity.class);
                intent.putExtra("birth",responseDetail.getPlayer().getBirth().getDate());
                intent.putExtra("name",responseDetail.getPlayer().getName());
                intent.putExtra("photo",responseDetail.getPlayer().getPhoto());
                intent.putExtra("injury",responseDetail.getPlayer().getInjured());
                intent.putExtra("nationality",responseDetail.getPlayer().getNationality());
                intent.putExtra("vitri",responseDetail.getStatistics().get(0).getGames().getPosition());
                intent.putExtra("logo",responseDetail.getStatistics().get(0).getTeam().getLogo());
                intent.putExtra("rate",responseDetail.getStatistics().get(0).getGames().getRating());
                intent.putExtra("number",responseDetail.getStatistics().get(0).getGames().getNumber());
                intent.putExtra("captain",responseDetail.getStatistics().get(0).getGames().getCaptain());

                startActivity(intent);
            }
        });

    }


    @Override
    public void onShowStandingSuccess(List<StandingDetail> standingDetailList) {
    }

    @Override
    public void onShowStandingFail(String error) {

    }

    @Override
    public void onShowTopScoreSuccess(List<ResponseDetail> topScoreList) {
        adapter.addTopAssist(topScoreList);
    }

    @Override
    public void onShowTopScoreFail(String errors) {

    }

    @Override
    public void onShowFixtureSuccess(List<com.example.chatapp.model.Fixture.ResponseDetail> listFixture) {

    }

    @Override
    public void onShowFixtureFail(String errors) {

    }
}