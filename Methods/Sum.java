package Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		
		System.out.println(solve(n));
	}

	private static int solve(int n) {
		int sum = n;
		while(n-- > 0) {
			sum += n;
		}
		return sum;
	}
}