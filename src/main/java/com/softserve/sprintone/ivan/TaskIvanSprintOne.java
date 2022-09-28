package com.softserve.sprintone.ivan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.random;

/**
 * @author Iván Caballero
 */

/**
 * Task 13 - The code provided has a method plus100 which is supposed to return the number of the
 * parameter incremented by 100. But it's not working properly.
 * Constraints:
 * - Do not modify the constructor
 * - Do not modify the plus100 method
 * - Do not modify the ONE_HUNDRED declaration
 */
class Dinglemouse {
    private static final int ONE_HUNDRED = 100;
    public static final Dinglemouse dinglemouse = new Dinglemouse();
    private final int value;

    private Dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}

/**
 * Class TaskIvanSprintOne set all the tasks to accomplish
 */
public class TaskIvanSprintOne {
    /**
     * Class Encoder needed for task 49
     * Specific instructions:
     * - The code must contain a Leetspeak class inherited from an Encoder abstract class and containing an
     * encode(String) method returning itself the encoded String.
     * - The encode method should return an empty String if a null parameter is passed.
     * - If any uppercase character is given, it should be compared also with the dictionary,
     * 'a' gives '4' but 'A' gives also '4'.
     * - If any character outside the dictionary is given, it should be output as is.
     */
    abstract static class Encoder{
        public abstract String encode(String source);
    }

    public static class Leetspeak extends Encoder{
        private List<String> characters;

        private List<String> encodeCharacters;

        public Leetspeak(){
            characters = new ArrayList<>(){{
                            add("a");
                            add("e");
                            add("l");
                            add("m");
                            add("o");
                            add("u");
                        }};
            encodeCharacters = new ArrayList<>(){{
                                    add("4");
                                    add("3");
                                    add("1");
                                    add("/^^\\");
                                    add("0");
                                    add("(_)");
                                }};
        }

        public String encode(String source){
            StringBuilder st = new StringBuilder();
            int index;

            if (source.equals(""))
                return null;

            for (String s : source.split("")) {
                if (characters.contains(s.toLowerCase())){
                    index = characters.indexOf(s.toLowerCase());
                    st.append(encodeCharacters.get(index));
                } else {
                    st.append(s);
                }
            }

            return st.toString();
        }

    }

    public static final TaskIvanSprintOne INST = new TaskIvanSprintOne();

    /**
     * Task 3 - getVolume calculate the volume of a cuboid with three values given: the length,
     * width and height of the cuboid.
     * @param length length of the cuboid
     * @param width width of the cuboid
     * @param height height of the cuboid
     * @return float
     */
    public float getVolume(float length, float width, float height){
        return length * width * height;
    }

    /**
     * Task 3- Ask the user three values to calculate the volume of the cuboid
     * @param sc Variable for receive data
     */
    public void task3(Scanner sc) {
        float length, width, height;
        System.out.print("Type length of the cuboid: ");
        length = sc.nextFloat();
        System.out.print("Type width of the cuboid: ");
        width = sc.nextFloat();
        System.out.print("type height of the cuboid: ");
        height  = sc.nextFloat();
        System.out.println("Volume of cuboid: " + getVolume(length, width, height));
    }

    /**
     * Task 8 - Given a year, print the century it is in.
     * @param sc Variable for receive data
     */
    public void task8(Scanner sc) {
        int year, century;
        System.out.print("Type a year: ");
        year = sc.nextInt();
        century = (int) Math.ceil(year / 100.0);
        System.out.println("century = " + century);
    }

    /**
     * Task 13 - The class Dinglemouse provided has a method plus100 which is supposed to return the number of the
     * parameter incremented by 100. But it's not working properly.
     * @param sc Variable for receive data
     */
    public void task13(Scanner sc) {
        int number;
        System.out.print("Type a number: ");
        number = sc.nextInt();
        System.out.println("Number incremented by 100 = " + Dinglemouse.dinglemouse.plus100(number));
    }

    /**
     * Task 18 - Very simple, given an integer or a floating-point number, find its opposite.
     * @param sc Variable for receive data
     */
    public void task18(Scanner sc) {
        float number;

        System.out.print("Type a number: ");
        number = sc.nextInt();

        if (number < 0)
            System.out.println("Opposite number = " + -number);
        else
            System.out.println("Opposite number = " + -number);
    }

    /**
     * This method returns a random element from a String List
     * @param list A list of strings
     * @return String
     */
    private String selectRandom(List<String> list){
        return list.get((int) (random() * list.size()));
    }

    /**
     * Task 23 - Rock, Paper, Scissors!
     */
    public void task23(){
        final String player1, player2;
        final List<String> rockPaperScissors = new ArrayList<>(){{
                                                       add("rock");
                                                       add("paper");
                                                       add("scissors");
                                                    }};

        player1 = selectRandom(rockPaperScissors);
        player2 = selectRandom(rockPaperScissors);

        if (player1.equals(player2))
            System.out.println("Player 1: " + player1 + "\nPlayer 2: " + player2 + "\nDraw!");

        else if (player1.equals("scissors") && player2.equals("paper")
                        || player1.equals("paper") && player2.equals("rock")
                        || player1.equals("rock") && player2.equals("scissors"))
            System.out.println("Player 1: " + player1 + "\n" + "Player 2: " + player2 + "\nPlayer 1 won!");

        else
            System.out.println("Player 1: " + player1 + "\n" + "Player 2: " + player2 + "\nPlayer 2 won!");
    }

