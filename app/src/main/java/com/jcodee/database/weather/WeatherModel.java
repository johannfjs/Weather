package com.jcodee.database.weather;

import com.google.gson.annotations.SerializedName;

/**
 * Created by johannfjs on 21/10/16.
 */

public class WeatherModel {
    @SerializedName("main")
    private String main;
    @SerializedName("description")
    private String description;
    @SerializedName("id")
    private Integer id;
    @SerializedName("icon")
    private String icon;
    @SerializedName("name")
    private String name;
    @SerializedName("cod")
    private Integer cod;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
