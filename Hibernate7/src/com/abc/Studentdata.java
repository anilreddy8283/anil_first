package com.abc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Studentdata {

	public static void main(String[] args) 
    {
		/*Student student=new Student();
		student.setName("anil");*/
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		//session.save(student);
		
        Student student= session.get(Student.class,1);
        
        session.getTransaction().commit();
        session.close();
       //  student.setName("anil after");
        session=sessionFactory.openSession();
        session.beginTransaction();
        session.update(student);
        //student.setName("anil+ aftere");
        session.getTransaction().commit();
        session.close();
        System.out.println("success");
        
        
	}

}
