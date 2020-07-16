package Recursion;

public class PowerOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2, b = 5;
		int p=1;
		while(b>=1){
			p =  p*a;
			b--;
		}
		//System.out.println("Product is " + p);
		
		
		//System.out.println(powerOf(a, 5));
		
		System.out.println(fastPower(2, 4));

	}

	public static int powerOf(int a, int b){
		int p=1;
		
	/*	if(b==1)
			return a;*/
		if(b==0){
			return 1;
		}else if(b<0){
			return -1;
		}
		
		p = a * powerOf(a, b-1);
		
		return p;
	}
	
	static int fastPower(int a, int b){
		System.out.println( b);
		int p = 1;
		if(b== 0){
			return 1;
		}
		
		if(b%2 == 0) {
			
			p = powerOf(a*a, b/2);
	
			return p;
		}
		
		
		// this is when b is odd 
		p = a* powerOf(a, b-1);
		return p ;
	}
	
}
