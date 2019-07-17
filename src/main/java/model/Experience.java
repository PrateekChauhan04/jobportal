package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;



@Embeddable
public class Experience {
	

	@Column
	String company;
	@Column
	String fromDate;
	@Column
	String toDate;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
		

}
