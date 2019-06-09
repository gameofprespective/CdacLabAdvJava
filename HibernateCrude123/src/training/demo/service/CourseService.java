package training.demo.service;

import java.util.List;
import java.util.Scanner;

import training.demo.dao.CourseDao;
import training.demo.model.Course;

public class CourseService {

	public static Course createCourse() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Course ID& cname");
		int id =sc.nextInt();
		String cname=sc.next();
		return new Course(id,cname);
		
		
		
	}

	public static void addCourse(Course c) {
		CourseDao.addCourse(c);
		
		
	}
	

	public static void deleteCourse(int id) {
		
		CourseDao.deleteCourse(id);
	}

	public static Course getById(int id) {
		return CourseDao.getById(id);
		
	
	}

	public static List<Course> getAllCourses() {
		
		return CourseDao.getAllCourses();
	}

	public static void updateCourse(int id) {
		CourseDao.updateCourse(id);
		
	}

}
