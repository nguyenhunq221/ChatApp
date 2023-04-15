package com.example.chatapp.model.topScore;

public class Game {
    private String number;
    private String position;
    private Double rating;
    private Boolean captain;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Boolean getCaptain() {
        return captain;
    }

    public void setCaptain(Boolean captain) {
        this.captain = captain;
    }
}

//"games":{
//        "appearences": 25,
//        "lineups": 25,
//        "minutes": 2242,
//        "number": null,
//        "position": "Attacker",
//        "rating": "7.368000",
//        "captain": false
//        }
