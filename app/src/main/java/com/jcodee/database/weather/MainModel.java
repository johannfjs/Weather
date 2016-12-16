package com.jcodee.database.weather;

import com.google.gson.annotations.SerializedName;

/**
 * Created by johannfjs on 23/10/16.
 */

public class MainModel {
    @SerializedName("humidity")
    private String humidity;
    @SerializedName("pressure")
    private String pressure;
    @SerializedName("temp")
    private Double temp;
    @SerializedName("temp_min")
    private Double tempMin;
    @SerializedName("temp_max")
    private Double tempMax;
    @SerializedName("sea_level")
    private Double seaLevel;
    @SerializedName("grnd_level")
    private Double grndLevel;
    @SerializedName("dt")
    private long dt;

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Double getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(Double seaLevel) {
        this.seaLevel = seaLevel;
    }

    public Double getGrndLevel() {
        return grndLevel;
    }

    public void setGrndLevel(Double grndLevel) {
        this.grndLevel = grndLevel;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }
}
