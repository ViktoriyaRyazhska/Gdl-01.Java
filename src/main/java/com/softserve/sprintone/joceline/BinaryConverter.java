package com.softserve.sprintone.joceline;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Joceline
 */
public class BinaryConverter {
    /**
     * This is Task 6 that it takes a number to convert to binary.
     *
     * @param bufferedReader to read the number selected to convert to binary.
     */
    public void task6(BufferedReader bufferedReader) {
        boolean loopCheck;
        do {
            loopCheck = false;
            try {
                System.out.println("Task num 6. This task takes a number to convert to binary");
                System.out.println("Enter a number to convert to binary ");
                int number = Integer.parseInt(bufferedReader.readLine());
                System.out.println(toBinary(number));

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
     *
     * @param number entered by the user to convert it to binary.
     */
    public static int toBinary(int number) {
        return Integer.valueOf(Integer.toBinaryString(number));
    }
}
