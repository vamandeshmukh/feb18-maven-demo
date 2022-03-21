package feb18.maven.demo.jpa.dao;

import feb18.maven.demo.jpa.entity.Employee;

public interface IEmployeeDao {

	public abstract Employee addEmployee(Employee employee);

	public abstract Employee updateEmployee(Employee employee);

	public abstract Employee deleteEmployee(Employee employee);

	public abstract Employee getEmployeeById(int eid);

//	public abstract Employee getEmployeeByFirstName(String firstName);
}
