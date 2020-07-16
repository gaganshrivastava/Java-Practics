package looping;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		//to find the length of digit
		int digittoatals = (int)Math.log10(n)+1;
		System.out.println("Total digits = " + digittoatals); 
		
		int a = n;
		int sum = 0;
		while (n > 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		System.out.println("Sum of " + a + " = " + sum);

		sc.close();
	}

}
