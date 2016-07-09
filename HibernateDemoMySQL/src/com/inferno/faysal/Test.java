package com.inferno.faysal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.inferno.fahim.Student;

//import com.infy.manager.Supplier;

public class Test {
//	private static SessionFactory sessionFactory;
	public static void main(String[] args) {
		
		
		Student student = new Student();
		student.setStudentId(100);
		student.setStudentName("fahim faysal");
		
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		


	}

}
