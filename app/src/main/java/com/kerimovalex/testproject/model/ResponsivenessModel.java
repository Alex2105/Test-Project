package com.kerimovalex.testproject.model;

import com.google.gson.annotations.SerializedName;

public class ResponsivenessModel {
    @SerializedName("count")
    private String count;
    @SerializedName("seconds")
    private String seconds;
    @SerializedName("experimental")
    private Boolean experimental;

    public String getCount() {
        return count;
    }

    public String getSeconds() {
        return seconds;
    }

    public Boolean getExperimental() {
        return experimental;
    }
}
