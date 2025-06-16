package control_flow;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		for(int i = 1; i <= 10; i++) System.out.println(n  + " * " + i + " = " + n*i);
	}
}