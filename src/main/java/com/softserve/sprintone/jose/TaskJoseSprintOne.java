package com.softserve.sprintone.jose;

import com.softserve.sprintone.exception.TaskException;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

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

    /**
     * Task 34 will calculate the average for a student
     * @param bufferReader
     */
    public void task34(BufferedReader bufferReader) {
        List<Double> notes = Arrays.asList(5.6D,9.9D,6.7D,10D,9D,7.2D);
        double suma = notes.stream().reduce(0D, Double::sum);
        double reformat = Math.round(suma/notes.size());
        System.out.println("The average is: ".concat(String.valueOf(reformat)));
    }

    /**
     * Given a non-empty array of integers, return the result of multiplying the values together in order
     * @param bufferReader
     */
    public void task39(BufferedReader bufferReader) {
        List<Integer> integerList = Arrays.asList(1,2,3,4);
        Integer multiply = integerList.stream().reduce(1, Math::multiplyExact);
        StringBuilder stringBuilder = new StringBuilder();
        integerList.forEach(number->{
            stringBuilder.append(number);
            stringBuilder.append("*");
        });
        stringBuilder.append(" = ".concat(String.valueOf(multiply)));
        System.out.print(integerList);
        System.out.print(" => ");
        System.out.println(stringBuilder);
    }

    /**
     * Task 44 will find the summation from 1 to given number
     * @param bufferReader
     */
    public void task44(BufferedReader bufferReader) {
        try{
            System.out.println("Type a number to calculate the summation");
            int number = Integer.parseInt(bufferReader.readLine());
            if(number>0){
                int summation=0;
                for (int i=1; i<=number;i++){
                    summation += i;
                }
                System.out.println(String.format("The summation from %d to %d is %d", 1, number, summation));
            }else
                throw new TaskException("The number will always be a positive integer greater than 0");
        }catch (IOException ioException){
            throw new TaskException("Please, choose a correct number");
        }
    }

    /**
     * Task 50 will print in console the area of shapes like square, rectangle, circle and triangle
     * @param bufferReader
     */
    public void task50(BufferedReader bufferReader) {
        getTotalArea();
    }

    private void getTotalArea() {
        System.out.print("The area of a square with side = 5 is ");
        System.out.println(5*5);
        System.out.print("The area of rectangle with lengh = 5 and breadth = 9 is ");
        System.out.println(8*9);
        System.out.print("The area of circle with radius = 4 is ");
        System.out.println(2*Math.PI*4);
        System.out.print("The area of triangle with base = 9 and height = 6 is ");
        System.out.println(0.5*(9*6));

    }

    /**
     * Task 54 will return the opposite of a number
     * @param bufferReader
     */
    public void task54(BufferedReader bufferReader) {
        try {
            System.out.println("Type a number");
            int number = Integer.parseInt(bufferReader.readLine());
            System.out.println(String.format("The opposite of %d is %d", number, makeOpposite(number)));
        }catch (IOException ioException){
            throw new TaskException("Please, choose a correct number");
        }
    }

    private int makeOpposite(int number) {
        return number*(-1);
    }
}