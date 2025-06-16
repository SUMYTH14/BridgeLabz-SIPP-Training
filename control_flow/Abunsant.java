package control_flow;
import java.util.Scanner;

public class Abunsant {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int pow = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		int sum = 1;
		for(int i = 2; i < n; i++) if(n % i == 0) sum += i;
		if(sum > n) System.out.println("abundant number");
		else System.out.println("not a abundant number");
	}
}