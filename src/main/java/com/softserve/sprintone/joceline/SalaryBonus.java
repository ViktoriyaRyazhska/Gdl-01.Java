package com.softserve.sprintone.joceline;

import com.softserve.sprintone.exception.TaskException;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Joceline
 */
public class SalaryBonus {
    /**
     * This is task 21. In this task is calculated a salary based on if it has a bonus or not.
     * @param bufferedReader to read values.
     * @throws TaskException to check that values are correct.
     */
    public void task21 (BufferedReader bufferedReader) throws TaskException{
        boolean loopCheck = false;
        do{
           try {
               System.out.println("Enter your salary: ");
               int salary = Integer.parseInt(bufferedReader.readLine());

               int option;
               boolean bonus = false;
               do {
                   try {
                       System.out.println("Select if you have a bonus: \n1. Si\n2. No ");
                       option = Integer.parseInt(bufferedReader.readLine());

                       if (option == 1) {
                           bonus = true;
                       } else if (option == 2) {
                           bonus = false;
                       } else {
                           System.out.println("Select a valid answer");
                       }
                   }catch (NumberFormatException numberFormatException){
                       option = 0;
                       System.out.println("Enter a valid number");
                   }
               }while (!(option == 1 || option == 2));

               System.out.println(bonusTime(salary, bonus));
           }catch (IOException e){
               loopCheck = true;
               System.out.println("Check your inputs");
           }
        }while (loopCheck);
    }

    /**
     * This method is used to calculate the total salary base on bonus.
     * @param salary this is an int variable that the user sends to calculate.
     * @param bonus this is a boolean variable that the user send to select if it has a bonus.
     * @return Has to return the total salary calculated.
     */
    public static String bonusTime(final int salary, final boolean bonus) {
        if(bonus == true){
            System.out.println(salary);
            int statedSalary = salary * 10;
            return "Your salary is £" + statedSalary;
        }else{
            return "Your salary is £" + salary;
        }
    }
}