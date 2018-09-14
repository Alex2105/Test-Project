package com.kerimovalex.testproject.model;

import com.google.gson.annotations.SerializedName;

public class RequestModel {
    @SerializedName("id")
    Integer id;

    public RequestModel(Integer id) {
        this.id = id;
    }
}
