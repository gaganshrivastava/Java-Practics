package arrays.geeksforgeeks.basicLevel;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SegregateEvenandOddnumbers {
	// queston
	// Given an array A[], write a program that segregates even and odd numbers.
	// The program should put all even numbers first in sorted order, and then
	// odd numbers in sorted order.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 12, 34, 45, 9, 8, 90, 3 };
		int n = a.length;
		Arrays.sort(a);
		int b[] = new int[n];
		int ec = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				ec++;
			}
		}
		
		System.out.println(ec + " ec cout");
		for (int i = 0, j = ec, k = 0; i < n ;i++) {
			if (a[i] % 2 == 0) {
				b[k] = a[i];
				k++;
			} else {
				b[j] = a[i];
				j++;
			}
		}

		for (int x : b) {
			System.out.print(x + " ");
		}
	}

}
