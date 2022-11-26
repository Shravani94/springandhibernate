package OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MaincCass {
	public static void main(String[] args) {
		try {
		Configuration con=new Configuration().configure();
		SessionFactory sessionfactory=con.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction t=session.beginTransaction();
		Person person1= new Person();
		person1.setId(1);
		person1.setName("sravani");
		person1.setMailId("sravani@gmail.com");
		Address adress1= new Address();
		adress1.setAdressLine("kukatpally");
		
		adress1.setCity("hyderbad");
		adress1.setCountry("india");
		adress1.setState("Telangana");
		person1.setAddress(adress1);
		adress1.setPerson(person1);
		Person person2= new Person();
		person2.setId(2);
		person2.setName("rusana");
		person2.setMailId("rukku@gmail.com");
		Address adress2= new Address();
		adress2.setAdressLine("gacchibouli");
		
		adress2.setCity("hyderbad");
		adress2.setCountry("india");
		adress2.setState("Telangana");
		person2.setAddress(adress1);
		adress2.setPerson(person1);
		t.commit();
		session.flush();
		session.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
		
	
