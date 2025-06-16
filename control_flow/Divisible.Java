import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int t = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		
		if(a % 5 == 0)System.out.println("yes");
		else System.out.println("no");
	}
}