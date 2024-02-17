package app.utils;

import app.exceptions.TemperatureException;

public class AppValidator {

    private static final int TEMPERATURE_LOWER_LIMIT = -10;
    private static final int TEMPERATURE_UPPER_LIMIT = 35;

    public String validateTemperature(int temperature)
            throws TemperatureException {
        if (temperature >= TEMPERATURE_LOWER_LIMIT
                & temperature <= TEMPERATURE_UPPER_LIMIT) {
            return "Temperature is OK. Data can be obtained.";
        } else {
            throw new TemperatureException("Invalid temperature.");
        }
    }
}
