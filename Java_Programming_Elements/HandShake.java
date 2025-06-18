package java_programming_elements;
import java.util.Scanner;

public class HandShake {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		double d = sc.nextInt();
//		double b = sc.nextInt();
//		int q = sc.nextInt();
		System.out.println((n*(n-1))/2);
	}
}