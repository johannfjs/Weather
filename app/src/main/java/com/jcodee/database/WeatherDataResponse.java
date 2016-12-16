package com.jcodee.database;

import com.google.gson.annotations.SerializedName;
import com.jcodee.database.weather.CoordResponse;
import com.jcodee.database.weather.MainModel;
import com.jcodee.database.weather.SysModel;
import com.jcodee.database.weather.WeatherModel;

import java.util.ArrayList;

/**
 * Created by johannfjs on 21/10/16.
 */

public class WeatherDataResponse {
    @SerializedName("base")
    private String base;
    @SerializedName("name")
    private String name;
    @SerializedName("sys")
    private SysModel sys;
    @SerializedName("weather")
    private ArrayList<WeatherModel> weather;
    @SerializedName("dt")
    private long dt;
    @SerializedName("main")
    private MainModel main;
    @SerializedName("coord")
    private CoordResponse coord;

    public CoordResponse getCoord() {
        return coord;
    }

    public void setCoord(CoordResponse coord) {
        this.coord = coord;
    }

    public MainModel getMain() {
        return main;
    }

    public void setMain(MainModel main) {
        this.main = main;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public ArrayList<WeatherModel> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<WeatherModel> weather) {
        this.weather = weather;
    }

    public SysModel getSys() {
        return sys;
    }

    public void setSys(SysModel sys) {
        this.sys = sys;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
