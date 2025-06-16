package control_flow;
import java.util.Scanner;

public class GreatestFacotr {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		
		int i = n-1;
		while(i > 1) {
			if(n % i == 0) {
				break;
			}
			i--;
		}
		System.out.println(i);
	}
}