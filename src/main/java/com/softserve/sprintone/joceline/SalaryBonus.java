package com.softserve.sprintone.joceline;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Joceline
 */
public class SalaryBonus {
    /**
     * This is task 21. In this task is calculated a salary based on if it has a bonus or not.
     *
     * @param bufferedReader to read values entered by user.
     */
    public void task21(BufferedReader bufferedReader) {
        boolean loopCheck;
        do {
            loopCheck = false;
            try {
                System.out.println("Task num 21. This task calculates the total salary based on bonus");
                System.out.println("Enter your salary: ");
                int salary = Integer.parseInt(bufferedReader.readLine());

                //In this condition it checks if it has a bonus or not to calculate the total salary
                int option;
                do {
                    try {
                        System.out.println("Select if you have a bonus: \n1. Si\n2. No ");
                        option = Integer.parseInt(bufferedReader.readLine());

                        if (option == 1) {
                            int statedSalary = salary * 10;
                            System.out.println("Your salary is £" + statedSalary);
                        } else if (option == 2) {
                            System.out.println("Your salary is £" + salary);
                        } else {
                            System.out.println("Select a valid answer");
                        }
                    } catch (NumberFormatException numberFormatException) {
                        option = 0;
                        System.out.println("Enter a valid number");
                    }
                } while (!(option == 1 || option == 2));

                //System.out.println(bonusTime(salary, bonus));
            } catch (IOException e) {
                loopCheck = true;
                System.out.println("Check your inputs");
            }
        } while (loopCheck);
    }
}