

public class DateAge {

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
}