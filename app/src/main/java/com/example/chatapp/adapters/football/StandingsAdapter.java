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
import com.example.chatapp.model.Standing.StandingDetail;

import java.util.List;

public class StandingsAdapter extends RecyclerView.Adapter<StandingsAdapter.StandingsViewHolder> {
    Context context;
    private List<StandingDetail> mList;

    public StandingsAdapter(Context context, List<StandingDetail> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public StandingsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_standing, parent, false);
        return new StandingsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StandingsViewHolder holder, int position) {
        StandingDetail standingDetail = mList.get(position);
        holder.tenDoi.setText(standingDetail.getTeam().getName());
        holder.soTran.setText(standingDetail.getAll().getPlayed() + "");
        holder.win.setText(standingDetail.getAll().getWin() + "");
        holder.draw.setText(standingDetail.getAll().getDraw() + "");
        holder.lose.setText(standingDetail.getAll().getLose() + "");
        holder.diff.setText(standingDetail.getHieuSo() + "");
        holder.PTS.setText(standingDetail.getPoints() + "");
        holder.rank.setText(standingDetail.getRank() + "");

        String urlImage = standingDetail.getTeam().getLogo();
        if (context != null) {
            Glide.with(context)
                    .load(urlImage) // image url
                    .centerCrop()
                    .into(holder.logoTeam);
        }
    }

    @Override
    public int getItemCount() {
        Log.e("hung", "getItemCount: " + mList.size());
        return mList.size();
    }

    public class StandingsViewHolder extends RecyclerView.ViewHolder {
        TextView rank, tenDoi, soTran, win, draw, lose, diff, PTS;
        ImageView logoTeam;

        public StandingsViewHolder(@NonNull View itemView) {
            super(itemView);
            rank = itemView.findViewById(R.id.rank);
            tenDoi = itemView.findViewById(R.id.teamName);
            soTran = itemView.findViewById(R.id.played);
            win = itemView.findViewById(R.id.win);
            draw = itemView.findViewById(R.id.draw);
            lose = itemView.findViewById(R.id.lose);
            diff = itemView.findViewById(R.id.diff);
            PTS = itemView.findViewById(R.id.pts);
            logoTeam = itemView.findViewById(R.id.logoTeam);
        }
    }

    public void addStandings(List<StandingDetail> standingDetailList) {
        mList.addAll(standingDetailList);
        notifyDataSetChanged();
    }
}
