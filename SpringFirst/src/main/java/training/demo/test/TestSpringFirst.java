package training.demo.test;

import training.demo.model.Address;
import training.demo.model.Employee;
import training.demo.model.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpringFirst {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Mybean.xml");
		System.out.println("In main method");
		HelloWorld hw=(HelloWorld) ctx.getBean("hello");
        hw.sayHello();
        Employee emp1=(Employee) ctx.getBean("e1");
        System.out.println(emp1.getEname());
        Employee emp2=(Employee) ctx.getBean("e2");
        System.out.println(emp2.getEname());
        Address a1=(Address) ctx.getBean("addr1");
        System.out.println(a1);
	}

}
