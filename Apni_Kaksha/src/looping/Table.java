package looping;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		System.out.println("Table of " + a + " : ");
		int result = 0;
		for (int i = 1 ; i <=10 ; i++ ){
			result = a*i;
			System.out.println( a + " * " + i + " = " +  result );
		}
		
		
		System.out.println("Comlete table upto 10 ");
		
		for(int b = 1; b<=10; b++){
			for(int i = 1 ; i<=20 ; i++){
				System.out.print(i*b + "   ");
			}
			System.out.println();
		}
		sc.close();
	}

}
