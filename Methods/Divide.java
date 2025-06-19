package Methods;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		solve(sc.nextInt() , sc.nextInt());
	}

	private static void solve(int a, int b) {
		System.out.println(a/b);
		System.out.println(a%b);
	}
}