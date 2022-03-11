package feb18.maven.demo.strm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Sonu", 50000));
		empList.add(new Employee(102, "Monu", 60000));
		empList.add(new Employee(103, "Ponu", 45000));
		empList.add(new Employee(104, "Tonu", 55000));
		empList.add(new Employee(105, "Gonu", 65000));

		System.out.println("Iterate and print elements with forEach and lambda: ");
		empList.forEach(e -> System.out.println(e.toString()));

		System.out.println("Employees stream with higher salary:");
		Stream<Employee> empStream = empList.stream();
		empStream.filter(e -> e.getSalary() >= 60000).forEach(e -> System.out.println(e.toString()));

//		empStream.forEach(e -> System.out.println(e.toString()));

//		List<Employee> empWithHigherSal = empStream.collect(Collectors.toList());
//
//		empWithHigherSal.forEach(e -> System.out.println(e.toString()));
	}
}
