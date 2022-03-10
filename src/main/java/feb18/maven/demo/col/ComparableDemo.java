package feb18.maven.demo.col;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(103, "Sonu", 50000.25));
		empList.add(new Employee(101, "Monu", 40000.75));
		empList.add(new Employee(104, "Tonu", 60000.50));
		empList.add(new Employee(102, "Ponu", 55000.125));

		System.out.println("Initial empList");
		empList.forEach(e -> System.out.println(e.toString()));

		Collections.sort(empList);

		System.out.println("after sorting empList");
		empList.forEach(e -> System.out.println(e.toString()));
	}

	public ArrayList<Employee> sort(ArrayList<Employee> obj) {
		// code
		return obj;
	}

}
