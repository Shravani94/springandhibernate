package preparedStatementCallback;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {  
	  
public static void main(String[] args) {  
	 Resource r=new ClassPathResource("ApplicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	                
    EmployeeDao2 dao=(EmployeeDao2)factory.getBean("edao2");  
   Boolean status= dao.saveEmployeeByPreparedStatement(new Employee(108,"Amit","mit@gmail.com"));  
   System.out.println(status);
}  
}  