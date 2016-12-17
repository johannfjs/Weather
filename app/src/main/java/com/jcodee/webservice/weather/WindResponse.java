package com.jcodee.webservice.weather;

import com.google.gson.annotations.SerializedName;

/**
 * Created by johannfjs on 25/11/16.
 * Email: johann.jara@jcodee.com
 * Phone: (+51) 990870011
 */

public class WindResponse {
    @SerializedName("speed")
    private Double speed;
    @SerializedName("deg")
    private Double deg;

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getDeg() {
        return deg;
    }

    public void setDeg(Double deg) {
        this.deg = deg;
    }
}
