package Arrays;

import java.util.Scanner;

public class AgeHeight {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[]age = new int[3];
		int[]height = new int[3];
		for(int i = 0; i < 3; i++) age[i] = sc.nextInt();
		for(int i = 0; i < 3; i++) height[i] = sc.nextInt();
		int a = 0 , h = 0;
		for(int i = 1; i < 3; i++) if(age[i] > age[a]) a = i;
		for(int i = 1; i < 3; i++) if(height[i] > height[h]) h = i;
		System.out.println(a + " " + h);
	}
}