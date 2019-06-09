package training.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeIET")
public class Employee {
	@Id
	private int empid;
	private String name;
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name="emp_prj",joinColumns= {@JoinColumn(name="emp_id")},inverseJoinColumns= {@JoinColumn(name="prj_id")})
	private Set<Project> projects=new HashSet<>();
	public Employee() {
		super();
	}
	public Employee(int empid, String name, Set<Project> projects) {
		super();
		this.empid = empid;
		this.name = name;
		this.projects = projects;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Project> getProjects() {
		return projects;
	}
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
    
}
