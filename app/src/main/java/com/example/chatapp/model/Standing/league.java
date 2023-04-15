package com.example.chatapp.model.Standing;

import java.util.List;

public class league {
    private int id;
    private String name;
    private String country;
    private String logo;
    private String flag;
    private int season;
    private List<List<StandingDetail>> standings;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public List<List<StandingDetail>> getStandings() {
        return standings;
    }

    public void setStandings(List<List<StandingDetail>> standings) {
        this.standings = standings;
    }
}
//"league":{
//        "id": 39,
//        "name": "Premier League",
//        "country": "England",
//        "logo": "https://media-3.api-sports.io/football/leagues/39.png",
//        "flag": "https://media-1.api-sports.io/flags/gb.svg",
//        "season": 2022,
//        "standings":[
//        [{"rank": 1, "team":{"id": 42, "name": "Arsenal", "logo": "https://media-2.api-sports.io/football/teams/42.png"…]
//        ]
//        }
