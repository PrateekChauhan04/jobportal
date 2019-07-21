package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Fetch;


@Entity
public class Candidate {
@Column
String name;

@Column
String email;

@Id
@Column
String mobileNumber;
@Column
int age;

@Column
int PinCode;
@Column
String state;
@Column
String country;

@Column
String resume;
@Column
String gender;

@Column
String password;

@ElementCollection
List<Experience>exp=new ArrayList<Experience>();


@ElementCollection
List<Education>edu=new ArrayList<Education>();
//
@ManyToMany(mappedBy = "candidate")
List<Vacancy>van=new ArrayList<Vacancy>();
//
@ManyToMany(mappedBy = "candidates")
List<Employer> emp=new ArrayList<Employer>();





public List<Employer> getEmp() {
	return emp;
}


public void setEmp(List<Employer> emp) {
	this.emp = emp;
}


public List<Experience> getExp() {
	return exp;
}


public void setExp(List<Experience> exp) {
	this.exp = exp;
}


public List<Vacancy> getVan() {
	return van;
}


public void setVan(List<Vacancy> van) {
	this.van = van;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getMobileNumber() {
	return mobileNumber;
}


public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public int getPinCode() {
	return PinCode;
}


public void setPinCode(int pinCode) {
	PinCode = pinCode;
}


public String getState() {
	return state;
}


public void setState(String state) {
	this.state = state;
}


public String getCountry() {
	return country;
}


public void setCountry(String country) {
	this.country = country;
}


public String getResume() {
	return resume;
}


public void setResume(String resume) {
	this.resume = resume;
}


public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}




public List<Education> getEdu() {
	return edu;
}


public void setEdu(List<Education> edu) {
	this.edu = edu;
}


}
