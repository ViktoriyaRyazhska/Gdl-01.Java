package com.softserve.sprintone.joceline;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Joceline
 */
public class CountLoop {
    /**
     * This is Task 70. Oh no, Timmy's created an infinite loop! Help Timmy find and fix the bug in his unfinished for loop!
     *
     * @param bufferedReader to read the int value entered.
     */
    public void task70(BufferedReader bufferedReader) {
        boolean loopCheck;
        do {
            loopCheck = false;
            try {
                System.out.println("Task num 70. This task only iterates a list to count");
                System.out.println("Enter the number of times: ");
                int count = Integer.parseInt(bufferedReader.readLine());

                System.out.println(CreateList(count));
            } catch (IOException e) {
                loopCheck = true;
                System.out.println("Enter a valid answer");
            } catch (NumberFormatException numberFormatException) {
                loopCheck = true;
                System.out.println("Enter a valid text");
            }
        } while (loopCheck);
    }

    /**
     * This method fix the text.
     *
     * @param number this is the number of times that will be iterated.
     * @return it has to return the count.
     */
    public static List CreateList(int number) {
        List list = new ArrayList();

        for(int count = 1; count <= number; count ++){
            list.add(count);
        }

        return list;
    }
}
