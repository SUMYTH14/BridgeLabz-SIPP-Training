package control_flow;
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		
		if(n > 0)System.out.println("positive");
		else if(n == 0) System.out.println("zero");
		else System.out.println("negative");
	}
}