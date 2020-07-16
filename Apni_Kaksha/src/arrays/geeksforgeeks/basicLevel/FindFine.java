package arrays.geeksforgeeks.basicLevel;

import java.util.*;

public class FindFine {
	// question
	// Given an array of penalties P, an array of car numbers C, and also the
	// date D. The task is to find the total fine which will be collected on the
	// given date. Fine is collected from odd-numbered cars on even dates and
	// vice versa.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number of tst cases");
		int a = sc.nextInt();
		// int
		while (a > 0) {
			System.out.println("enter total length");
			int length = sc.nextInt();
			System.out.println("Enter the date");
			int date = sc.nextInt();
			int cars[] = new int[length];
			int pen[] = new int[length];
			System.out.println("Enter the cars");
			for (int i = 0; i < length; i++) {
				cars[i] = sc.nextInt();
			}

			System.out.println("Enter the penalties");
			for (int i = 0; i < length; i++) {
				pen[i] = sc.nextInt();
			}

			checkfine(cars, pen, date);
			a--;
		}

	}

	static void checkfine(int cars[], int pen[], int date) {
		// check dates
		boolean isdateeven = false;
		if (date % 2 == 0) {
			isdateeven = true;
		}
		int fine = 0;
		if (isdateeven) {
			for (int i = 0; i < cars.length; i++) {
				if (cars[i] % 2 != 0) {
					// cars is odd
					fine += pen[i];
				}
			}
		} else {
			for (int i = 0; i < cars.length; i++) {

				if (cars[i] % 2 == 0) {
					// cars is even
					fine += pen[i];
				}

			}
		}

		System.out.println( "Total fine is = " + fine);
		System.out.println();
	}
}
