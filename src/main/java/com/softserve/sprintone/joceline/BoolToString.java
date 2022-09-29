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
     * @param bufferedReader to read the number selected by user to convert in YES or NO based on TRUE or FALSE.
     */
    public void task26(BufferedReader bufferedReader) {
        boolean loopCheck;
        do {
            loopCheck = false;
            int option;
            try {
                System.out.println("Enter number to select\n1. True\n2. False");
                option = Integer.parseInt(bufferedReader.readLine());

                if(option == 1 || option == 2){
                    System.out.println(boolToWord(option));
                }else {
                    System.out.println("Select a valid answer\n");
                    loopCheck = true;
                }
            } catch (IOException e) {
                loopCheck = true;
                System.out.println("Enter a valid answer");
            } catch (NumberFormatException numberFormatException) {
                loopCheck = true;
                System.out.println("Enter a valid number");
            }
        } while (loopCheck);
    }

    public static String boolToWord(int option) {
        return option == 1 ? "Yes" : "No";
    }
}
