package com.example.chatapp.model.Standing;

import com.google.gson.annotations.SerializedName;

public class Param {
    @SerializedName("league")
    private int idLeague;
    private int season;

    public int getIdLeague() {
        return idLeague;
    }

    public void setIdLeague(int idLeague) {
        this.idLeague = idLeague;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }
}

//"parameters":{
//        "league": "39",
//        "season": "2022"
//        },
