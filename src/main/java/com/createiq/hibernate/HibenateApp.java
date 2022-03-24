package com.createiq.hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibenateApp {

	public static void main(String[] args) {
		
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sf = configuration.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction t=((SharedSessionContract) sf).beginTransaction();
		
		//Student student = new Student(1001,"Balaji G",25000.00);
		Student s=new Student();
		s.setSid(1);
		s.setSname("madhuri");
		s.setSalary(2365.00);
		
		
		session.save(s);
		
		session.beginTransaction().commit();
		System.out.println("succesfully saved");
		
		session.close();
		
	}
}
 