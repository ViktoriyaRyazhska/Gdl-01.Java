import java.io.BufferedReader;
import java.io.IOException;

public class JennysMessage {

    public static String taskFive(String name) {

        String msg = "Hello ";
        if (name.equals("Jhonny")) {
            msg = "Hello my love, my dear Jhonny";
        } else
            msg = msg + name;
        return msg;
    }
}