package looping;

import java.util.Scanner;

public class Pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		//inspire from parttern_8
		
		for(int i=  1; i <=n; i++){
			for(int j = 1 ; j<=i ; j++){
				System.out.print("* ");
			}
			
			for(int k=1;k<=(n-i)*2 ;k++){
				System.out.print("  ");
			}
			
			for(int j = 1 ; j<=i ; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		//for lower part
		
		for(int i = n-1 ; i>=1 ; i--){
			for(int j = 1 ; j<=i ; j++){
				System.out.print("* ");
			}
			
			//for spaces	
			for(int k=1;k<=(n-i)*2 ;k++){
				System.out.print("  ");
			}
			
			for(int j = 1 ; j<=i ; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
