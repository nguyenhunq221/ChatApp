package com.example.chatapp.model.Fixture;

import com.google.gson.annotations.SerializedName;

public class Goal {
    @SerializedName("home")
    private int homeGoal;
    @SerializedName("away")
    private int awayGoal;

    public int getHomeGoal() {
        return homeGoal;
    }

    public void setHomeGoal(int homeGoal) {
        this.homeGoal = homeGoal;
    }

    public int getAwayGoal() {
        return awayGoal;
    }

    public void setAwayGoal(int awayGoal) {
        this.awayGoal = awayGoal;
    }
}
//goals":{
//        "home": 0,
//        "away": 2
//        }
