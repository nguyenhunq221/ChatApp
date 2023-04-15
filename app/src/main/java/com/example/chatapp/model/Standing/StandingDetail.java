package com.example.chatapp.model.Standing;

import com.google.gson.annotations.SerializedName;

public class StandingDetail {
    private int rank;
    private Team team;
    private int points;
    @SerializedName("goalsDiff")
    private int hieuSo;
    private String group;
    private String form;
    private All all;
    private String update;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getHieuSo() {
        return hieuSo;
    }

    public void setHieuSo(int hieuSo) {
        this.hieuSo = hieuSo;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public All getAll() {
        return all;
    }

    public void setAll(All all) {
        this.all = all;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }
}

//{
//        "rank": 1,
//        "team":{"id": 42, "name": "Arsenal", "logo": "https://media-2.api-sports.io/football/teams/42.png"…},
//        "points": 66,
//        "goalsDiff": 37,
//        "group": "Premier League",
//        "form": "WWWWW",
//        "status": "same",
//        "description": "Promotion - Champions League (Group Stage)",
//        "all":{"played": 27, "win": 21, "draw": 3, "lose": 3, "goals":{"for": 62,…},
//        "home":{"played": 13, "win": 10, "draw": 2, "lose": 1, "goals":{"for": 34,…},
//        "away":{"played": 14, "win": 11, "draw": 1, "lose": 2, "goals":{"for": 28,…},
//        "update": "2023-03-18T00:00:00+00:00"
//        },

