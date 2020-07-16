package SortingAlgorithims;

public class BubbleSort {
	static int steps  = 0; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {55,32,14,6,-22,-10,-22};
		int n = a.length;
		
		// its a stable sort
		for(int i = 0; i<a.length -1; i++){ // outer loop wil tell ho many times it have to u
			for(int j=0;j<n -1 -i; j++){ // inner loop is doing he sorting // and after each iteration max number is at the right side.. it sort in the backward direction.
				if(a[j+1] < a[j] ){
					steps++;
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
			System.out.println("steps = " + steps);
			
		}
		
		System.out.println(" final steps = " + steps);
		for(int x : a){
			System.out.print( x + " ");
		}
	}

	
}
