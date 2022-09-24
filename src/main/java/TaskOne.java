import java.util.Scanner;

public class TaskOne implements Execution{

int a;
int b;

private static void input(Scanner sc, int a){
    System.out.println("Type a: ");
   a= sc.nextInt();
}
    @Override
    public void execution(Scanner sc) {
input(sc, a);
input(sc, b);
        System.out.println("Area: " + getArea(a, b));
    }

    public static int getArea(int a, int b) {
    return a*b;
    }
}
