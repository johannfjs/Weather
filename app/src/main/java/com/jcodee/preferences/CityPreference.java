package com.jcodee.preferences;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by johannfjs on 8/10/16.
 */

public class CityPreference {
    SharedPreferences prefs;

    public CityPreference(Activity activity) {
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    public String getCity() {
        return prefs.getString("city", "Lima, LIM");
    }

    public void setCity(String city) {
        prefs.edit().putString("city", city).commit();
    }
}
