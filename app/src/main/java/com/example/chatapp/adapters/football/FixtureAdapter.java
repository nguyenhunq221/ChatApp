package com.example.chatapp.adapters.football;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.chatapp.R;
import com.example.chatapp.model.Fixture.ResponseDetail;

import java.util.List;

public class FixtureAdapter extends RecyclerView.Adapter<FixtureAdapter.FixtureViewHolder> {

    private Context context;
    private List<ResponseDetail> mList;

    public FixtureAdapter(Context context, List<ResponseDetail> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public FixtureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tran_dau, parent, false);
        return new FixtureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FixtureViewHolder holder, int position) {
        ResponseDetail fixture = mList.get(position);
        holder.status.setText(fixture.getFixture().getStatus().getTrangThai());
        if (fixture.getFixture().getStatus().getTrangThai().equals("FT")){
            holder.awayGoal.setVisibility(View.VISIBLE);
            holder.homeGoal.setVisibility(View.VISIBLE);
        }else {
            holder.awayGoal.setVisibility(View.GONE);
            holder.homeGoal.setVisibility(View.GONE);
        }
        holder.date.setText(fixture.getFixture().getDate());
        String roundMatch = fixture.getLeague().getRound();
        String numberRound = roundMatch.replaceAll("[^0-9]", "");
        holder.round.setText("Vòng "+ numberRound);
        holder.nameHome.setText(fixture.getTeams().getHome().getName());
        holder.nameAway.setText(fixture.getTeams().getAway().getName());
        holder.homeGoal.setText(fixture.getGoals().getHomeGoal()+"");
        holder.awayGoal.setText(fixture.getGoals().getAwayGoal()+"");

        String logoHome = fixture.getTeams().getHome().getLogo();
        if (context != null) {
            Glide.with(context)
                    .load(logoHome) // image url
                    .centerCrop()
                    .into(holder.logoHome);
        }
        String logoAway = fixture.getTeams().getAway().getLogo();
        if (context != null) {
            Glide.with(context)
                    .load(logoAway) // image url
                    .centerCrop()
                    .into(holder.logoAway);
        }
    }

    @Override
    public int getItemCount() {
        Log.e("hung", "getItemCount: "+mList.size() );
        return mList.size();
    }

    public class FixtureViewHolder extends RecyclerView.ViewHolder {
        TextView status, nameHome, nameAway, date, round, homeGoal, awayGoal;
        ImageView logoHome, logoAway;

        public FixtureViewHolder(@NonNull View itemView) {
            super(itemView);
            status = itemView.findViewById(R.id.status_match);
            nameHome = itemView.findViewById(R.id.home_name);
            nameAway = itemView.findViewById(R.id.away_name);
            date = itemView.findViewById(R.id.date);
            round = itemView.findViewById(R.id.round);
            homeGoal =itemView.findViewById(R.id.home_goal);
            awayGoal =itemView.findViewById(R.id.away_goal);
            logoHome =itemView.findViewById(R.id.logo_home);
            logoAway = itemView.findViewById(R.id.logo_away);

        }
    }

    public void addFixture(List<ResponseDetail> fixtureList) {
        mList.addAll(fixtureList);
        notifyDataSetChanged();
    }
}
