package training.demo.test;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import training.demo.model.Address;
import training.demo.model.Person;

public class HibernateTest {

	public static void main(String[] args) {
		SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Address a1=new Address("Aundh","Pune");
		Address a2=new Address("Baner","Pune");
		Address a3=new Address("Bajirao rd","Pune");
		Person p=new Person(12,"Kishori","123456",a1);
		Person p1=new Person(13,"Rajan","33333",a2);
		Person p2=new Person(16,"Manjiri","123456",a3);
		session.save(p);
		session.save(p1);
		session.save(p2);
		tr.commit();
		session.close();
		Session session1=sf.openSession();
		Transaction tr1=session1.beginTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int pid=sc.nextInt();
		Person ps=(Person)session1.get(Person.class,pid);
		System.out.println(ps);
		//sf.close();
		

	}

}
