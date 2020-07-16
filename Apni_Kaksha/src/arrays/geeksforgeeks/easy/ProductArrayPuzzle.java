package arrays.geeksforgeeks.easy;

public class ProductArrayPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10, 3 ,5 ,6 ,2};
		
		int b[] = new int[a.length];
		
		for(int i=0;i<a.length; i++){
			int p = 1;
			for(int j= 0; j<a.length ; j++){
				if(a[j] != a[i]){
					p = p*a[j];
				}
			}
			b[i] = p;
		}
		
		for(int x : b){
			System.out.print(x + " ");
		}
	}

}
