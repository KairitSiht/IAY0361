package model;

import utility.Constants;

public class WeatherRequest {

    public final String cityName;
    public final Constants.UNIT unit;
    public final String countryCode;


    public WeatherRequest(String cityName, String countryCode, Constants.UNIT unit) {
        this.cityName = cityName;
        this.unit = unit;
        this.countryCode = countryCode;
    }
}
