package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
//gyugugugiu

@Entity
public class candidate {
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
List<experience>exp=new ArrayList<experience>();


@ElementCollection
List<education>edu=new ArrayList<education>();

<<<<<<< HEAD
@ManyToMany
List<Employer> emp = new ArrayList<Employer>();
@ManyToMany
List<vacancy> van = new ArrayList<vacancy>();


=======
>>>>>>> 08b3359350791098c20f67902f4a7ea21759b704

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




public List<education> getEdu() {
	return edu;
}


public void setEdu(List<education> edu) {
	this.edu = edu;
}


}
