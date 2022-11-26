package com.techouts.Mapping;

import java.util.ArrayList;
import java.util.List;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import com.mysql.cj.Session;

public class MainClass {
	public static void main(String[] agrs) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

	SessionFactory factory = meta.getSessionFactoryBuilder().build();
	org.hibernate.Session session = factory.openSession();
	Transaction t = session.beginTransaction(); 

		List<Answers> list=new ArrayList<Answers>();
		Answers answer=new Answers();
		answer.setSetOfAnswers("servlet is a technology");
		answer.setPostedBy("shravani");
		Answers answer1=new Answers();
		answer1.setSetOfAnswers("servlet is robust");
		answer1.setPostedBy("ruksana");
		list.add(answer1);
		list.add(answer);
		Question question=new Question();
		question.setQuestion("what is servlet");
		question.setAnswers(list);
		session.save(question);
		t.commit();
		session.flush();
		session.close();
		}

}
