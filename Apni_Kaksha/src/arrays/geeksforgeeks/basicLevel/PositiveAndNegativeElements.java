package arrays.geeksforgeeks.basicLevel;

public class PositiveAndNegativeElements {
//questin
	//Given an array containing equal number of positive and negative elements, arrange the array such that every positive element is followed by a negative element.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-1, 2 ,-3, 4 ,-5 ,6};
		int b[] = new int[a.length];
		
		//System.out.println(Integer.MIN_VALUE);
		
		for(int i = 0, p = 0, n = 1 ; i < a.length; i++){
			if(a[i] > 0){
				b[p] = a[i];
				p+=2;
			}else{
				b[n] = a[i];
				n+=2;
			}
		}
		
		for(int x: b){
			System.out.print(x + " ");
		}

	}

}
