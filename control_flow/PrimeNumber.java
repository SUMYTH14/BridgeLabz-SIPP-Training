package control_flow;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int pow = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		boolean b = true;
		for(int i = 2; i < n; i++) if(n % i == 0) b = false;
		if(b) System.out.println("prime number");
		else System.out.println("not a prime number");
	}
}