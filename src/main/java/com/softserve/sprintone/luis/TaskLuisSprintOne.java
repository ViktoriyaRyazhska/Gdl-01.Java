package com.softserve.sprintone.luis;

import com.softserve.sprintone.exception.TaskException;
import com.softserve.sprintone.luis.additionalResources.Block;
import com.softserve.sprintone.luis.additionalResources.EncapsulationDemo;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Luis Abrego
 */
public class TaskLuisSprintOne {
    /**
     * Task 2 - function-3-multiplying-two-numbers - https://www.codewars.com/kata/function-3-multiplying-two-numbers/
     * This function will take two numbers and returns their product.
     *
     * @param bufferReader for reading data from the console
     * @throws TaskException for invalid data received from the console
     */
    public void task2(BufferedReader bufferReader) throws TaskException{
        for(;;){
            try {
                System.out.println("Enter a first number to multiply");
                int num1 = Integer.parseInt(bufferReader.readLine());
                System.out.println("Enter a second number to multiply");
                int num2 = Integer.parseInt(bufferReader.readLine());
                System.out.println(multiply(num1,num2));
            } catch (IOException e) {
                System.out.println("Enter a valid character");
                continue;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a valid number");
                continue;
            }
            break;
        }
    }

    private int multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Task 7 - beginner-series-number-2-clock - https://www.codewars.com/kata/beginner-series-number-2-clock/
     * This function will return the time since midnight in milliseconds.
     * @param bufferReader for reading data from the console
     * @throws TaskException for invalid data received from the console
     */
    public void task7(BufferedReader bufferReader) throws TaskException{
        for(;;){
            try {
                System.out.println("Enter a numeric value for hours '0 <= h <= 23'");
                int h = Integer.parseInt(bufferReader.readLine());
                if(!(h<=23 && h>=0)){
                    System.out.println("Enter a valid number");
                    continue;
                }
                System.out.println("Enter a numeric value for minutes '0 <= m <= 59'");
                int m = Integer.parseInt(bufferReader.readLine());
                if(!(m<=59 && m>=0)){
                    System.out.println("Enter a valid number");
                    continue;
                }
                System.out.println("Enter a numeric value for seconds '0 <= s <= 59'");
                int s = Integer.parseInt(bufferReader.readLine());
                if(!(s<=59 && s>=0)){
                    System.out.println("Enter a valid number");
                    continue;
                }
                System.out.println(timeInMilisec(h,m,s));
            } catch (IOException e) {
                System.out.println("Enter a valid character");
                continue;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a valid number");
                continue;
            }
            break;
        }
    }

    private int timeInMilisec(int h, int m, int s) {
        int convertHours = h * 60 * 60 * 1000;
        int convertMinutes = m * 60 * 1000;
        int convertSeconds = s * 1000;
        return convertHours + convertMinutes + convertSeconds;
    }

    /**
     * Task 12 - Lombok Encapsulation - https://www.codewars.com/kata/lombok-encapsulation
     * Demonstrate the usage of Lombok Encapsulation by testing the automatic creations of the
     * getters and setters and also de constructor.
     * @param bufferReader for reading data from the console
     * @throws TaskException for invalid data received from the console
     */
    public void task12(BufferedReader bufferReader) throws TaskException{
        System.out.println("Lombook Encapsulation Utilization");
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo();
        System.out.println("Empty constructor");
        encapsulationDemo.setNumber(2);
        encapsulationDemo.setStringValue("test2");
        encapsulationDemo.setAnObject(bufferReader);
        System.out.println("Accessing data from class :"+encapsulationDemo.getNumber()+" "+encapsulationDemo.getStringValue()+" "+encapsulationDemo.getAnObject().toString());
        String forTest = "object";
        EncapsulationDemo encapsulationDemo1 = new EncapsulationDemo(1,"test",forTest);
        System.out.println("Args in contructor");
        System.out.println("Accessing data from class :"+encapsulationDemo1.getNumber()+" "+encapsulationDemo1.getStringValue()+" "+encapsulationDemo1.getAnObject().toString());
    }
    /**
     * Task 17 - Building blocks - https://www.codewars.com/kata/building-blocks/
     * This task creates a class Block and receive the width, length and height of
     * the block and also can calculate the Volume and the SurfaceArea.
     *
     * @param bufferReader for reading data from the console
     * @throws TaskException for invalid data received from the console
     */
    public void task17(BufferedReader bufferReader) throws TaskException{

        for(;;){
            try {
                int [] blockdata = new int[3];
                System.out.println("Enter the width of the block");
                blockdata[0] = Integer.parseInt(bufferReader.readLine());
                System.out.println("Enter the length of the block");
                blockdata[1] = Integer.parseInt(bufferReader.readLine());
                System.out.println("Enter the height of the block");
                blockdata[2] = Integer.parseInt(bufferReader.readLine());
                Block block = new Block(blockdata);
                System.out.println("Introduced values: "+block.getWidth()+" "+block.getLength()+" "+block.getHeight());
                System.out.println("Volume: "+block.getVolume());
                System.out.println("Surface Area: "+block.getSurfaceArea());
            } catch (IOException e) {
                System.out.println("Enter a valid character");
                continue;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a valid number");
                continue;
            }
            break;
        }
    }
    /**
     * Task 22 - How old will I be in 2099? - https://www.codewars.com/kata/how-old-will-i-be-in-2099/
     * Function that takes two parameters: the year of birth and the year to count years in relation to.
     * @param bufferReader for reading data from the console
     * @throws TaskException for invalid data received from the console
     */
    public void task22(BufferedReader bufferReader) throws TaskException{
        for(;;){
            try {
                System.out.println("Enter a birthdate year");
                int birth = Integer.parseInt(bufferReader.readLine());
                System.out.println("Enter a year to count to");
                int yearTo = Integer.parseInt(bufferReader.readLine());
                System.out.println(calculateAge(birth,yearTo));
            } catch (IOException e) {
                System.out.println("Enter a valid character");
                continue;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a valid number");
                continue;
            }
            break;
        }
    }

