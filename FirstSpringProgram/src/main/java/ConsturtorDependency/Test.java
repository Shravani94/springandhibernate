package ConsturtorDependency;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] agrs) {
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory bean=new XmlBeanFactory(resource);
		 Employee s=(Employee)bean.getBean("employee");  
	        s.show();  
	}

}
