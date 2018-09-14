package com.kerimovalex.testproject.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ExampleModel {
    @SerializedName("apiVersion")
    private String apiVersion;
    @SerializedName("apiRefreshAuthKey")
    private String apiRefreshAuthKey;
    @SerializedName("error")
    private ErrorModel error;
    @SerializedName("meta")
    private List<Object> meta = null;
    @SerializedName("data")
    private DataModel data;

    public String getApiVersion() {
        return apiVersion;
    }

    public String getApiRefreshAuthKey() {
        return apiRefreshAuthKey;
    }

    public ErrorModel getError() {
        return error;
    }

    public List<Object> getMeta() {
        return meta;
    }

    public DataModel getData() {
        return data;
    }
}
