package com.softserve.sprintone.joceline;

import java.io.BufferedReader;
import java.io.IOException;
/**
 * @author Joceline
 */
public class PlayBanjo {
    /**
     * This is Task 56. A function which answers the question "Are you playing banjo?".
     * If your name starts with the letter "R" or lower case "r", you are playing banjo!
     *
     * @param bufferedReader to read the String value of your name.
     */
    public void task56(BufferedReader bufferedReader) {
        boolean loopCheck;
        do {
            loopCheck = false;
            try {
                System.out.println("Enter your name to know if you are playing banjo ");
                String name = bufferedReader.readLine();

                System.out.println(areYouPlayingBanjo(name));
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
     * This method check if you are playing banjo based on the first letter of your name
     *
     * @param name this is the name entered by user.
     * @return it has to return the name + " plays banjo" or " does not play banjo" based on the first letter.
     */
    public static String areYouPlayingBanjo(String name) {
        return name + ((name.charAt(0) == 'r' || name.charAt(0) == 'R') ? " plays " : " does not play ") + "banjo";
    }
}
