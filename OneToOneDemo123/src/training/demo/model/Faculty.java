package training.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Faculty {
	@Id
	private int fid;
	private String fname;
	@OneToOne(mappedBy="faculty")
	private Course course;
	public Faculty() {
		super();
	}
	public Faculty(int fid, String fname, Course course) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.course = course;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	

}
