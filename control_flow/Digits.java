package control_flow;
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int pow = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		int k = n;
		int sum = 0;
		while(k > 0) {
			int rem = k % 10;
			k /= 10;
			sum++;
		}
		
		System.out.println(sum);
	}
}