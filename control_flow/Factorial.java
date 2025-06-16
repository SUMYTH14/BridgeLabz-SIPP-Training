package control_flow;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1;
            long factorial = 1;

            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}
