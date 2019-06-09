package training.demo.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import training.demo.Dao.PersonDao;
import training.demo.model.Person;

@Service
public class PersonService {
@Autowired
	private PersonDao personDao;
	
	public Person createPerson() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		int pid=sc.nextInt();
		String pname=sc.next();
		String mobile=sc.next();
		return new Person(pid,pname,mobile);
	}

	public int addPerson(Person p) {
		
		
		return personDao.addPerson(p);
	}

	public List<Person> getAllPerson() {
		
		return personDao.getAllPerson();
		
	}

	public int deletePerson(int id) {
		return personDao.deletePerson(id);
		
	}
	
	

}
