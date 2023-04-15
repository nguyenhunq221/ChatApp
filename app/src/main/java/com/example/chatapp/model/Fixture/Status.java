package com.example.chatapp.model.Fixture;

import com.google.gson.annotations.SerializedName;

public class Status {
    @SerializedName("short")
    private String trangThai;

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
//"status":{
//        "long": "Match Finished",
//        "short": "FT",
//        "elapsed": 90
//        }
