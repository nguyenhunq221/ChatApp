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
import com.example.chatapp.model.topScore.ResponseDetail;
import java.util.List;

public class TopAssistAdapter extends RecyclerView.Adapter<TopAssistAdapter.TopScoreViewHolder>{

    Context context;
    List<ResponseDetail> mList;

    ItemClickListener listener;

    public TopAssistAdapter(Context context, List<ResponseDetail> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public TopScoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_player,parent,false);
        return new TopScoreViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopScoreViewHolder holder, int position) {

        ResponseDetail responseDetail = mList.get(position);
        holder.namePlayer.setText(responseDetail.getPlayer().getName());
        holder.clubName.setText(responseDetail.getStatistics().get(0).getTeam().getName());
        holder.assists.setText(responseDetail.getStatistics().get(0).getGoals().getTotal()+"");
        holder.goals.setText(responseDetail.getStatistics().get(0).getGoals().getAssists()+"");

        String urlImage = responseDetail.getPlayer().getPhoto();
        if (context != null) {
            Glide.with(context.getApplicationContext())
                    .load(urlImage) // image url
                    .centerCrop()
                    .into(holder.imagePlayer);
        }

        String urlImageClub = responseDetail.getStatistics().get(0).getTeam().getLogo();
        if (context != null) {
            Glide.with(context.getApplicationContext())
                    .load(urlImageClub) // image url
                    .centerCrop()
                    .into(holder.imageClub);
        }

    }

    @Override
    public int getItemCount() {
        Log.e("hung1", "getItemCountTopAssist: " + mList.size());
        return mList.size();
    }

    public class TopScoreViewHolder extends RecyclerView.ViewHolder{
         TextView namePlayer,clubName,goals,assists;
         ImageView imagePlayer,imageClub;
        public TopScoreViewHolder(@NonNull View itemView) {
            super(itemView);
            namePlayer = itemView.findViewById(R.id.player_name);
            clubName =itemView.findViewById(R.id.club_name);
            goals =itemView.findViewById(R.id.goals);
            assists =itemView.findViewById(R.id.assist);
            imagePlayer =itemView.findViewById(R.id.image_player);
            imageClub = itemView.findViewById(R.id.img_logo_club);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClickPlayer(mList.get(getAdapterPosition()));
                }
            });
        }

    }

    public void addTopAssist(List<ResponseDetail> responseDetailList){
        mList.addAll(responseDetailList);
        notifyDataSetChanged();

    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.listener = itemClickListener;
    }

    public interface ItemClickListener {
        void onClickPlayer(ResponseDetail responseDetail);
    }
}
