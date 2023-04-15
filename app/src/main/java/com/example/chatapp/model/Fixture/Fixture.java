package com.example.chatapp.model.Fixture;

public class Fixture {
    private int id;
    private String referee;
    private String timezone;
    private String date;
    private Venue venue;
    private Status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

//"fixture":{
//        "id": 867946,
//        "referee": "A. Taylor",
//        "timezone": "Asia/Ho_Chi_Minh",
//        "date": "2022-08-06T02:00:00+07:00",
//        "timestamp": 1659726000,
//        "periods":{"first": 1659726000, "second": 1659729600},
//        "venue":{"id": 525, "name": "Selhurst Park", "city": "London"},
//        "status":{"long": "Match Finished", "short": "FT", "elapsed": 90}
//        },
