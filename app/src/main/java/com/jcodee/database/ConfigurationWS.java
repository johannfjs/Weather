package com.jcodee.database;

import com.jcodee.utils.WebServices;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by johannfjs on 21/10/16.
 */

public class ConfigurationWS {
    public static Retrofit getConfiguration() {
        return new Retrofit.Builder()
                .baseUrl(WebServices.API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
