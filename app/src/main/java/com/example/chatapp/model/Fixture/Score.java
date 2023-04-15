package com.example.chatapp.model.Fixture;

public class Score {
    private Halftime halftime;
    private Fulltime fulltime;

    public Halftime getHalftime() {
        return halftime;
    }

    public void setHalftime(Halftime halftime) {
        this.halftime = halftime;
    }

    public Fulltime getFulltime() {
        return fulltime;
    }

    public void setFulltime(Fulltime fulltime) {
        this.fulltime = fulltime;
    }
}
//"score":{
//        "halftime":{"home": 0, "away": 1},
//        "fulltime":{"home": 0, "away": 2},
//        "extratime":{"home": null, "away": null},
//        "penalty":{"home": null, "away": null}
//        }
