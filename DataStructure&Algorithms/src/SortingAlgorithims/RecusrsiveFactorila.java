	package SortingAlgorithims;

public class RecusrsiveFactorila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial(0));		

	}
	
	public static int factorial(int n){
		int fact = 1;
		 if(n <= 1)
			 return 1;
		 
		 fact =  n* factorial(n-1);
		 
		 return fact;
	}

}
