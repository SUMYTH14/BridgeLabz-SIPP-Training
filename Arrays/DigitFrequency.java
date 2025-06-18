package Arrays;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		
		int[]arr = new int[10];
		while(n > 0) {
			int rem = n%10;
			arr[rem]++;
			n /= 10;
		}
		
		for(int i = 0; i < 10; i++) System.out.print(i + " freq - " + arr[i]);
	}    
}