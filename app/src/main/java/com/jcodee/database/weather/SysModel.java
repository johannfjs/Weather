package com.jcodee.database.weather;

import com.google.gson.annotations.SerializedName;

/**
 * Created by johannfjs on 21/10/16.
 */

public class SysModel {
    @SerializedName("country")
    private String country;
    @SerializedName("sunrise")
    private long sunrise;
    @SerializedName("sunset")
    private long sunset;
    @SerializedName("message")
    private Double message;

    public Double getMessage() {
        return message;
    }

    public void setMessage(Double message) {
        this.message = message;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
