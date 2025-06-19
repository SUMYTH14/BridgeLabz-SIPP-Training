package Methods;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		solve(sc.nextInt());
	}

	private static void solve(int n) {
		if(n < 0) System.out.println("negative");
		else if(n > 0)System.out.println("positive");
		else System.out.println("zero");
	}
}