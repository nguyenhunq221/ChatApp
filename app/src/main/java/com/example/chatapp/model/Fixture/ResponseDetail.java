package com.example.chatapp.model.Fixture;

public class ResponseDetail {
    private Fixture fixture;
    private League league;
    private Team teams;
    private Goal goals;
    private Score score;

    public Fixture getFixture() {
        return fixture;
    }

    public void setFixture(Fixture fixture) {
        this.fixture = fixture;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Team getTeams() {
        return teams;
    }

    public void setTeams(Team teams) {
        this.teams = teams;
    }

    public Goal getGoals() {
        return goals;
    }

    public void setGoals(Goal goals) {
        this.goals = goals;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }
}
//{
//        "fixture":{"id": 867946, "referee": "A. Taylor", "timezone": "Asia/Ho_Chi_Minh", "date": "2022-08-06T02:00:00+07:00",…},
//        "league":{"id": 39, "name": "Premier League", "country": "England", "logo": "https://media-2.api-sports.io/football/leagues/39.png",…},
//        "teams":{"home":{"id": 52, "name": "Crystal Palace", "logo": "https://media-1.api-sports.io/football/teams/52.png",…},
//        "goals":{"home": 0, "away": 2},
//        "score":{"halftime":{"home": 0, "away": 1 }, "fulltime":{"home": 0,…}
//        }