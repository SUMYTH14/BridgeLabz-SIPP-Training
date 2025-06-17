import java.util.Scanner;

public class Chocochild {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choco = sc.nextInt();
		int child = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		
		System.out.println("The number of chocolates each child gets is " + (choco/child) + " and the number of remaining chocolates is "+ (choco%child));
	}
}