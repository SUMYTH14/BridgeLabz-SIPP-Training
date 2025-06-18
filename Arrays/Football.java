package Arrays;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[]arr = new double[11];
		int i = 0;
		double sum = 0;
		while(i < 11) {
			int a = sc.nextInt();
			sum += a;
			arr[i++] = a;
		}
		System.out.print(sum/11);
	}
}