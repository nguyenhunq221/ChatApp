package com.example.chatapp.model.Fixture;

public class Home {
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

//"home":{
//        "id": 52,
//        "name": "Crystal Palace",
//        "logo": "https://media-1.api-sports.io/football/teams/52.png",
//        "winner": false
//        }
