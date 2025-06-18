package Arrays;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int pow = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		int fac = 0;
		for(int i = 1; i <= n; i++) if(n % i == 0) fac++;
		int[]arr = new int[fac];
		int j = 0;
		for(int i = 1; i <= n; i++) if(n % i == 0) {
			arr[j++] = i;
			System.out.print(i + " ");
		}
	}
}