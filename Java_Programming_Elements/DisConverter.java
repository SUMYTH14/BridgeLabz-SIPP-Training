import java.util.Scanner;

public class DisConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int b = sc.nextInt();
		double d = sc.nextInt();
//		double h = sc.nextInt();
//		int h = sc.nextInt();
		System.out.println("The distance in yards is " + (d/3) + " while the distance in miles is " + (d/(3*1760)));
	}
}