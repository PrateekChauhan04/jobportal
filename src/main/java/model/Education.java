package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;




@Embeddable
public class Education {
	@Column
	String course;
	@Column
	String branch;

	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}


}
