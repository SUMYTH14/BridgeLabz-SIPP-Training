package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int pow = sc.nextInt();
//		int date = sc.nextInt();
//		int c = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		int[]arr = new int[n];
		for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		System.out.println(arr[n-1] + " " + arr[n-2]);
	}
}