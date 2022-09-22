import java.util.Scanner;

public class TaskOne implements Execution{


    @Override
    public void execution(Scanner sc) {

        System.out.println("Type a: ");
        final int a = sc.nextInt();

        System.out.println("Type b: ");
        final int b = sc.nextInt();

        System.out.println("Area: " + b*a);
    }
}
