package training.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.demo.model.Employee;

public class TestAutowire {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("MyBeans.xml");
		Employee e1=(Employee) ctx.getBean("emp1");
		System.out.println(e1);
		

	}

}
