package feb18.maven.demo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = factory.createEntityManager();

		Employee emp = new Employee(101, "Sonu", 50000);

		em.getTransaction().begin();

		em.persist(emp); // insert
//		em.merge(emp); // update
//		em.remove(emp); // delete
		Employee emp2 = em.find(Employee.class, 101); // select
		System.out.println(emp2.toString());
		System.out.println("End");
		em.getTransaction().commit();
	}
}
