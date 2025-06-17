import java.util.Scanner;

public class DividePen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int c = sc.nextInt();
//		int Kilometers = sc.nextInt();
//		int b = sc.nextInt();
		int p = 14;
		System.out.println("The Pen Per Student is " + (p/3) + " and the remaining pen not distributed is " + (p%3));
	}
}