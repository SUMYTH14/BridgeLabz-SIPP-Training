package Arrays;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int pow = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		int[]arr = new int[10];
		int i = 0;
		while(i < 10) {
			int a = sc.nextInt();
			if(a <= 0) break;
			arr[i++] = a;
		}
		for(int j = 0; j < i; j++) System.out.print(arr[j] + " ");
	}
}