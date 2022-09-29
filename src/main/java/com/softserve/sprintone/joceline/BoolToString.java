package com.softserve.sprintone.joceline;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Joceline
 */
public class BoolToString {
    /**
     * This is Task 26 that it takes a boolean variable that user gives, and it prints Yes or No depending on TRUE or FALSE.
     *
     * @param bufferedReader to read values entered by user.
     */
    public void task26(BufferedReader bufferedReader) {
        boolean loopCheck;
        do {
            loopCheck = false;
            int option;
            try {
                System.out.println("Enter number to select\n1. True\n2. False");
                option = Integer.parseInt(bufferedReader.readLine());

                System.out.println((option == 1 ? "Yes" : "No"));
            } catch (IOException e) {
                loopCheck = true;
                System.out.println("Enter a valid answer");
            } catch (NumberFormatException numberFormatException) {
                loopCheck = true;
                System.out.println("Enter a valid number");
            }
        } while (loopCheck);
    }
}
