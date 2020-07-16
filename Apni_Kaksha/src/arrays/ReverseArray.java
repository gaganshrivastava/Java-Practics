package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4};
		int b[] = new int[a.length];
		
		System.out.print(" Original number of array is ");
		for(int xv: a){
			System.out.print(xv);
		}
	
		int j=0;
		int i = a.length-1 ;
		while(i>=0 && j<b.length){
			b[j]=a[i];
			i--;
			j++;
			
		}
		
		System.out.println();
		System.out.print(" Reverse of array is ");
		for(int x: b){
			System.out.print(x);
		}
	}

}
