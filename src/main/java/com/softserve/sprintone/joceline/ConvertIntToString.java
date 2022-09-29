package com.softserve.sprintone.joceline;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Joceline
 */
public class ConvertIntToString {
    /**
     * Task 51. This task takes the number (Int) that user enters to convert to String
     *
     * @param bufferedReader it read the Integer value that user enters.
     */
    public void task51(BufferedReader bufferedReader) {
        boolean loopCheck;
        do {
            loopCheck = false;
            try {
                System.out.println("Enter the number to convert to String: ");
                int number = Integer.parseInt(bufferedReader.readLine());

                System.out.println(numberToString(number));
            } catch (IOException e) {
                loopCheck = true;
                System.out.println("Enter a valid answer");
            } catch (NumberFormatException numberFormatException) {
                loopCheck = true;
                System.out.println("Enter a valid number");
            }
        } while (loopCheck);
    }

    public static String numberToString(int number) {
        return ""+number;
    }
}
