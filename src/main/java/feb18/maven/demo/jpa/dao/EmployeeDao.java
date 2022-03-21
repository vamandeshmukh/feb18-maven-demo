package feb18.maven.demo.jpa.dao;

import javax.persistence.EntityManager;

import feb18.maven.demo.jpa.entity.Employee;

public class EmployeeDao implements IEmployeeDao {

	private EntityManager entityManager;

	public EmployeeDao() {
		entityManager = JpaUtil.getEntityManager();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return entityManager.merge(employee);
	}

	@Override
	public Employee deleteEmployee(Employee employee) {
		entityManager.remove(employee);
		return employee;
	}

	@Override
	public Employee getEmployeeById(int eid) {
		entityManager.getTransaction().begin();
		Employee emp = entityManager.find(Employee.class, eid);
		entityManager.getTransaction().commit();
		return emp;

	}

}
