package com.softserve.sprintone.jose;

import com.softserve.sprintone.exception.TaskException;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JoseCaste
 */
public class TaskJoseSpringOne {

    /**
     * Task 4 process
     * @param scanner to read values for task
     * @throws TaskException
     */
    public static void task4(Scanner scanner) throws TaskException {
        try {
            System.out.println("Type size of the wall in milimiters");
            final int wallSize = scanner.nextInt();

            System.out.println("Type size of the pixel in milimiters");
            final int pixelSize = scanner.nextInt();
            final boolean isDivisible = TaskJoseSpringOne.pixelArtsPlanning(wallSize, pixelSize);
            if(isDivisible)
                System.out.println(" It's fit an exact number of pixels on the wall");
            else
                System.out.println(" Is not fit an exact number of pixels on the wall");
        } catch (InputMismatchException inputMismatchException){
            throw new TaskException("Please, choose a correct number");
        }
    }

    /**
     *
     * @param wallSize size of the wall in millimeters
     * @param pixelSize size of the pixel in millimeters
     * @return true or false if it is possible fit an exact number of pixels on the wall
     */
    public static boolean pixelArtsPlanning(final int wallSize, final int pixelSize){

        return wallSize % pixelSize == 0;
    }
}
