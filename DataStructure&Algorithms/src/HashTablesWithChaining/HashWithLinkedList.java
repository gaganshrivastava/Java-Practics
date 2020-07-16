package HashTablesWithChaining;

import java.util.*;

public class HashWithLinkedList {

	private LinkedList<StoredEmployee>[] hashtable; // hashmap is of type linked
													// list

	public HashWithLinkedList() {
		hashtable = new LinkedList[10]; // in every linked list there is a
										// linked list
		for (int i = 0; i < hashtable.length; i++) {
			hashtable[i] = new LinkedList<StoredEmployee>();
		}

	}

	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);

		hashtable[hashedKey].add(new StoredEmployee(key, employee));

	}

	public Employee get(String key) {
		int hashedKey = hashKey(key);

		StoredEmployee myEmployee = null;
		ListIterator<StoredEmployee> itr = hashtable[hashedKey].listIterator();
		while (itr.hasNext()) {
			myEmployee = itr.next();
			if (myEmployee.key.equals(key)) {
				return myEmployee.employee;
			}
		}
		//return myEmployee.employee;
		return null;
	}
	
	
	public Employee remove(String key){
		int hashedKey = hashKey(key);
		
		StoredEmployee toRemove = null;
		ListIterator<StoredEmployee> itr = hashtable[hashedKey].listIterator();
		
		int index = -1;
		while(itr.hasNext()){
			toRemove = itr.next();
			index++;
			if(toRemove.key.equals(key)){
				//break;
				hashtable[hashedKey].remove(toRemove);
				return toRemove.employee;
			}
		}
	/*	
		if(toRemove.employee == null || !toRemove.key.equals(key)){
			return null;
		}else{
			//hashtable[hashedKey].remove(toRemove);
			hashtable[hashedKey].remove(index);
			return toRemove.employee;
		}*/
		
		return toRemove.employee;
		 
	}

	private int hashKey(String key) {
		return key.length() % hashtable.length;
	}
	
	
	public void printHashtable(){
		for(int i = 0 ; i < hashtable.length;i++){
			if(hashtable[i].isEmpty()){
				System.out.println("Empty at postion " + i );
			}else{
				ListIterator<StoredEmployee> itr = hashtable[i].listIterator();
				while(itr.hasNext()){
					System.out.print(itr.next().employee);
					System.out.print("-->");
				}
				System.out.println("null");
			}
		}
	}
}
