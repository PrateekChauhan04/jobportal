package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class education {
	@Column
	String course;
	@Column
	String branch;
	@Column
	@Id
	String mobile_number;
	@ManyToMany
	List<candidate>can=new ArrayList<candidate>();
	candidate candidate;
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBranch() {
		return branch;
	}
	public candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(candidate candidate) {
		this.candidate = candidate;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	
	
}
