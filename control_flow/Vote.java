package control_flow;
import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		
		if(n > 18)System.out.println("can vote");
		else System.out.println("cannot vote");
	}
}