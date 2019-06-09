package training.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="projectIET")
public class Project {
	@Id
	private int pid;
	private String pname;
	@ManyToMany(mappedBy="projects")
	Set<Employee> employees=new HashSet<>();
	public Project() {
		super();
	}
	public Project(int pid, String pname, Set<Employee> employees) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.employees = employees;
	}
	public int getPid() {
		return pid;
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
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	

}
