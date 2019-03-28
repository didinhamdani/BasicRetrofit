package com.example.retrofit.Network;

import com.google.gson.annotations.SerializedName;

public class RetroUsers {

    @SerializedName("name")
    private String name;

    public RetroUsers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
