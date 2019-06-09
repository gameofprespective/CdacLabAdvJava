package training.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.demo.model.User;

public class TestPropertiesFileUse {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Mybean.xml");
		User u1=(User) ctx.getBean("u1");
		System.out.println("User : "+u1);
		User u2=(User) ctx.getBean("u2");
		System.out.println("User : "+u2);
	}

}
