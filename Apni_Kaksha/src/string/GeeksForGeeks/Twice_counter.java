package string.GeeksForGeeks;

import java.util.*;

//question
//Given an array of n words. Some words are repeated twice, we need count such words
public class Twice_counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "hate love peace love peace hate love peace love peace";

		// char c[] = a.toCharArray();
		String c[] = a.split(" ");
		int count = 0;
		int x[] = new int[c.length];

		for (int i = 0; i < c.length - 1; i++) {
			count = 1;
			x[i] = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i].equals(c[j]) & x[j] != -1) {
					c[j] = "";
					x[i] = x[i] + 1;
					x[j] = -1;
					count++;
				}
			}

			if (count > 1 & c[i] != "") {
				System.out.println(c[i] + " Occurs " + count + " times");
			}

		}
		int twiceNumber = 0;
		for (int f : x) {
			if (f == 2) {
				twiceNumber++;
			}

		}
		System.out.println(twiceNumber);
	}
}
