package control_flow;
import java.util.Scanner;

public class Fuzz {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		if(n % 15 == 0) System.out.println("fizzbuzz");
		else if(n % 3 == 0) System.out.println("fizz");
		else if(n % 5 == 0) System.out.println("buzz");
		else {
			while(n > 0) System.out.println(n);
		}
	}
}