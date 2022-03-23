package feb18.maven.demo.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import feb18.maven.demo.jpa.entity.Employee;

public class HibernateDemo {

	public static void main(String[] args) {

		System.out.println("Start");

		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee emp = new Employee(108, "Ponu", 45000);
		session.save(emp); // insert
//		session.update(emp); // update 
//		session.delete(emp); // delete 
		transaction.commit();
		Employee empData = session.get(Employee.class, 108); // select
		System.out.println(empData.toString());
		System.out.println("End");

	}
}
