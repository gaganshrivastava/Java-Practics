package arrays;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating 2 d array with 5 rows and 3 colnms
		// 5 array of one D which have the size 3
		//every elements has size 3
		int a[][]= new int[5][3];
		
		//initizaltion
		int b[][] = {{1,2,3,4,5,6},
				{1,2,3},
				{1,2,3},
				{1,2,3}};
		//System.out.println(a[4][2]);
		
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		int x[] = b[0];
		System.out.println("x =  " + x[3]);
		
		int[][] D2 = {
	            {1, -2, 3}, 
	            {-4, -5, 6, 9}, 
	            {7}, 
	        };
	      System.out.println();
	        // first for...each loop access the individual array
	        // inside the 2d array
	        for (int[] innerArray: D2) {
	            // second for...each loop access each element inside the row
	            for(int data: innerArray) {
	                System.out.print(data + "  ");
	            }
	            System.out.println();
	        }
		
	}

}
