package com.jcodee.fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jcodee.database.ConfigurationWS;
import com.jcodee.database.HelperWS;
import com.jcodee.database.ResponseData;
import com.jcodee.preferences.CityPreference;
import com.jcodee.weather.R;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by johannfjs on 8/10/16.
 */

public class WeatherFragment extends Fragment {
    @BindView(R.id.city_field)
    TextView cityField;
    @BindView(R.id.updated_field)
    TextView updatedField;
    @BindView(R.id.weather_icon)
    TextView weatherIcon;
    @BindView(R.id.current_temperature_field)
    TextView currentTemperatureField;
    @BindView(R.id.details_field)
    TextView detailsField;
    private Typeface weatherFont;
    private Handler handler;

    public WeatherFragment() {
        handler = new Handler();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        weatherFont = Typeface.createFromAsset(getActivity().getAssets(), "fonts/weather.ttf");

        updateWeatherData(new CityPreference(getActivity()).getCity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_weather, container, false);
        ButterKnife.bind(this, root);

        weatherIcon.setTypeface(weatherFont);
        return root;
    }

    private void updateWeatherData(final String city) {
        HelperWS helperWS = ConfigurationWS.getConfiguration().create(HelperWS.class);
        Call<ResponseData> result = helperWS.getWeather("weather?q=" + city + "&units=metric&appid=92191c19457fe9b7fca86d665edc8bf7");
        result.enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {
                ResponseData resultado = response.body();
                if (resultado != null) {
                    cityField.setText(resultado.getSys().getCountry());
                    detailsField.setText(
                            resultado.getWeather().get(0).getDescription().toUpperCase(Locale.US) +
                                    "\n" + getResources().getString(R.string.humidity) + resultado.getMain().getHumidity() + "%" +
                                    "\n" + getResources().getString(R.string.pressure) + resultado.getMain().getPressure() + " hPa");
                    currentTemperatureField.setText(String.valueOf(resultado.getMain().getTemp()));
                    DateFormat df = DateFormat.getDateTimeInstance();
                    String updatedOn = df.format(new Date(resultado.getDt() * 1000));
                    updatedField.setText(getResources().getString(R.string.last_update) + updatedOn);

                    setWeatherIcon(resultado.getWeather().get(0).getId(),
                            resultado.getSys().getSunrise() * 1000,
                            resultado.getSys().getSunset() * 1000);
                }
            }

            @Override
            public void onFailure(Call<ResponseData> call, Throwable t) {

            }
        });
    }

    private void setWeatherIcon(int actualId, long sunrise, long sunset) {
        int id = actualId / 100;
        String icon = "";
        if (actualId == 800) {
            long currentTime = new Date().getTime();
            if (currentTime >= sunrise && currentTime < sunset) {
                icon = getActivity().getString(R.string.weather_sunny);
            } else {
                icon = getActivity().getString(R.string.weather_clear_night);
            }
        } else {
            switch (id) {
                case 2:
                    icon = getActivity().getString(R.string.weather_thunder);
                    break;
                case 3:
                    icon = getActivity().getString(R.string.weather_drizzle);
                    break;
                case 7:
                    icon = getActivity().getString(R.string.weather_foggy);
                    break;
                case 8:
                    icon = getActivity().getString(R.string.weather_cloudy);
                    break;
                case 6:
                    icon = getActivity().getString(R.string.weather_snowy);
                    break;
                case 5:
                    icon = getActivity().getString(R.string.weather_rainy);
                    break;
            }
        }
        weatherIcon.setText(icon);
    }

    public void changeCity(String city) {
        updateWeatherData(city);
    }
}
