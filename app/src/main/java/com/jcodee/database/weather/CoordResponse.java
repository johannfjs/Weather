package com.jcodee.database.weather;

import com.google.gson.annotations.SerializedName;

/**
 * Created by johannfjs on 25/11/16.
 * Email: johann.jara@jcodee.com
 * Phone: (+51) 990870011
 */

public class CoordResponse {
    @SerializedName("lon")
    private Double lon;
    @SerializedName("lat")
    private Double lat;

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }
}
