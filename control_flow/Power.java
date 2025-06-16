package control_flow;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pow = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		int res = 1;
		for(int i = 1; i <= pow; i++) res *= num;
		System.out.println(res);
	}
}