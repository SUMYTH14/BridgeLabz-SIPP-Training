package Methods;

import java.util.Scanner;

public class Spring {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		solve(sc.nextInt() , sc.nextInt());
		
	}

	private static void solve(int month , int date) {
		if((month == 6 && date < 21) || (month == 3 && date > 19) || (month > 3 && month < 6))System.out.println("Its a Spring Season");
		else System.out.println("Not a Spring Season");
	}
}