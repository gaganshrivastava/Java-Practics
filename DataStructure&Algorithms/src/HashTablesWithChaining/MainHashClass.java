package HashTablesWithChaining;

final class MainHashClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("Gagan", "Male", 23);
		Employee e2 = new Employee("rohan", "Male", 23);
		Employee e3 = new Employee("mohan", "female", 23);
		Employee e4 = new Employee("pink", "Male", 23);
		Employee e5 = new Employee("arpita", "Male", 23);
		
		HashWithLinkedList ht = new HashWithLinkedList();
		ht.put("gagan", e1);
		ht.put("rohan", e2);
		ht.put("mohan", e3);
		ht.put("pink", e4);
		ht.put("arpita", e5);
		
		ht.printHashtable();
		System.out.println();
		System.out.println(ht.get("rohan"));
		System.out.println();
		// now when we update the put  method then we a=can addd same size key in another position and same updation we have to make in the get method also.
		System.out.println(ht.get("moh"));
		System.out.println(ht.get("arp"));
		
		System.out.println();
		System.out.println("After removing");
		ht.remove("mohan");
		ht.printHashtable();
		
		System.out.println();
		System.out.println(ht.get("rohan"));
		System.out.println();
	}

}
