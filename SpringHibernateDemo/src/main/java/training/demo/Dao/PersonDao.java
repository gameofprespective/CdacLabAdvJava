package training.demo.Dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import training.demo.model.Person;
@Repository
public class PersonDao {
	@Autowired 
	SessionFactory sessionFactory;
	public int addPerson(Person p) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(p);
		tr.commit();
		
		return 0;
		 
	}
	public List<Person> getAllPerson() {
		
		
		return null;
	}
	public int deletePerson(int id) {
		
		
		 return 0;
	}

}
