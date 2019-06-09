package training.demo.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Pertab")
public class Person {
	@Id
	//@GeneratedValue
	@Column(name="perid")
	private int pid;
	private String pname;
	private String mobile;
	@Embedded
	private Address address;
	
	

	public Person() {
		super();
	}

	public Person(int pid, String pname, String mobile, Address address) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.mobile = mobile;
		this.address = address;
	}

	public int getPid() {
		return pid;
	}
   
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", mobile=" + mobile + ", address=" + address + "]";
	}
	

}
