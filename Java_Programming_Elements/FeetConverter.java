import java.util.Scanner;

public class FeetConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int c = sc.nextInt();
		double d = sc.nextInt();
//		double b = sc.nextInt();
//		int b = sc.nextInt();
		System.out.println("Your Height in cm is " + (d*12*2.4) + " while in feet is " + (d) + "  and inches is " + (d*12));
	}
}