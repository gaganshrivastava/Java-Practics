package looping;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter Second number");
		int b = sc.nextInt();
		System.out.println("Enter the operation");
		
		//this is because when we take string input after the int input and pressing the 
		//enter then automtically it will take the string input well
		
		//so for that we are adding one extra string input
		//this is the case only when we take int first then string.
		sc.nextLine();
		//to get the character of index 0, line starts with index 0.
		char operation = sc.nextLine().charAt(0);
		int result = 0;
		
		switch(operation){
		case '+' :
			result = a+b ;
			break;
			
		case '-' :
			result = a-b;
			break;
		
		case '*':
			result = a*b;
			break;
		case '/':
			result = a/b;
			break;	
		default : 
			System.out.println("Invalid number");
		
		}
		
		
		System.out.println("Result = " + result);
		sc.close();
		
	}

}
