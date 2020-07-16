package HashTablesWithChaining;

public class HashFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2521,52,20,-45,69};
		
		int bucket[] = new int[10];
		
		for(int i = 0 ; i < a.length;i++){
			bucket[hashKey(a[i])] = a[i];
		}

		
		for(int x : bucket){
			System.out.println(x);
		}
	}
	
	public static int hashKey(int value){
		
		return Math.abs(value%10); // hashing from the unit places digit
	}

}
