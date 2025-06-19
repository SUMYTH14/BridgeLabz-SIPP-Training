package Methods;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[]age = new int[10];
		for(int i = 0; i < 10; i++) age[i] = sc.nextInt();
		solve(age);
	}

	private static void solve(int[] age) {
		for(int i = 0; i < 10; i++) {
			if(age[i] >= 18) System.out.println("can vote");
			else System.out.println("cannot vote");
		}
	}
}