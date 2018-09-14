package com.kerimovalex.testproject.model;

import com.google.gson.annotations.SerializedName;

public class ErrorModel {
    @SerializedName("type")
    private String type;
    @SerializedName("message")
    private String message;
    @SerializedName("code")
    private Integer code;

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
