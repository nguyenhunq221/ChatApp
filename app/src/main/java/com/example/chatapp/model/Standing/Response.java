package com.example.chatapp.model.Standing;

import com.google.gson.annotations.SerializedName;

public class Response {
    @SerializedName("league")
    private league league;

    public com.example.chatapp.model.Standing.league getLeague() {
        return league;
    }

    public void setLeague(com.example.chatapp.model.Standing.league league) {
        this.league = league;
    }
}
