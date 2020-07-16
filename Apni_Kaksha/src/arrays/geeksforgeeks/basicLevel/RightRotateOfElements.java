package arrays.geeksforgeeks.basicLevel;

public class RightRotateOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int numberOfBits = 2;
		
		for(int j = 0 ; j<= numberOfBits;j++){
			int last = a[a.length-1];
			for(int i = a.length-1 ; i>0;i--){
				a[i] = a[i-1];
			}
			a[0] = last;
			
			System.out.println("After shifting " + j + "th  bits");
			for(int x : a){
				System.out.print(x + " ");
			}
			System.out.println();
			
		}
		
			

}
}