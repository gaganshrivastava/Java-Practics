package Recursion;

public class SumOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		
		int sum = 0;
		for(int i = 1; i <= n;i++){
		sum = sum+i;	
		}
		
		System.out.println("Sum = " + sum);
		
		System.out.println(sumOfN(n));

	}
	
	//by recursion
	public static int sumOfN(int a){
		int sum = 0;
		if(a==1)
			return 1;
		
		sum = a + sumOfN(a-1);
		return sum;
	}

}
