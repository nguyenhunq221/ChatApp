package com.example.chatapp.model.Fixture;

public class Away {
    private int id;
    private String name;
    private String logo;
    private Boolean winner;

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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Boolean getWinner() {
        return winner;
    }

    public void setWinner(Boolean winner) {
        this.winner = winner;
    }
}
//"away":{
//        "id": 42,
//        "name": "Arsenal",
//        "logo": "https://media-1.api-sports.io/football/teams/42.png",
//        "winner": true
//        }
