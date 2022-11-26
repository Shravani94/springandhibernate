package bysuingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] ags) {
		  ApplicationContext ctx = 
			         new AnnotationConfigApplicationContext(HelloWorldCofig.class);
		HellooWorld world=ctx.getBean(HellooWorld.class);
		world.getName();
	}

}