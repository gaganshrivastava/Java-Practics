package looping;

public class Pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		question ::
			
			0
			909
			89098
			7890987
			678909876
			56789098765
			4567890987654
			345678909876543
			23456789098765432
			1234567890987654321
		
		*/
		//incomplete
		int n = 10;
		
		for(int i = 1;i<=n;i++){
			for(int j=1;j<=2*i-1 ; j++){
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
				

	}

}
