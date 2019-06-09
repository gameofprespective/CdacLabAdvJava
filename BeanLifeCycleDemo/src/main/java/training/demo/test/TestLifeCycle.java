package training.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.demo.model.Student;

public class TestLifeCycle {

	public static void main(String[] args)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("MyBeans.xml");
		Student s=(Student) ctx.getBean("s1");
		System.out.println(s);
		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}
