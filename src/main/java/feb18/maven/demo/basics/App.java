package feb18.maven.demo.basics;

public class App {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Sonu", 50000);
		Employee emp2 = new Employee(101, "Sonu", 50000);
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp.equals(emp2));

//		String str = "abc";
//		String str2 = "abc";
//		System.out.println(str.hashCode());
//		System.out.println(str2.hashCode());
//		System.out.println(str.equals(str2));

//		String str3 = new String("def");
//		String str4 = new String("def");
//		System.out.println(str3.hashCode());
//		System.out.println(str4.hashCode());
//		System.out.println(str3.equals(str4));
	}

}
