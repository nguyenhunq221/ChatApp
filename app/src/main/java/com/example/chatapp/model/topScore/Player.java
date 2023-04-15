package com.example.chatapp.model.topScore;

public class Player {
    private int id;
    private String name;
    private String firstname;
    private String lastname;
    private int age;
    private String photo;
    private Boolean injured;
    private String height;
    private Birth birth;
    private String weight;
    private String nationality;

    public Boolean getInjured() {
        return injured;
    }

    public void setInjured(Boolean injured) {
        this.injured = injured;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Birth getBirth() {
        return birth;
    }

    public void setBirth(Birth birth) {
        this.birth = birth;
    }

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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean isInjured() {
        return injured;
    }

    public void setInjured(boolean injured) {
        this.injured = injured;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}

//"player":{
//        "id": 1100,
//        "name": "E. Haaland",
//        "firstname": "Erling",
//        "lastname": "Braut Haaland",
//        "age": 23,
//        "birth":{"date": "2000-07-21", "place": "Leeds", "country": "England"},
//        "nationality": "Norway",
//        "height": "194 cm",
//        "weight": "88 kg",
//        "injured": false,
//        "photo": "https://media-2.api-sports.io/football/players/1100.png"
//        },
