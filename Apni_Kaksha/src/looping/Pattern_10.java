package looping;

import java.util.Scanner;

public class Pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		* 0 0 0 * 0 0 0 * 
		0 * 0 0 * 0 0 * 0 
		0 0 * 0 * 0 * 0 0 
		0 0 0 * * * 0 0 0 
		
	*/	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int n= sc.nextInt();
		
		for(int i= 1;i<=n;i++){
			//for first part  right angle triangle
			for(int j = 1; j<=i;j++){
				if(i==j){
					System.out.print("* ");
				}else{
					System.out.print(0 + " ");
				}
			}
			
		//	to use this loop comment the first and third loop
		/*	for(int j = 1; j<=i;j++){
				System.out.print("  ");
			}*/
			
			
			//for middle  inverse triangle
			
	
			for(int k=1;k<=2*(n-i)+1 ;k++){
				if(k == ((2*(n-i)+1 )+1)/2)
					System.out.print("* ");
				else
				System.out.print(0 + " ");
			}
			
			
			//for last traingle
			for(int j =1;j<=i;j++){
				if(j==1){
					System.out.print("* ");
				}else{
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
		
				
	}

}
