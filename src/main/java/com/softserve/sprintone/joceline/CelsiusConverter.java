package com.softserve.sprintone.joceline;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Joceline
 */
public class CelsiusConverter {
    /**
     * This is task 11. This task take a Fahrenheit temperature to convert to Celsius temperature.
     *
     * @param bufferedReader to read values entered by user.
     */
    public void task11(BufferedReader bufferedReader) {
        boolean loopCheck;
        do {
            loopCheck = false;
            try {
                System.out.println("Enter a Fahrenheit temperature to convert to Celsius ");
                double temperature = Double.parseDouble(bufferedReader.readLine());

                System.out.println(weatherInfo(temperature));

            } catch (IOException ioException) {
                loopCheck = true;
                System.out.println("Enter a valid answer");
            } catch (NumberFormatException numberFormatException) {
                loopCheck = true;
                System.out.println("Enter a valid number");
            }
        } while (loopCheck);
    }

    /**
     * @param temperature this is a number entered by the user
     * @return here returns the temperature calculated and if the weather is freezing or not based on celsius.
     */
    public String weatherInfo(double temperature) {
        double celsius = convertToCelsius(temperature);
        if (celsius <= 0)
            return (celsius + " is freezing temperature");
        else
            return (celsius + " is above freezing temperature");
    }

    public static double convertToCelsius(double temperature) {
        return (temperature - 32) * 5 / 9;
    }
}
