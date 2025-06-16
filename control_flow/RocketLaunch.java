package control_flow;
import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: starting countdown number
        System.out.print("Enter the starting number for countdown: ");
        int counter = scanner.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Final launch message
        System.out.println("🚀 Rocket Launched!");

        scanner.close();
    }
}
