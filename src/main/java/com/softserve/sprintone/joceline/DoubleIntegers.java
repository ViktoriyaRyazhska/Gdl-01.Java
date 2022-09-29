package com.softserve.sprintone.joceline;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Joceline
 */
public class DoubleIntegers {
    /**
     * This is Task 1 that it takes a number and doubles it.
     *
     * @param bufferedReader to read values entered by user.
     */
    public void task1(BufferedReader bufferedReader) {
        boolean loopCheck;
        do {
            loopCheck = false;
            try {
                System.out.println("Enter the number to double it: ");
                int number = Integer.parseInt(bufferedReader.readLine());

                DoubleInteger(number);

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
     * @param number number entered by the user to double it.
     */
    private void DoubleInteger(int number) {
        if (number >= 0) {
            System.out.println("The Double is: " + number * 2);
        } else {
            System.out.println("You have to enter a valid number");
        }
    }
}