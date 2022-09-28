package com.softserve.sprintone.joceline;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Joceline
 */
public class RentalCar {
    /**
     * This is Task 31. In this task, the price of a rental car is calculated based on discounts per day.
     *
     * @param bufferedReader to read number of days that they rented the car, by user.
     */
    public void task31(BufferedReader bufferedReader) {
        boolean loopCheck;
        do {
            loopCheck = false;
            try {
                System.out.println("Task num 31. This task calculates the price of a rental car");
                System.out.println("Enter the number of days to rent the car ");
                int RentedDays = Integer.parseInt(bufferedReader.readLine());

                //int totalPrice = RentedDays > 6 ? (40 * RentedDays) - 50 : RentedDays > 2 ? (40 * RentedDays) - 20 : 40 * RentedDays;
                System.out.println("The Total Price is: $" + rentalCarCost(RentedDays));
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
     * This method check the total price of a car rental based on next:
     * Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total.
     * Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
     *
     * @param RentedDays this is the number of days entered by user.
     * @return it has to return the name + " plays banjo" or " does not play banjo" based on the first letter.
     */
    public static int rentalCarCost(int RentedDays) {
        return RentedDays > 6 ? (40 * RentedDays) - 50 : RentedDays > 2 ? (40 * RentedDays) - 20 : 40 * RentedDays;
    }
}
