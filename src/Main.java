import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner function = new Scanner(System.in);
        System.out.print("What Function Do You Need(add, subtract, multiply): ");
        String func = function.next();

        if(Objects.equals(func, "add")) {
            Scanner value1 = new Scanner(System.in);
            Scanner value2 = new Scanner(System.in);
            System.out.print("Enter values: ");

            int a = value1.nextInt();
            int b = value2.nextInt();

            int total = calFunctions.add(a,b);

            System.out.println("Total is: " + total);
        } else if (Objects.equals(func, "subtract")) {
            Scanner value1 = new Scanner(System.in);
            Scanner value2 = new Scanner(System.in);
            System.out.print("Enter values: ");

            int a = value1.nextInt();
            int b = value2.nextInt();

            int total = calFunctions.subtract(a,b);

            System.out.println("Total is: " + total);
        } else if (Objects.equals(func, "multiply")) {
            Scanner value1 = new Scanner(System.in);
            Scanner value2 = new Scanner(System.in);
            System.out.print("Enter values: ");

            int a = value1.nextInt();
            int b = value2.nextInt();

            int total = calFunctions.multiply(a,b);

            System.out.println("Total is: " + total);
        } else {
            System.out.println("No data");
        }

    }
}