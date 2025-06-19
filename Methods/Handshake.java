package Methods;

import java.util.Scanner;

public class Handshake {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println(solve(sc.nextInt()));
	}

	private static int solve(int a) {
		return (a*(a-1))/2;
	}
}