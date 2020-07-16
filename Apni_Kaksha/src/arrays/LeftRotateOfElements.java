package arrays;

public class LeftRotateOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4};
		
		System.out.print( "Original number is ");
		for(int x: a){
			System.out.print(  x + " ");
		}
		
		System.out.println();
		//foe shift by one bit just remove the outer loop
		//left shift by n-1 bit
		for(int j=0 ; j< a.length-1;j++){
			int first=a[0];
			for(int i=1;i<a.length;i++){
				
				a[i-1]=a[i];
				
			}
			a[a.length-1] = first;
			
			System.out.print("after shifting by one byte ");
			for(int x: a){
				System.out.print( +x + " ");
			}
			
			System.out.println();
			
		}
		
		/*System.out.print("after shifting ");
		for(int x: a){
			System.out.print( +x + " ");
		}*/
		
		
				
		
	}

}
