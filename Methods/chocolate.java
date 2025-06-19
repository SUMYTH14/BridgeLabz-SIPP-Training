package Methods;

import java.util.Scanner;

public class chocolate {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		solve(sc.nextInt() , sc.nextInt());
	}

	private static void solve(int n, int m) {
		System.out.println(n/m);
		System.out.println(n%m);
	}
}