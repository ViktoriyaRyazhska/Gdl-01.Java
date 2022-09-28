package com.softserve.sprintone.joceline;

import com.softserve.sprintone.exception.TaskException;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Joceline
 */
public class CelsiusConverter {
    /**
     * This is task 11. This task take a Fahrenheit temperature to convert to Celsius temperature.
     * @param bufferedReader
     * @throws TaskException
     */
    public void task11 (BufferedReader bufferedReader) throws TaskException {
        try {
            System.out.println("Enter a Fahrenheit temperature to convert to Celsius ");
            double temperature = Double.parseDouble(bufferedReader.readLine());

            System.out.println(weatherInfo(temperature));

        } catch (IOException ioException){
            throw new TaskException("Enter a valid temperature");
        }catch (NumberFormatException numberFormatException){
            throw new TaskException("Enter a valid answer");
        }
    }

    /**
     *
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
        double celsius = (temperature - 32) * 5/9;
        return celsius;
    }
}
