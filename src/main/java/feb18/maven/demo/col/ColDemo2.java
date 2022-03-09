package feb18.maven.demo.col;

import java.util.ArrayList;
import java.util.List;

import feb18.maven.demo.basics.Employee;

public class ColDemo2 {

	public static void main(String[] args) {

		Employee emp = new Employee();

//		List myMarks = new ArrayList();
//		myMarks.add(98);
//		myMarks.add("abc");
//		myMarks.add(emp);
//		myMarks.add("emp");
//		myMarks.add(10.5);
//		myMarks.add(97);
//		System.out.println(myMarks);

		List<Integer> myMarks = new ArrayList<>();
		myMarks.add(98);
//		myMarks.add("abc");
//		myMarks.add(10.5);
		myMarks.add(95);
		System.out.println(myMarks);

		Employee emp4 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();

		List<Employee> empList = new ArrayList<>();
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
//		empList.add("abc");
//		empList.add(10);

	}

}
