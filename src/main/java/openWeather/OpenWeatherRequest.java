package openWeather;

import utility.Constants;

public class OpenWeatherRequest {
    public final String city;
    public final String countryCode;

    public final Constants.UNIT units;

    public OpenWeatherRequest(String city, String countryCode, Constants.UNIT units) {
        this.city = city;
        this.countryCode = countryCode;
        this.units = units;
    }
}
