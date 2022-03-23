package feb18.maven.demo.jpa.dp;

// 

class Employee {

}

class PrimeMinister {

}

public class DesignPatternDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Employee emp2 = new Employee();
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp.equals(emp2));

		PrimeMinister namo = new PrimeMinister();
		PrimeMinister other = new PrimeMinister();
		System.out.println(namo.equals(other));

	}

}
