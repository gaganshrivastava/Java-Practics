package looping;

import java.util.Scanner;

public class SerisSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		// 1 + 1/2 +1/3 +1/4
		float sum = 0f;
		for (float i = 1f; i <= n; i++) {
			sum = sum + (1 / i);
		}
		
		
		//1 - 1/2 + 1/3 -1/4
		System.out.println("sum = " + sum);
		float c = 0f;
		for (float i = 1f; i <= n; i++) {
			if (i % 2 == 0) {
				c = c - (1 / i);
			} else {
				c = c + (1 / i);
			}
		}
		System.out.println("sum of alternate = " + c);
		sc.close();
	}

}
