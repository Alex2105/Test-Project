package com.kerimovalex.testproject.model;

import com.google.gson.annotations.SerializedName;

public class DataModel {
    @SerializedName("user")
    private UserModel user;
    @SerializedName("responsiveness")
    private ResponsivenessModel responsiveness;

    public UserModel getUser() {
        return user;
    }

    public ResponsivenessModel getResponsiveness() {
        return responsiveness;
    }
}
