package arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[5];
		int b[] = {10,12,14,15,14};
		/*
		int[] marks,classes = new int[5];
		int marks[],classes[] = new int[5];*/
		
		System.out.println( "default value " + a[0]);
		System.out.println( "length of a is  " + a.length);
		
	
		System.out.println( "address of a[0] is = " + a );
		System.out.println( "address of a[3] is = " + a + 3*4);
		System.out.println();
		
		for(int i=0 ; i<a.length; i++){
			a[i] = i;
		}
		
		for(int i=0 ; i<a.length; i++){
			System.out.println( " values of a  after inizilise is " + a[i]);
		}
		
		//for 2 D arrays
		
		System.out.println("Printing 2d array");
		
		int twod[][] = new int[2][2];
		twod[0][0]= 0;
		twod[0][1]= 1;
		twod[1][0]= 2;
		twod[1][1]= 3;
		
		System.out.println();
		System.out.println(twod);
		
		for(int[] ab: twod){
			System.out.println(ab.length);
			System.out.println(ab[1]);
			
		}
		System.out.println();
		for(int[] ab: twod){
			for(int x:ab){
				System.out.print(x + "   "  );
				
			}
			System.out.println();
		}
	}
	
	
	

}
