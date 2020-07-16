package introduction;

import java.util.Scanner;

public class Binary2Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner binary = new Scanner(System.in);
		String number = binary.nextLine();
		
		//binary to decimal 
		int decimal = Integer.parseInt(number, 2);
		
	
		System.out.println("Decimal of "+ number +  " is = " + decimal);
		
	
		String b2 = Integer.toBinaryString(decimal);
		System.out.println("Binary of same is = " + b2);
		
		binary.close();

	}

}
