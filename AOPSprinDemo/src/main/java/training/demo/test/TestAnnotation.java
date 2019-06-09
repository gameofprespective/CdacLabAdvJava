package training.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.demo.model.Employee;

public class TestAnnotation {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Mybean.xml");
        Employee emp=(Employee) ctx.getBean("employee");
        emp.calcMethod(10);
        System.out.println(emp);
	}

}
