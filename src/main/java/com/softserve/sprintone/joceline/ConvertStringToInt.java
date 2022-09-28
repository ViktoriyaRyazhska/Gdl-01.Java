package com.softserve.sprintone.joceline;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Joceline
 */
public class ConvertStringToInt {
    /**
     * This is Task 61. This task returns the girl's age (0-9) as an integer.
     *
     * @param bufferedReader to read the String entered.
     */
    public void task61(BufferedReader bufferedReader) {
        boolean loopCheck;
        do {
            loopCheck = false;
            try {
                System.out.println("Task num 61. This task converts from String to Int");
                System.out.println("Enter the girl age from 0 to 9: ");
                String age = bufferedReader.readLine(); //Need to resolve this verification

                System.out.println(howOld(age));
            } catch (IOException e) {
                loopCheck = true;
                System.out.println("Enter a valid answer");
            } catch (NumberFormatException numberFormatException) {
                loopCheck = true;
                System.out.println("Enter a valid number");
            }
        } while (loopCheck);
    }

    /**
     * This method convert the String to Int.
     *
     * @param age this is the age entered by user.
     * @return it has to return the String value given in format of Int.
     */
    public static int howOld(final String age) {
        return Integer.parseInt(age.substring(0, 1));
    }
}
