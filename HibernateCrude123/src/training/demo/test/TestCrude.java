package training.demo.test;

import java.util.List;
import java.util.Scanner;

import training.demo.model.Course;
import training.demo.service.CourseService;

public class TestCrude {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
		System.out.println("1.Add course");
		System.out.println("2.delete course");
		System.out.println("3.display by Id");
		System.out.println("4 display all");
		System.out.println("5.update");
		System.out.println("6.exit");
		System.out.println("enter choice");
		 ch=sc.nextInt();
		switch(ch) {
		case 1:
			Course c=CourseService.createCourse();
			CourseService.addCourse(c);
			break;
		case 2:
			System.out.println("Enter Id");
			int id=sc.nextInt();
			CourseService.deleteCourse(id);
			
			break;
		case 3:
			System.out.println("Enter the ID to Display");
			 id=sc.nextInt();
			 c=CourseService.getById(id);
			if(c!=null)
			{
				System.out.println(c);
			}
			else
			System.out.println("Not Found");
			break;
		case 4:
			List<Course>cList=CourseService.getAllCourses();
			cList.forEach((s)->{System.out.println(s);});
			
			break;
		case 5:
			System.out.println("Enter Id");
			id=sc.nextInt();
			CourseService.updateCourse(id);
			
			break;
		case 6:
			System.exit(0);
			break;
		
		}
		}
		while(ch!=6);

	}

}
