package com.softserve.sprintone.joceline;

import com.softserve.sprintone.exception.TaskException;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Joceline
 */
public class BinaryConverter {
    /**
     * This is Task 6 that it takes a number to convert to binary.
     * @param bufferedReader to read values
     * @throws IOException
     * @throws NumberFormatException
     */
    public void task6 (BufferedReader bufferedReader) throws TaskException {
        try {
            System.out.println("Enter a number to convert to binary ");
            int number = Integer.parseInt(bufferedReader.readLine());
            System.out.println(toBinary(number));

        } catch (IOException ioException){
            throw new TaskException("Please, choose a correct number");
        }catch (NumberFormatException numberFormatException){
            throw new TaskException("Enter a valid answer");
        }
    }
    /**
     *
     * @param number number entered by the user to convert it to binary.
     */
    public static int toBinary(int number) {
        return Integer.valueOf(Integer.toBinaryString(number));
    }
}
