package HashTables;

public class Hash_Array_Implementation {

	// TODO Auto-generated method stub

	//private Employee[] hashtables;  // generating the arrays of employee
	private StoredEmployee[] hashtables;  // this stored employee is used bacoz of the get method so that the employee class must have the key value relation ship
	
	
	public Hash_Array_Implementation() {
		hashtables = new StoredEmployee[5]; 
		//hashtables = new Employee[5];// assgien the size of the employyee
	}

	public void put(String key, Employee employee){   // too add the employee object in the hasthable array
		int haskeyvalue = hashKey(key);
		
		//---------------------------------------------------------Linear Probing -----------------------
		//this is when there are multiple  same value key and place is already filled by another key
		if(occupid(haskeyvalue)){ // means it is already occupied place
			// checking for the last index 
			int stopIndex = haskeyvalue;
			if(stopIndex == hashtables.length){
				haskeyvalue = 0; // if the hashkey is at the last index then we have to start searching for empty spot from the begming.
			}else{
				haskeyvalue ++;
			}
			
			// now finding the free space
			while(occupid(haskeyvalue) && haskeyvalue !=stopIndex){
				haskeyvalue = ((haskeyvalue +1) % hashtables.length);
			}
		}
		
		////////////-------------------------------------------------------
		//if(hashtables[haskeyvalue] != null ){
		if(occupid(haskeyvalue)){	 // this is after finding all the places f there is still no empty place then show errror
			System.out.println("value already present in that key");
		}else{
			//hashtables[haskeyvalue] = employee;
			hashtables[haskeyvalue] = new StoredEmployee(key, employee);
		}
	}
	
	public Employee get(String key){  // to retrive with the key
		//int hashedkey = hashKey(key);
		int hashedkey = findKey(key);
		//get the correct index
		if(hashedkey == -1){
			return null;
		}else{
			return hashtables[hashedkey].employee;
		}
		//return hashtables[hashedkey];
	}
	
	
	public Employee remove(String key){
		int hashedKey = findKey(key);
		if(hashedKey == -1){
			return null; //  no employee at that index key
		}else{
			Employee toremove = hashtables[hashedKey].employee;
			//one bug is there that we are setting the current value null so that when we traveser to get tthe same size key we cant get the exact value
			//hashtables[hashedKey] = null;
			
			//so we are do the reshaping the hashtable
			hashtables[hashedKey] = null;
			StoredEmployee[] oldhashtabel = hashtables;
			hashtables = new StoredEmployee[oldhashtabel.length];  // this is we are removing the null values from the exsiting hash table
			for(int i =  0 ; i <oldhashtabel.length ; i++){
				if(oldhashtabel[i] != null){
					put(oldhashtabel[i].key, oldhashtabel[i].employee);
				}
			}
			
			return toremove;
		}
	}
	
	private int findKey(String key){
		int hashedKey = hashKey(key);
		if(hashtables[hashedKey] != null && hashtables[hashedKey].key.equals(key)) { // this is to get the corect key to store the employe matchtes the actual key present at thhat index... if not matches then we have to do the probing
			return hashedKey;
		}
		
		//do the probing if the key doesnt matches
		
			// checking for the last index 
			int stopIndex = hashedKey;
			if(stopIndex == hashtables.length){
				hashedKey = 0; // if the hashkey is at the last index then we have to start searching for empty spot from the begming.
			}else{
				hashedKey ++;
			}
			
			// now finding the free space
			while(hashtables[hashedKey] != null && hashedKey !=stopIndex  && !hashtables[hashedKey].key.equals(key) ){ // by this we find the correct match
				hashedKey = ((hashedKey +1) % hashtables.length);
			}
			
			// this is causig null pointer exception
/*			if(stopIndex == hashedKey){
				return -1;
			}else{
				return hashedKey;
			}*/
			
			if(hashtables[hashedKey] != null && hashtables[hashedKey].key.equals(key)){
				return hashedKey;
			}else{
				return -1;
			}
			
			
		}
		
		
	
	
	public void printHashTable(){  // to print the vaue t=with the help of key
		for(int i = 0 ; i < hashtables.length ; i ++){
			if(hashtables[i] == null){
				System.out.println("empty");
			}else{
				System.out.println(hashtables[i].employee);
			}
			
			//System.out.println(hashtables[i]);
		}
	}
	
	private int hashKey(String key){ // to get the index of array ith the help of key
		return key.length()% hashtables.length;
	}
	
	private boolean occupid(int hashedkey){
		boolean isOccupied = hashtables[hashedkey] != null;
		return isOccupied;
	}
	
	
}
