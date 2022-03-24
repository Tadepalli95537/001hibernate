package com.createiq.hibernate;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;  
  

public class StoreData {
	public static void main(String[] args) {    
        
	    //Create typesafe ServiceRegistry object    
	    ServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.config.xml").build();  
	          
	   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	  
	SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	Session session = factory.openSession();  
	Transaction t = session.beginTransaction();   
	            
	    Employee e1=new Employee();    
	    e1.setId(101);    
	    e1.setFirstName("Gaurav");    
	    e1.setLastName("Chawla");    
	    e1.setId(102);
	    e1.setFirstName("madhuri");
	    e1.setLastName("p");
	    
	        
	    session.save(e1);  
	    t.commit();  
	    System.out.println("successfully saved");    
	    factory.close();  
	    session.close();    
	        
	}    
	
}
