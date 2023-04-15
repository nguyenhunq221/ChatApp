package com.example.chatapp.model.Standing;

import com.google.gson.annotations.SerializedName;

public class goals {

    @SerializedName("for")
    private int goalWin;
    @SerializedName("against")
    private int goalLost;

    public int getGoalWin() {
        return goalWin;
    }

    public void setGoalWin(int goalWin) {
        this.goalWin = goalWin;
    }

    public int getGoalLost() {
        return goalLost;
    }

    public void setGoalLost(int goalLost) {
        this.goalLost = goalLost;
    }
}
