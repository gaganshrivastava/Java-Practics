package introduction;
import java.util.*;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		/*int x = sc.nextInt();
		String c = sc.nextLine();
	
		System.out.println("I have given int= " + x);
		System.out.println("I have given String= " + c);*/
		
		//find simple interest with user input
		int prinical = sc.nextInt();
		float rate = sc.nextFloat();
		byte time = sc.nextByte();
		
		float simpleInterest = (prinical* rate * time )/100 ;
		
		System.out.println("Simple interest is = " + simpleInterest);
		
		sc.close();
		
	}

}
