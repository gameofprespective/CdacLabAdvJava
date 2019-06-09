package training.demo.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.demo.model.Person;
import training.demo.service.PersonService;

public class TestJdbcSpring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Mybean.xml");
		PersonService ps=(PersonService) ctx.getBean("personService");
		int ch;
		do {
		System.out.println("1.Add Person");
		System.out.println("2.Delete Person");
		System.out.println("3.Find Person By id");
		System.out.println("4.Find All");
		System.out.println("5.Update Person");
		System.out.println("6.Exit");
		System.out.println("Enter the Choice");
		ch=sc.nextInt();
		switch(ch) {
		
		case 1:
			Person p=ps.createPerson();
			ps.addPerson(p);
			break;
		case 2:
			System.out.println("Enter id to Delete");
			int id=sc.nextInt();
			ps.deletePerson(id);
			break;
		case 3:
			break;
		case 4:
			List<Person> plist=ps.getAllPerson();
			plist.forEach((p1)->{System.out.println(p1);});
			break;
		case 5:
			break;
		case 6:
			System.exit(0);
			break;
		}
		}while(ch!=6);
		
		
	}

}
