package arrays.geeksforgeeks.basicLevel;

import java.util.*;
import java.lang.*;
import java.io.*;

public class NumberOfOccurrence {

	/* package whatever //do not write package name here */

	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		while (n > 0) {
			int total = sc.nextInt();
			int num = sc.nextInt();
			int a[] = new int[total];

			for (int i = 0; i < total; i++) {
				a[i] = sc.nextInt();
			}
			int count = 0;
			for (int i = 0; i < total; i++) {
				if (a[i] == num)
					count++;
			}

			if (count != 0)
				System.out.println(count);
			else
				System.out.println(-1);
			n--;
		}

	}

}
