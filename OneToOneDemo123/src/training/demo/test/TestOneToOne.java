package training.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import training.demo.model.Course;
import training.demo.model.Faculty;

public class TestOneToOne {

	public static void main(String[] args) {
		SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Course c=new Course();
		c.setCid(1111);
		c.setCname("aaaa");
		Faculty f=new Faculty();
		f.setFid(200);
		f.setFname("xxx");
		//f.setCourse(c);
		c.setFaculty(f);
		session.save(f);
		session.save(c);
		tr.commit();
		session.close();
		
		Session s1=sf.openSession();
		Transaction tr1=s1.beginTransaction();
		Course c1=(Course)s1.get(Course.class,1111 );
		System.out.println("courseId : "+c1.getCid());
		System.out.println("coursename : "+c1.getCname());
		System.out.println("Facultyname : "+c1.getFaculty().getFname());
		Faculty f1=(Faculty)s1.get(Faculty.class,200 );
		System.out.println("FacultyId : "+f1.getFid());
		System.out.println("Facultyname : "+f1.getFname());
		System.out.println("Coursename : "+f1.getCourse().getCname());
		c1.setCname("jsdhhsdjkh");
		s1.saveOrUpdate(c1);
		tr1.commit();
		
		
		
		
		
		
		/*Session sessionTwo = HibernateUtil.getSessionFactory().openSession();
		sessionTwo.beginTransaction();
		EmployeeEntity employee = (EmployeeEntity) sessionTwo.get(EmployeeEntity.class, genEmpId);
		AccountEntity account = (AccountEntity) sessionTwo.get(AccountEntity.class, genAccId);
		 
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getAccount().getAccountNumber());
		System.out.println(account.getAccountId());
		System.out.println(account.getEmployee().getEmployeeId());
		 
		HibernateUtil.shutdown();*/
		
		

	}

}
