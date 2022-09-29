package com.softserve.sprintone.joceline;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Joceline
 */
public class CharacterRecognition {
    /**
     * This is Task 66. This task corrects the errors in the digitised text. You only have to handle the following mistakes:
     * S is misinterpreted as 5
     * O is misinterpreted as 0
     * I is misinterpreted as 1
     *
     * @param bufferedReader to read the text entered.
     */
    public void task66(BufferedReader bufferedReader) {
        boolean loopCheck;
        do {
            loopCheck = false;
            try {
                System.out.println("Task num 66. This task corrects the errors in the digitised text");
                System.out.println("Enter the text: ");
                String string = bufferedReader.readLine();

                System.out.println(correct(string));
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
     * @param string this is the text entered by user.
     * @return it has to return the text written correctly.
     */
    public static String correct(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        string = string.replace("1", "I").replace("0", "O").replace("5", "S");
        return string;
    }
}