package feb18.maven.demo.jpa;

import feb18.maven.demo.jpa.dao.EmployeeDao;
import feb18.maven.demo.jpa.entity.Employee;

public class JpaDemo {

	public static void main(String[] args) {

		System.out.println("Start");

		EmployeeDao dao = new EmployeeDao();
		Employee emp = new Employee(105, "Ponu", 75000);

		dao.addEmployee(emp);
		System.out.println(dao.getEmployeeById(105));

		System.out.println("End");
	}
}

//package feb18.maven.demo.jpa;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import feb18.maven.demo.jpa.entity.Employee;
//
//public class JpaDemo {
//
//	public static void main(String[] args) {
//
//		System.out.println("Start");
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vaman");
//		EntityManager em = factory.createEntityManager();
//
////		Employee emp = new Employee(101, "Sonu", 50000);
//		Employee emp2 = new Employee(102, "Monu", 60000);
////		Employee emp3 = new Employee(103, "Tonu", 55000);
//
//		em.getTransaction().begin();
//
////		em.persist(emp); // insert
////		em.persist(emp2); // insert
////		em.persist(emp3); // insert
//
//		emp2.setSalary(65000);
//
//		em.merge(emp2); // update
////		em.remove(emp); // delete
//		Employee empData = em.find(Employee.class, 102); // select
//		em.getTransaction().commit();
////		em.getTransaction().rollback();
//		System.out.println(empData.toString()); 
//		System.out.println("End");
//	}
//}
