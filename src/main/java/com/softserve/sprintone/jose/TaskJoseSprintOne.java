package com.softserve.sprintone.jose;

import com.softserve.sprintone.exception.TaskException;
import com.softserve.sprintone.jose.util.Fraction;

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

    /**
     * task 14 will calculate and print fraction of two numbers
     * @param bufferedReader
     */
    public void task14(final BufferedReader bufferedReader) {
        try {
            System.out.println("Type a number that will be a numerator");
            int firstNumerator = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Type a number that will be a denominator");
            int firstDenominator = Integer.parseInt(bufferedReader.readLine());

            //Fraction fraction = new Fraction(firstNumerator/ firstDenominator);
            //System.out.println(fraction.toString());
            /*System.out.println("Type a number that will be a numerator");
            int secondNumerator = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Type a number that will be a denominator");
            int secondDenominator = Integer.parseInt(bufferedReader.readLine());*/


        } catch (IOException inputMismatchException) {
            System.err.println("");
        }
    }

    /**
     * Task 19 will check if a number n is divisible by two numbers
     * @param bufferedReader
     */
    public void task19(final BufferedReader bufferedReader){
        try {
            System.out.println("Type a number that will check by two numbers");
            int number = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Type a first divisible number");
            int firstDivisibleNumber = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Type a second divisible number");
            int secondDivisibleNumber = Integer.parseInt(bufferedReader.readLine());

            if(number > 0 || firstDivisibleNumber >0 || secondDivisibleNumber >0 ) {
                if (isDivisible(number, firstDivisibleNumber, secondDivisibleNumber))
                    System.out.println(String.format("true because %d is divisble by %d and %d", number, firstDivisibleNumber, secondDivisibleNumber));
                else
                    System.out.println(String.format("false because %d is not divisble by %d and %d", number, firstDivisibleNumber, secondDivisibleNumber));
            }else
                throw new TaskException("Numbers negatives are not allowed");
        }catch (IOException ioException){
            throw new TaskException("Please, choose a correct number");
        }
    }

    public boolean isDivisible(final int number, final int firstDivisibleNumber, final int secondDivisibleNumber){
        return ((number % firstDivisibleNumber) == 0) && ((number % secondDivisibleNumber) == 0);
    }

    /**
     * Task 4 has four basic arithmetic operations
     * @param bufferReader
     */
    public void task24(BufferedReader bufferReader) {
        try {
            System.out.println("Type arithmetic operator");
            final String operator = bufferReader.readLine();

            System.out.println("Type first value");
            final int firstValue = Integer.parseInt(bufferReader.readLine());

            System.out.println("Type second value");
            final int secondValue = Integer.parseInt(bufferReader.readLine());
            System.out.println("The result is: "+isValidOperator(operator, firstValue, secondValue));
        }catch (IOException ioException){
            throw new TaskException("Please, choose a correct number");
        }
    }

    /**
     * This function check if the operator that has been typed is valid and return the result of arithmetic operation
     * @param operator can be +, -, *, /
     */
    private int isValidOperator(String operator, int firstValue, int secondValue) {
        switch (operator){
            case "+":
                return firstValue+secondValue;
            case "-":
                return firstValue-secondValue;
            case "*":
                return firstValue*secondValue;
            case "/":
                if(secondValue == 0)
                    throw new TaskException("Denominator with value 0 is not allowed");
                return firstValue/secondValue;
            default:
                throw new TaskException("The specific operator has not been implemented");


        }
    }

    /**
     * Task 9 will print in console the number in words.
     * @param bufferReader
     */
    public void task29(BufferedReader bufferReader) {
        try {
            System.out.println("Type a number between 0-9");
            int number = Integer.parseInt(bufferReader.readLine());
            printNumberInWords(number);
        }catch (IOException ioException){
            throw new TaskException("Please, choose a correct number");
        }
    }

    /**
     * This function will print in console the word of a some number
     * @param number
     */
    private void printNumberInWords(int number) {
        switch (number){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        }
    }
}
