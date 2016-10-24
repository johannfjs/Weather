package com.jcodee.database;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * Created by johannfjs on 21/10/16.
 */

public interface HelperWS {
    @POST
    Call<ResponseData> getWeather(@Url String url);
}
