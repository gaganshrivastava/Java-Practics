package arrays;

public class PalindromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {111,222,333,444,1515};
		
		boolean isPalindrom = false;

		for(int i = 0 ; i < a.length;i++){
			int num = a[i];
			int rev= 0;
			int remdender = 0;
			while(num> 0){
				remdender = num %10;
				 rev = rev*10 + remdender;
				 num= num/10;
			}

			if(a[i] == rev){
				isPalindrom = true;
			}else{
				isPalindrom = false;
				break;
			}
		
		}
		
		if(isPalindrom){
			System.out.println(" Array is palindrom array");
		}else{
			System.out.println(" Array is not palindrom array");
		}

	}

}
