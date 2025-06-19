package Methods;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		solve(sc.nextInt());
		
	}

	private static void solve(int n) {
		for(int i = 2; i <= n; i++) if(n % i == 0) System.out.println(i);;
	}
}