    private String calculateAge(int birth, int yearTo) {
        int age = yearTo - birth;
        if(age == 1) {
            return "You are " + age + " year old.";
        } else if(age > 1) {
            return "You are " + age + " years old.";
        } else if (age < -1) {
            return "You will be born in " +  Math.abs(age) + " years.";
        } else if (age == -1) {
            return "You will be born in " + Math.abs(age) + " year.";
        } else {
            return "You were born this very year!";
        }
    }

    /**
     * Task 27 - Will there be enough space? - https://www.codewars.com/kata/will-there-be-enough-space/
     * Function that accepts three parameters:
     *     cap is the amount of people the bus can hold excluding the driver.
     *     on is the number of people on the bus excluding the driver.
     *     wait is the number of people waiting to get on to the bus excluding the driver.
     * If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.
     *
     * @param bufferReader for reading data from the console
     * @throws TaskException for invalid data received from the console
     */
    public void task27(BufferedReader bufferReader) throws TaskException{
        int cap = 0; int on =0; int wait =0;
        for(;;){
            try {
                System.out.println("Enter the cap of the bus");
                cap = Integer.parseInt(bufferReader.readLine());
                System.out.println("Enter the number of passengers on the bus");
                on = Integer.parseInt(bufferReader.readLine());
                System.out.println("Enter the number of passengers waiting the bus");
                wait = Integer.parseInt(bufferReader.readLine());
                int responce = enoughSpace(cap,on,wait);
                if(responce==0){
                    System.out.println("He can fit all "+wait+" passengers");
                }else{
                    System.out.println("He can't fit "+responce+" of the "+wait+" waiting");
                }
            } catch (IOException e) {
                System.out.println("Enter a valid character");
                continue;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a valid number");
                continue;
            }
            break;
        }

    }

    private int enoughSpace(int cap, int on, int wait) {
        if(on+wait >= cap){
            return (on + wait) - cap;
        }else{
            return 0;
        }
    }

    /**
     * Task 32 - String repeat
     *
     * @param bufferReader for reading data from the console
     * @throws TaskException for invalid data received from the console
     */
    public void task32(BufferedReader bufferReader) throws TaskException{
    }
    /**
     * Task 37 - Reversed sequence
     *
     * @param bufferReader for reading data from the console
     * @throws TaskException for invalid data received from the console
     */
    public void task37(BufferedReader bufferReader) throws TaskException{
    }
    /**
     * Task 42 - Twice as old
     *
     * @param bufferReader for reading data from the console
     * @throws TaskException for invalid data received from the console
     */
    public void task42(BufferedReader bufferReader) throws TaskException{
    }
    /**
     * Task 48 - Rotations and reflections I
     *
     * @param bufferReader for reading data from the console
     * @throws TaskException for invalid data received from the console
     */
    public void task48(BufferedReader bufferReader) throws TaskException{
    }
    /**
     * Task 52 - Reversed Strings
     *
     * @param bufferReader for reading data from the console
     * @throws TaskException for invalid data received from the console
     */
    public void task52(BufferedReader bufferReader) throws TaskException{
    }
    /**
     * Task 57 - Remove String Spaces
     *
     * @param bufferReader for reading data from the console
     * @throws TaskException for invalid data received from the console
     */
    public void task57(BufferedReader bufferReader) throws TaskException{
    }
    /**
     * Task 62 - Grasshopper - Debug
     *
     * @param bufferReader for reading data from the console
     * @throws TaskException for invalid data received from the console
     */
    public void task62(BufferedReader bufferReader) throws TaskException{
    }
    /**
     * Task 67 - altERnaTIng cAsE <=> ALTerNAtiNG CaSe
     *
     * @param bufferReader for reading data from the console
     * @throws TaskException for invalid data received from the console
     */
    public void task67(BufferedReader bufferReader) throws TaskException{
    }
    /**
     * Task 71 - Filtering even numbers (Bug Fixes)
     *
     * @param bufferReader for reading data from the console
     * @throws TaskException for invalid data received from the console
     */
    public void task71(BufferedReader bufferReader) throws TaskException{
    }

}
