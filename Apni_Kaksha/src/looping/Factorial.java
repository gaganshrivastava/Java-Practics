package looping;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int result = 1;
		for(int i =a ; i > 1 ; i--){
		result = result *i;
	
		}
		System.out.println("Factorial of " + a + " is " + result);
		sc.close();
		
		System.out.println();
		System.out.println("Factorial of " + a + " is " + fact(a));
		
	}

	public static int  fact(int a){
		int p = 1;
		if(a==1) return a;
		
		p = a*fact(a-1);
		
		return p;
	}
}
