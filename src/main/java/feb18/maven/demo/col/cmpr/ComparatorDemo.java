package feb18.maven.demo.col.cmpr;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(103, "Sonu", 50000.25));
		empList.add(new Employee(101, "Monu", 40000.75));
		empList.add(new Employee(104, "Tonu", 60000.50));
		empList.add(new Employee(102, "Ponu", 55000.125));

		System.out.println("Initial empList");
		empList.forEach(e -> System.out.println(e.toString()));

		System.out.println("after sorting empList by eid");
		EmpSalaryComparator cmp1 = new EmpSalaryComparator();
		Collections.sort(empList, cmp1);
		empList.forEach(e -> System.out.println(e.toString()));

		System.out.println("after sorting empList by firstName");
		EmpFirstNameComparator cmp2 = new EmpFirstNameComparator();
		Collections.sort(empList, cmp2);
		empList.forEach(e -> System.out.println(e.toString()));

		System.out.println("after sorting empList by salary");
		EmpSalaryComparator cmp3 = new EmpSalaryComparator();
		Collections.sort(empList, cmp3);
		empList.forEach(e -> System.out.println(e.toString()));
	}

}