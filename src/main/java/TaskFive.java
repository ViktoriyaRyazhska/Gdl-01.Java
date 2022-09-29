
import java.util.*;

public class TaskFive {

    /**
     * Function to send a greeting to users but has a special message to Jhonny
     */

    public static String taskFive(String name) {

        System.out.println("Let's greet!    Insert your name");

        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();

        String msj = "Hello ";
        if (name.equals("Jhonny")) {
            msj = "Hello my love, my dear Jhonny";
        } else
            msj = msj + name;
        return msj;
    }

    /**
     * Function to calculate the top and bottom recommended ages to date according the users age
     *
     * @param age_u contains the users age
     */
    public static String taskThirdteen(int age_u) {


        int max = 0;
        int min = 0;

        if (age_u <= 14) {
            min = age_u - (age_u / 10);
            max = age_u + (age_u / 10);
        } else if (age_u <= 99) {
            min = (age_u / 2) + 7;
            max = (age_u - 7) * 2;

        }

        String text_l = "You should consider date with people as top " + max + " years old";
        String text_h = "You should not date with people under the " + min + " years old";
        return text_l + "\n" + text_h;


    }