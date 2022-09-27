package com.softserve.sprintone.jose;

import com.softserve.sprintone.exception.TaskException;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JoseCaste
 */
public class TaskJoseSprintOne {

    /**
     * Task 4 will pront to the user values that is required for calculate if it fits an exact number of pixels on the wall.
     * @param bufferedReader to read values for task
     * @throws TaskException
     */
    public void task4(final BufferedReader bufferedReader) throws TaskException {
        try {
            System.out.println("Type size of the wall in milimiters");
            final int wallSize = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Type size of the pixel in milimiters");
            final int pixelSize = Integer.parseInt(bufferedReader.readLine());
            final boolean isDivisible = pixelArtsPlanning(wallSize, pixelSize);
            if(isDivisible)
                System.out.println("It fit an exact number of pixels on the wall");
            else
                System.out.println("It does not fit an exact number of pixels on the wall");
        }catch (IOException e) {
            throw new TaskException("Please, choose a correct number");
        }catch (NumberFormatException numberFormatException){
            throw new TaskException("Please, choose a correct number");
        }
    }

    /**
     *
     * @param wallSize size of the wall in millimeters
     * @param pixelSize size of the pixel in millimeters
     * @return true or false if it is possible fit an exact number of pixels on the wall
     */
    private boolean pixelArtsPlanning(final int wallSize, final int pixelSize){
        return wallSize % pixelSize == 0;
    }

    /**
     * task9 will prompt to the user values that is required for make a number negative.
     * Task 9 process
     * @param bufferedReader to read values for task
     */
    public void task9(final BufferedReader bufferedReader){
        try {
            System.out.println("Type a number that will be negative");
            int number = Integer.parseInt(bufferedReader.readLine());
            makeNegativeNumber(number);
        } catch (IOException ioException){
            throw new TaskException("Please, choose a correct number");
        }
    }

    private void makeNegativeNumber(final int number) {
        if(number>0)
            System.out.printf("%d", number*(-1));
        else
            System.out.printf("%d", number);
    }


}
