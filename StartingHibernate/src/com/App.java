package com;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.util.HibernateUtil;
import com.user.DBUser;
/* Below demos uses HibernateUtil.getSessionFactory().openSession()to get session object
 * Also HibernateUtil.getSessionFactory().getCurrentSession() approach 
 */
public class App {
	public static void main(String[] args) {
		DBUser user = new DBUser();

		user.setUserId(100);
		user.setUsername("Kishori");
		user.setCreatedBy("system");
		user.setCreatedDate(new Date());
		DBUser user1 = new DBUser();

		user1.setUserId(101);
		user1.setUsername("Rajan");
		user1.setCreatedBy("system");
		user1.setCreatedDate(new Date());
		System.out.println("Hibernate + MySQL");
		//Session session = HibernateUtil.getSessionFactory().openSession();
        SessionFactory factory= new Configuration().configure().buildSessionFactory();
        Session session =factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(user);
		session.save(user1);
		/*check dependency of session with transaction by calling
		  session.isOpen() */
		//session.getTransaction().commit();
		tx.commit();
	}
}
