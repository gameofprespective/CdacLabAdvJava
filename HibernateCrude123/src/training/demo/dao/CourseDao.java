package training.demo.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import training.demo.model.Course;

public class CourseDao {
	private static SessionFactory sf=null;
		static {
			sf=	new AnnotationConfiguration().configure().buildSessionFactory();
		}
	
	public static void addCourse(Course c) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(c);
		tr.commit();
		session.close();
		
	}

	public static void deleteCourse(int id) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		Course c=(Course) session.get(Course.class,id);
		session.delete(c);
		tr.commit();
		session.close();
		
	}

	public static Course getById(int id) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Course c=(Course) session.get(Course.class,id);
		session.close();
		return c;
		
	}

	public static List<Course> getAllCourses() {
		Session session=sf.openSession();
		String q="from Course ";
		Transaction tr=session.beginTransaction();
		Query q1=session.createQuery(q);
		List<Course> cList=q1.list();
		session.close();
		return cList;
		
	}

	public static void updateCourse(int id) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Course c=(Course) session.get(Course.class,id);
		System.out.println("Enter Course Name");
		Scanner sc=new Scanner(System.in);
		String nm=sc.next();
		c.setCname(nm);
		session.saveOrUpdate(c);
		tr.commit();
		session.close();
		
		
	}

}
