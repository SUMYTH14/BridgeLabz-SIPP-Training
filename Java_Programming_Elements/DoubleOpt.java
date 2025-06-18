package java_programming_elements;
import java.util.Scanner;

public class DoubleOpt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double o1 = a + b*c;
		double o2 = a*b + c;
		double o3 = c + a/b;
		double o4 = a%b + c;
		System.out.println("The results of Int Operations are " + o1 + " " + o2 + " " + o3 + " " + o4);
	}
}