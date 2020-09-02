package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.dyanamic in nature
		// 2.can contain duplicate value
		// 3.maintain insertion order
		// 4.syncronised
		// 5.allow random access to fetch the element becuse it store the value
		// basis on index.

		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);

		System.out.println(ar.size());
		ar.add(40);
		ar.add(50);
		System.out.println(ar.size());
		ar.add(50);
		System.out.println(ar.size());
		System.out.println(ar.get(4));

		// to print all value from arraylist:
		// 1.for loop
		// 2.using iterartor

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// generic vs non genric

		ArrayList<Integer> ar1 = new ArrayList<Integer>();

		ar1.add(100);

		Employee e1 = new Employee("Joel", 25, "QA");
		Employee e2 = new Employee("Anil", 25, "Dev");
		Employee e3 = new Employee("Naveen", 25, "Devops");

		// create arraylist
		ArrayList<Employee> a4 = new ArrayList<Employee>();
		a4.add(e1);
		a4.add(e2);
		a4.add(e3);

		// iterator tot trave the value
		Iterator<Employee> it = a4.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}

		ArrayList ar5 = new ArrayList();
		ar5.add("joel");
		ar5.add("kiran");
		ar5.add("Anil");

		ArrayList ar6 = new ArrayList();
		ar6.add("Keith");
		ar6.add("Kenneat");
		ar6.add("Supriya");

		ar5.addAll(ar6);

		System.out.println("****************");

		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));

		}

		//removeall
		//retailsall - common propertry
		
		
	}

}
