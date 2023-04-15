package com.example.chatapp.model.Fixture;

import com.google.gson.annotations.SerializedName;

public class Fulltime {
    @SerializedName("home")
    private int homeGoalFt;
    @SerializedName("away")
    private int awayGoalFt;

    public int getHomeGoalFt() {
        return homeGoalFt;
    }

    public void setHomeGoalFt(int homeGoalFt) {
        this.homeGoalFt = homeGoalFt;
    }

    public int getAwayGoalFt() {
        return awayGoalFt;
    }

    public void setAwayGoalFt(int awayGoalFt) {
        this.awayGoalFt = awayGoalFt;
    }
}

//"fulltime":{
//        "home": 0,
//        "away": 2
//        }
