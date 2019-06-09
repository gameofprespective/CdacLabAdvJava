package training.demo.model;

public class Employee {
	private int empid;
	private String ename;
	private double sal;
	private Address addr1;
	public Employee() {
		super();
		System.out.println("In default constructor");
	}
	public Employee(int empid, String ename, double sal) {
		super();
		System.out.println("In parametrized constructor");
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		System.out.println("In setempid constructor");
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		System.out.println("In setename constructor");
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		System.out.println("In setsal constructor");
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	

}
