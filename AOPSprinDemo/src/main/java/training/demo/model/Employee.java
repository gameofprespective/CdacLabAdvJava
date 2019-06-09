package training.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("10")
	private int eid;
	@Value("xxx")
	private String ename;
	@Value("11111")
	private double sal;
	@Autowired
	private Address address;
	public Employee() {
		super();
		System.out.println("In default Constructor");
	}
	
	public Employee(int eid, String ename, double sal, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		System.out.println("In seteid method");
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		System.out.println("In setename method");
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		System.out.println("In setsal method");
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", address=" + address + "]";
	}
	
	//@PostConstruct
	public void myinit() {
		System.out.println("In myinit");
	}
	//@PreDestroy
	public void myDestroy() {
		System.out.println("In myinit");
	}
	
	public void calcMethod(int x) {
		System.out.println("in calc meethod"+x);
	}
	
	
	
}
