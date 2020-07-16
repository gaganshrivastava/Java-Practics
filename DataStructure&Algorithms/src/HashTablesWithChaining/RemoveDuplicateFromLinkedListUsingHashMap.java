package HashTablesWithChaining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class RemoveDuplicateFromLinkedListUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//removing the duplicate age employee
		//age == id
			LinkedList<Employee> employeeList = new LinkedList<>();
			
			Employee e1 = new Employee("Gagan", "Male", 23);
			Employee e2 = new Employee("rohan", "Male", 24);
			Employee e3 = new Employee("mohan", "female", 223);
			Employee e4 = new Employee("pink", "Male", 26);
			Employee e5 = new Employee("arpita", "Male", 823);
			Employee e6 = new Employee("arpita", "Male", 823);
			
			employeeList.add(e1);
			employeeList.add(e2);
			employeeList.add(e3);
			employeeList.add(e4);
			employeeList.add(e5);
			employeeList.add(e6);
			
			
			HashMap<Integer, Employee> myHashtable = new HashMap<>();
			ListIterator<Employee> itr = employeeList.listIterator();  // to get tthe each employee obj
			List<Employee> toremovve = new ArrayList<Employee>();
			
			while(itr.hasNext()){
				Employee currentEmployee = itr.next();
				if(myHashtable.containsKey(currentEmployee.getAge())){
					toremovve.add(currentEmployee);
				}else{
					myHashtable.put(currentEmployee.getAge(), currentEmployee);
				}
			}
			
			System.out.println(toremovve);
			// to removing the emplouyye from the origina list
			employeeList.removeAll(toremovve);
			System.out.println(employeeList);
		

	}

}
