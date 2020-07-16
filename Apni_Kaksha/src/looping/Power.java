package looping;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base number");
		int a =sc.nextInt();
		System.out.println("Enter the power number");
		int b =sc.nextInt();
		
		int result = a;
		for(int i = 1 ; i< b ; i++ ){
			result = result*a;
			
		}
		System.out.println("Power is " + result);
		sc.close();
	}

}
