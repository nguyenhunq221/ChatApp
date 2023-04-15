package com.example.chatapp.model.Fixture;

import com.google.gson.annotations.SerializedName;

public class Halftime {
    @SerializedName("home")
    private int homeGoalHt;
    @SerializedName("away")
    private int awayGoalHt;

    public int getHomeGoalHt() {
        return homeGoalHt;
    }

    public void setHomeGoalHt(int homeGoalHt) {
        this.homeGoalHt = homeGoalHt;
    }

    public int getAwayGoalHt() {
        return awayGoalHt;
    }

    public void setAwayGoalHt(int awayGoalHt) {
        this.awayGoalHt = awayGoalHt;
    }
}
//"halftime":{
//        "home": 0,
//        "away": 1
//        },
