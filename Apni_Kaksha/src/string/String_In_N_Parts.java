package string;

public class String_In_N_Parts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Gagan is a very bad person.";
		int length = a.length();
		int parts = 3;
		int position = 0;
		int onePart = length/parts;
		char substring[][] = new char[parts][onePart];
		System.out.println("Original String is ");
		System.out.println(a);
		System.out.println();
		for(int j = 0 ; j<parts;j++){
			
			for(int i = 0;i<onePart;i++){
				substring[j][i] = a.charAt(position);
				position++;
				
			}
		
		}
		System.out.println("After dividinng string into " + parts + " parts");
	
		for(char s[] : substring){
			for(char x:s){
				System.out.print(x);
			}
			System.out.println();
		}
		
		
		//better solution is in:
		//https://www.javatpoint.com/java-program-to-divide-a-string-in-n-equal-parts
		
		
	}

}
