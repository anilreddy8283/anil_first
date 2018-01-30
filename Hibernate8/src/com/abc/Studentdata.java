package com.abc;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Studentdata {

	public static void main(String[] args) 
	{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	/*Query q=	session.createQuery("from Student");
	
	    //List l=    q.list();
	q.setFirstResult(2);
	q.setMaxResults(2);
	
	      List<Student> l=  (List<Student>)q.list();
	      
	
	    session.getTransaction().commit();
	    session.close();
	    //System.out.println("users list is"+l.size());
	  for(Student s:l)
	  {
		  System.out.println(s.getName());
	  }
	    */
		
		/*Query q=	session.createQuery("select new map(id,name) from Student");
		q.setFirstResult(3);
		List<Map> l=(List<Map>)q.list();*/
		
		Query q=session.createQuery("select sum(id) from Student");
		List l=q.list();
		session.getTransaction().commit();
	    session.close();
	    /*for(Map s:l)
		  {
			  System.out.println(s);
		  }*/
	    
	    System.out.println(l);

	}

}
