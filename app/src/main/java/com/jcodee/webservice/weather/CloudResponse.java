package com.jcodee.webservice.weather;

import com.google.gson.annotations.SerializedName;

/**
 * Created by johannfjs on 25/11/16.
 * Email: johann.jara@jcodee.com
 * Phone: (+51) 990870011
 */

public class CloudResponse {
    @SerializedName("all")
    private Integer all;

    public Integer getAll() {
        return all;
    }

    public void setAll(Integer all) {
        this.all = all;
    }
}
