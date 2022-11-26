package com.techouts.SprinJdbcTemplate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
		 
	    public static void main(String a[]){
	         
	    	  ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");  
	 	      
	        EmployeeDao1 empDao = (EmployeeDao1)ctx.getBean("edao1");
	        Employee emp = new Employee();
	        emp.setId(102);
	        emp.setName("rusana");
	        emp.setMailId("s@gmail.com");
	       int status= empDao.saveEmployee(emp);
	       System.out.println(status+" row is updated");
	       Employee emp1=new Employee();
	       emp1.setId(101);
	       emp1.setName("Shravani");
	       emp1.setMailId("Sravani@123");
	       int status1=empDao.updateEmployee(emp1);
	       System.out.println(status1+"row is updated");
	       Employee emp2=new Employee();
	       emp2.setId(108);
	       int Status2=empDao.deleteEmployee(emp2);
	       System.out.println(Status2+"row is deleted");
	       
	        
	    }
	}


