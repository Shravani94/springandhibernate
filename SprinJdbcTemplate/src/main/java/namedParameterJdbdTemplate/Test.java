package namedParameterJdbdTemplate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {  
	  public static void main(String[] args) {  
	      
	    Resource r=new ClassPathResource("ApplicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    EmployeeDao4 dao=(EmployeeDao4)factory.getBean("edao4");  
	    dao.save(new Employee(24,"sweety","sweety@gmail.com"));
	    System.out.println("inserted successfully");
	      
	  }  
	}  