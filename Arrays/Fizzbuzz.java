package Arrays;

import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[]arr = new String[n+1];
		for(int i = 0; i <= n; i++) {
			if(i % 15 == 0) arr[i] = "fizzbuzz";
			else if(i % 3 == 0) arr[i] = "fizz";
			else if(i % 5 == 0) arr[i] = "buzz";
			else arr[i] = ""+i;
		}
		for(int i = 0; i <= n; i++) System.out.print(arr[i] + " ");
	}
}