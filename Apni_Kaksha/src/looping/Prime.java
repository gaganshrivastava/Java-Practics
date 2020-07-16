package looping;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		boolean isprime = false;
		int n = sc.nextInt();
		if (n > 0) {
			if ((n == 1 || n == 2)) {
				// System.out.println("enter number is prime");
				isprime = true;
			} else {

				// for(int i =2; i< n ; i++ ){
				for (int i = 2; i * i < n; i++) { // this is because factor ccan
													// be found before sqrt of n

					if (n % i == 0) {
						System.out.println("Enter number is not a prime number ");
						isprime = false;
						break;
					} else {
						isprime = true;
					}
				}
			}
		} else {
			System.out.println("enter a valid number");
		}

		if (isprime == true) {
			System.out.println("enter number is prime");
		}

		sc.close();
	}

}
