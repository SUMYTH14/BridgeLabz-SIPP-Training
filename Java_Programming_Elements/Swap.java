package java_programming_elements;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a;
		a = b;
		b = c;

		System.out.println("The swapped values are " + a + " and " + b);
	}
}