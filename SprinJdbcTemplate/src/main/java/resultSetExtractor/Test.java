package resultSetExtractor;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test{
public static void main(String[] args) {  
	  ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");  
	        
    EmployeeDao3 dao=(EmployeeDao3)ctx.getBean("edao3");  
    List<Employee> list=dao.getAllEmployees();  
          
    for(Employee e:list)  
        System.out.println(e);  
          
    }  
  
}  