    /**
     * Task 28 - The Modulo-3 Sequence
     * Consider a sequence where the first two numbers are 0 and 1 and the next number of the sequence
     * is the sum of the previous 2 modulo 3.
     *Constraints:
     *     1 ≤ N ≤ 10^19
     */
    public void task28(Scanner sc){
        int number, prev = 0, result = 0, temp = 1;

        System.out.print("Type a number: ");
        number = sc.nextInt();

        if ((number >= 1) && ((number <= pow(10, 19)))) {
            if (number == 2){
                result = 1;
            } else {
                for (int i = 2; i < number; i++) {
                    result = (temp + prev) % 3;
                    prev = temp;
                    temp = result;
                }
            }
            System.out.println("result = " + result);

        } else {
            System.out.println("No valid number");
        }
    }

    /**
     * This method calculate years in human of dog and cat and return it in an array
     * @param years human years to calculate the dog and cats years
     * @return Array
     */

    public int[] getDogCatyears(int years){
        int dogYears = 0, catYears = 0;

        if (years > 0) {
            for (int i = 1; i <= years; i++) {
                if (i == 1){
                    dogYears += 15;
                    catYears += 15;
                }
                else if (i == 2){
                    dogYears += 9;
                    catYears += 9;
                } else {
                    dogYears += 5;
                    catYears += 4;
                }
            }

            return new int[]{years, catYears, dogYears};

        } else {
            System.out.println("The years has to be greater than the 0");
        }

        return null;
    }

    /**
     * Task 33 - Cat years, Dog years
     * Constraints:
     *     humanYears >= 1
     *     humanYears are whole numbers only
     * Cat Years
     *     15 cat years for first year
     *     +9 cat years for second year
     *     +4 cat years for each year after that
     * Dog Years
     *     15 dog years for first year
     *     +9 dog years for second year
     *     +5 dog years for each year after that
     * @param sc Variable for receive data
     */
    public void task33(Scanner sc) {
        int humanYears;

        System.out.print("Type years (1, 2, 3...): ");
        humanYears = sc.nextInt();

        int[] years = getDogCatyears(humanYears);

        System.out.println("Human years: " + years[0]);
        System.out.println("Cat years: " + years[1]);
        System.out.println("Dog years: " + years[2]);
    }

    /**
     * This method receive an array with scores. Calculate the average and compare your score!
     * @param scores list of scores and calculate the average.
     * @param myScore Score we want to compare.
     * @return boolean
     */
    public boolean betterThanAverage(int[] scores, int myScore){
        int average, sum = 0;

        for ( Integer score : scores )
            sum += score;

        average = sum / scores.length;
        return average < myScore;
    }

    /**
     * Task 38- How good are you really?
     * There was a test in your class, and you passed it. Congratulations!
     * But you're an ambitious person. You want to know if you're better than the average student in your class.
     * You add your classmate's scores in an array.
     * Now calculate the average and compare your score!
     * @param sc Variable for receive data
     */
    public void task38(Scanner sc){
        int myPoints, numberOfScores;
        int[] scores;

        System.out.print("Type your points: ");
        myPoints = sc.nextInt();

        System.out.print("How many scores you want compare? ");
        numberOfScores = sc.nextInt();
        scores = new int[numberOfScores];

        for (int i = 0; i < numberOfScores; i++) {
            System.out.print("Type score: ");
            scores[i] = sc.nextInt();
        }

        if (betterThanAverage(scores, myPoints))
            System.out.println("You're better than average");
        else
            System.out.println("Your not better than average");
    }

    /**
     * This method calculate the nearest square number.
     * @param number Reference number to calculate the nearest square.
     * @return int
     */
    public int nearestSquare(int number){
        for(int i=number, j=number; ; i++, j--) {
            if(Math.sqrt(i) % 1 == 0) return i;
            if(Math.sqrt(j) % 1 == 0 && j > 0) return j;
        }
    }

    /**
     * Task 43 - Your task is to find the nearest square number of a positive integer number.
     * @param sc Variable for receive data
     */
    public void task43(Scanner sc) {
        int number, squareNumber;

        System.out.print("Type a number: ");

        number = sc.nextInt();
        squareNumber = nearestSquare(number);

        System.out.println("Nearest square = " + squareNumber);
    }

    /**
     * Task 49 - This method make use of the classes Encoder and Leetspeak.
     * The objective is to provide a method to encode a given phrase.
     * @param sc Variable for receive data
     */
    public void task49(Scanner sc){
        String encode, st;
        Leetspeak myEncoder = new Leetspeak();

        System.out.print("Type a word or sentence: ");
        st = sc.nextLine();
        encode = myEncoder.encode(st);

        System.out.println("encode = " + encode);
    }

    /**
     * This method remove an n number of exclamation marks from a string.
     * @param s string to remove the exclamation marks.
     * @param n int number of exclamation marks
     * @return String
     */
    public String remove(String s, int n) {
        StringBuilder newString = new StringBuilder();

        if (s.contains("!") || s.contains("¡")){
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) == '!' || s.charAt(i) == '¡') && n > 0) {
                    n--;
                    continue;
                }
                newString.append(s.charAt(i));
            }
        }

        return newString.toString();
    }

    /**
     * Task 68 - Exclamation marks series: Remove n exclamation marks in the sentence from left to right
     * @param sc Variable for receive data
     */
    public void task68(Scanner sc) {
        String st, newString;
        int number;

        System.out.print("Type a sentence a with exclamation marks (¡Hi!, Hi!, ¡¡¡Hi!!!): ");
        st = sc.nextLine();

        System.out.print("Type a number of exclamation marks you want remove: ");
        number = sc.nextInt();

        newString = remove(st, number);
        System.out.println("newString = " + newString);
    }
}
