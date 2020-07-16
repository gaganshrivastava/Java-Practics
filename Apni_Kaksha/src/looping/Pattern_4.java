package looping;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		* * * * * * 
		  * * * * * 
		    * * * * 
		      * * * 
		        * * 
		          * 

	*/	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		// for space :: 2(i-1) >>( current row -1)
		// for * :: n - i +1 >> number of rows - current row + 1
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (i - 1); j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= (n - i + 1); j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		
		sc.close();

	}

}
