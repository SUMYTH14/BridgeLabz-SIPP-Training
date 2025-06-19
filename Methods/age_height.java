package Methods;

import java.util.Scanner;

public class age_height {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[]age = new int[3];
		for(int i = 0; i < 3; i++) age[i] = sc.nextInt();
		int[]height = new int[3];
		for(int i = 0; i < 3; i++) height[i] = sc.nextInt();
	
		solve(age , height);
		
	}

	private static void solve(int[] age , int[] height) {
		int a = 0;
		for(int i = 1; i < 3; i++) if(age[i] > age[a]) a = i;
		int b = 0;
		for(int i = 1; i < 3; i++) if(height[i] > height[a]) a = i;
		System.out.println("age - " + age[a]);
		System.out.println("height - " + height[b]);
	}
}