package training.demo.model;

public class Employee {
	private int empid;
	private String ename;
	private double sal;
	private Address addr1;
	private Project p1;
	public Employee() {
		super();
		System.out.println("In default constructor");
	}
	
	public Employee(int empid, String ename, double sal, Address addr1, Project p1) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
		this.addr1 = addr1;
		this.p1 = p1;
	}







	public Address getAddr1() {
		return addr1;
	}

	public void setAddr1(Address addr1) {
		this.addr1 = addr1;
	}

	public Project getP1() {
		return p1;
	}

	public void setP1(Project p1) {
		this.p1 = p1;
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
		return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + ", addr1=" + addr1 + ", p1=" + p1
				+ "]";
	}
	
	public void myinit() {
		System.out.println("In my init method");
	}
	public void mydestroy() {
		System.out.println("In my destroy method");
	}

}
