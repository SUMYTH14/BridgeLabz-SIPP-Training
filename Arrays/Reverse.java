package Arrays;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int[]arr = new int[s.length()];
		int j = s.length()-1;
		for(int i = 0; i < s.length(); i++) arr[j--] = s.charAt(i);
		for(int i = 0; i < arr.length; i++) System.out.println(arr[i]);
	}
}