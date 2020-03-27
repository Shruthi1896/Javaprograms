package com.call.org;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class connection {
	public static void main(String[] args) {

	   EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Test" );
	   EntityManager em= emf.createEntityManager( );
	   em.getTransaction().begin();


		User u= new User();
		 u.setId(111); 
			u.setName("shru");
			User u1=new User();
			u1.setId(112);
			u1.setName("paul");
			em.persist(u); 
			em.persist(u1); 
			 Smart s=new Smart();
			 s.setSmart_id(1234);
			 s.setPan_id(5678);
			s.setUser(u);
			 Smart s1=new Smart();
			 s1.setSmart_id(2222);
			 s1.setPan_id(3333);
s1.setUser(u1);
			em.persist(s); 
			em.persist(s1); 

			em.getTransaction().commit();
			em.close();
			
			emf.close();
			

				
	}

}
