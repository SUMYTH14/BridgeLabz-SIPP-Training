package Methods;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println(solve(sc.nextInt() , sc.nextInt() , sc.nextInt()));
	}

	private static int solve(int a, int b, int c) {
		if(a > b && a > c) return a;
		else if(b > a && b > c) return b;
		return c;
	}
}