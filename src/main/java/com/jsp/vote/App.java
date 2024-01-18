package com.jsp.vote;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{

		Citizen c1 = new Citizen();
		c1.setcId(1);
		c1.setcName("Gokul");
		c1.setcContact(998789);
		c1.setcAge(21);


		Citizen c2 = new Citizen();
		c2.setcId(2);
		c2.setcName("Vivek");
		c2.setcContact(987659);
		c2.setcAge(35);

		Vote v1 = new Vote();
		v1.setvId(12345567);
		v1.setState("TamilNadu");
		v1.setvGovtType("Indian");

		Vote v2 = new Vote();
		v2.setvId(8765432);
		v2.setState("Bangalore");
		v2.setvGovtType("Indian");

		c1.setV(v1);
		c2.setV(v2);

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Citizen.class).addAnnotatedClass(Vote.class);

		SessionFactory sf = cfg.buildSessionFactory();

		Session ses = sf.openSession();

		Transaction trns = ses.beginTransaction();

		ses.save(c1);
		ses.save(c2);
		ses.save(v1);
		ses.save(v2);

		trns.commit();

		ses.close();


	}
}
