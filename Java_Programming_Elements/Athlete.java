import java.util.Scanner;

public class Athlete {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
//		double d = sc.nextInt();
//		double h = sc.nextInt();
		
		System.out.println("The total number of rounds the athlete will run is " + (5/(s1+s2+s3)) + " to complete 5 km");
	}
}