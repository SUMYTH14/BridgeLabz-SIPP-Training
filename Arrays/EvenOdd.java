package Arrays;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int e = n/2;
		int o = n-e;
		int[]even = new int[e];
		int[]odd = new int[o];
		int i = 0 , j = 0;
		for(int k = 1; k <= n; k++) {
			if(k % 2 == 0) even[i++] = k;
			else odd[j++] = k; 
		}
        for(i = 0; i < e; i++) System.out.println(even[i]);
		for(i = 0; i < o; i++) System.out.println(odd[i]);
	}
}