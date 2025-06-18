package Arrays;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[]arr = new int[5];
		for(int i = 0 ; i < 5; i++) arr[i] = sc.nextInt();
		int i = 0;
		while(i < 5) {
			if(arr[i] > 0) {
				if(arr[i] % 2 == 0) System.out.println("even");
				else System.out.println("odd");
			}
			else System.out.println(arr[i]);
		}
		if(arr[0] > arr[4]) System.out.println("greter");
		else if(arr[0] < arr[4]) System.out.println("small");
		else System.out.println("equal");
	}
}