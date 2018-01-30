package com.abc;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class VehicleData {

	public static void main(String[] args)
	{
		Vehicle vehicle=new Vehicle();
		vehicle.setName("car");
		
		Twowheeler twowheeler=new Twowheeler();
		twowheeler.setName("bike");
		twowheeler.setWheeltype("two");
		
		Fourwheeler fourwheeler=new Fourwheeler();
		fourwheeler.setName("car");
		fourwheeler.setWheeltypes("four");
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(vehicle);
		session.save(twowheeler);
		session.save(fourwheeler);
		session.getTransaction().commit();
		session.close();
 System.out.println("Success");
		

	}

}
