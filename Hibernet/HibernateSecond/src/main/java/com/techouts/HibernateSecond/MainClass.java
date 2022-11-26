package com.techouts.HibernateSecond;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class MainClass {
	public static void main(String[] ags) {
		
		
		TablePerHierarchy tph=new TablePerHierarchy();
		tph.setName("shravani");
		tph.setMailId("sravani@123");
		RegularStudents rs=new RegularStudents();
		rs.setPromot("yes");
		rs.setResult1("pass");
		IrregularStudents irs=new IrregularStudents();
		irs.setDetend("yes");
		irs.setKnowledge(null);
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

	SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction(); 
		session.save(tph);
		session.save(rs);
		session.save(irs);
		t.commit();
		session.close();
		
	}

}
