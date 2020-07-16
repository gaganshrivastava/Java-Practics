package looping;

import java.util.Scanner;

public class Pattern_11 {
/*
	1           1 
	  2       2 
	    3   3 
	      4 
	    3   3 
	  2       2 
	1           1 
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=(2*n)-i;j++){
				if(i==j || j == 2*n-i){
					System.out.print(i+" ");
				}else{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		//for lower part
		for(int i=n-1;i>=1;i--){
			for(int j = 1;j<=(2*n)-i;j++){
				if(i==j  || j== (2*n)-i){
					System.out.print(i+" ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
				
sc.close();
	}

}
