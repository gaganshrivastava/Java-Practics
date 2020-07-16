package arrays;

public class CheckIdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 0, 0 }, { 0, 1, 1 }, { 0, 0, 1 } };
		boolean identity = false, breakflag = false;

		for (int i = 0; i < a.length; i++) {
			
			if (!breakflag) {
				for (int j = 0; j < a[0].length; j++) {
					identity = false;
					if (i == j) {
						if (a[i][j] == 1) {
							identity = true;
						} else {
							breakflag = true;
							identity = false;
							break;
						}
					} else {
						if (a[i][j] == 0) {
							identity = true;
							
						} else {
							breakflag = true;
							identity = false;
							break;
						}
					}

				}
			}
		}
		if(identity){
			System.out.println("GIven matrix is  a identity matrix");
		}else
			System.out.println("GIven matrix is not a identity matrix");
		
	}

}
