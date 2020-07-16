package looping;

import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	
		int n =sc.nextInt();
		int a =0;
		int b = 1;
		int sum =0;
		
		System.out.println("Fabonacii Series is :");
		System.out.print(a + " " );
		System.out.print(b + " " );
		
		for (int i=1 ; i<= n-2 ; i++){
			
			sum = a+b;
			a = b;
			b = sum;
					
			System.out.print(sum + " " );
			
			
			
		}
		sc.close();
	}

}
