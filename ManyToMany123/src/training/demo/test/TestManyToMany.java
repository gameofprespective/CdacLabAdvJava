package training.demo.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import training.demo.model.Employee;
import training.demo.model.Project;

public class TestManyToMany {

	public static void main(String[] args) {
		SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Employee e1=new Employee();
		e1.setEmpid(100);
		e1.setName("xxxx");
		Employee e2=new Employee();
		e2.setEmpid(200);
		e2.setName("yyy");
		Project p1=new Project();
		p1.setPid(111);
		p1.setPname("project1");
		Project p2=new Project();
		p2.setPid(222);
		p2.setPname("project2");
		Set<Project> hs=new HashSet<>();
		hs.add(p1);
		hs.add(p2);
		e1.setProjects(hs);
		e2.setProjects(hs);
		session.save(e1);
		session.save(e2);
		tr.commit();
		session.close();
		Session s1=sf.openSession();
		Transaction tr1=s1.beginTransaction();
		String q1="from Employee e";
		Query q=s1.createQuery(q1);
		List<Employee> elist=q.list();
		System.out.println(elist.size());
		elist.forEach((s)->{System.out.println(s.getName());});
		
		/*Employee emp=(Employee)s1.get(Employee.class, 100);
		System.out.println("Empid : " +emp.getEmpid());
		System.out.println("ename : "+emp.getName());
		Set<Project> hs1=emp.getProjects();
		for(Project p:hs1) {
			System.out.println(p.getPid());
			System.out.println(p.getPname());
		}*/
		
				
		
		

	}

}
