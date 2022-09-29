package com.softserve.sprintone.joceline;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Joceline
 */
public class TwoFighters {
    /**
     * This is task 16. This task is about a fight of two, user have to enter two fighters to have a winner!.
     *
     * @param bufferedReader to read values entered by user.
     */
    public void task16(BufferedReader bufferedReader){
        boolean loopCheck;
        do {
            loopCheck = false;
            try {
                System.out.println("Enter a name for the first fighter: ");
                String fighter1Name = bufferedReader.readLine();
                System.out.println("Enter the health for the first fighter: ");
                int fighter1Health = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Enter the damage per attack for the first fighter: ");
                int fighter1Damage = Integer.parseInt(bufferedReader.readLine());

                System.out.println("Enter a name for the second fighter: ");
                String fighter2Name = bufferedReader.readLine();
                System.out.println("Enter the health for the second fighter: ");
                int fighter2Health = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Enter the damage per attack for the second fighter: ");
                int fighter2Damage = Integer.parseInt(bufferedReader.readLine());

                int option;
                String firstAttacker = "";

                //This condition is to verify who is going to be the first to attack the other in the fight.
                do {
                    try {
                        System.out.println("Select the first attacker: \n1. " + fighter1Name + "\n2. " + fighter2Name);
                        option = Integer.parseInt(bufferedReader.readLine());

                        if (option == 1) {
                            firstAttacker = fighter1Name;
                        } else if (option == 2) {
                            firstAttacker = fighter2Name;
                        } else {
                            System.out.println("Select a valid one");
                        }
                    } catch (NumberFormatException numberFormatException) {
                        option = 0;
                        System.out.println("Enter a valid number");
                    }
                } while (!(option == 1 || option == 2));

                Fighter fighter1 = new Fighter(fighter1Name, fighter1Health, fighter1Damage);
                Fighter fighter2 = new Fighter(fighter2Name, fighter2Health, fighter2Damage);

                System.out.println(declareWinner(fighter1, fighter2, firstAttacker));

            } catch (IOException e) {
                loopCheck = true;
                System.out.println("Check your inputs");
            } catch (NumberFormatException numberFormatException) {
                loopCheck = true;
                System.out.println("Enter a valid answers");
            }
        } while (loopCheck);
    }

    /**
     * This method is used to get the winner of the fight checking the health of both.
     *
     * @param fighter1      It is the fighter one that the user choose.
     * @param fighter2      It is the fighter two that the user choose.
     * @param firstAttacker this is a String variable that the user select to choose un fighter to attack first.
     * @return it has to return the winner of the fight.
     */
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = "";
        Fighter first = fighter1;
        Fighter second = fighter2;

        if (firstAttacker.equals(fighter2.name)) {
            first = fighter2;
            second = fighter1;
        }
        while (first.health > 0 && second.health > 0) {
            if ((second.health -= first.damagePerAttack) >= 0) {
                System.out.println(first.name + " attacks " + second.name + "; " + second.name + " now has " + second.health + " health.");
                winner = first.name;
            }

            if ((first.health -= second.damagePerAttack) >= 0) {
                System.out.println(second.name + " attacks " + first.name + "; " + first.name + " now has " + first.health + " health.");
                winner = second.name;
            }
        }
        return winner;
    }

}

class Fighter {
    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}
