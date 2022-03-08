package feb18.maven.demo.basics;

public class Employee {

	int eid;
	String firstName;
	double salary;

	public Employee() {
		super();
	}

	public Employee(int eid, String firstName, double salary) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this.eid == ((Employee) obj).eid)
//			return true;
//		return false;
//	}

}
