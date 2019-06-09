package training.demo.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Student implements DisposableBean,InitializingBean,BeanNameAware, ApplicationContextAware,BeanFactoryAware{
	private int sid;
	private String sname;
	private float marks;
	public Student() {
		super();
	}
	public Student(int sid, String sname, float marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}
	public void myinit() {
		
		System.out.println("In myinit method");
	}
	public void mydestroy() {
			
			System.out.println("In mydestroy method");
		}
	public void setBeanName(String arg0) {
		System.out.println(" in setBeanName method ");
		
	}
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println(" in setBeanFactory method");
	}
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println(" in setApplicationContext method");
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println(" in afterPropertiesSet method");
	}
	public void destroy() throws Exception {
		System.out.println(" in disposable's destroy method");
	}
}
