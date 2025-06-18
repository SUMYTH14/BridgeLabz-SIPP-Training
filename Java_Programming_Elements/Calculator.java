package java_programming_elements;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int c = sc.nextInt();
		double a = sc.nextInt();
		double b = sc.nextInt();
//		int b = sc.nextInt();
		System.out.println("addition-" + (a+b) + " subtraction-" + (a-b) + " multiplication-" + (a*b) + " division-" + (a/b));
	}
}