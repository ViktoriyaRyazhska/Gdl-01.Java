package com.softserve.sprintone.joceline;

import com.softserve.sprintone.exception.TaskException;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Joceline
 */
public class DoubleInteger {
    /**
     * This is Task 1 that it takes a number and doubles it.
     * @param bufferedReader to read values
     * @throws IOException
     * @throws NumberFormatException
     */
    public void task1 (BufferedReader bufferedReader) throws TaskException{
        try {
            System.out.println("Enter the number to double it: ");
            int number = Integer.parseInt(bufferedReader.readLine());

            DoubleInteger(number);

        }catch (IOException e){
            throw new TaskException("Enter a valid number");
        }catch (NumberFormatException numberFormatException){
            throw new TaskException("Enter a valid answer");
        }
    }

    /**
     *
     * @param number number entered by the user to double it.
     */
    private void DoubleInteger(int number) {
        if(number >=0 ){
            System.out.println("The Double is: " + number*2);
        }else {
            System.out.println("You have to enter a valid number");
        }
    }
}