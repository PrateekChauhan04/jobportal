package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Skills {

	@Id
	int skillId;
	
	@Column
	String field;
	
	@Column
	String skillName;
	
	@Column
	String skillLevel;
	
	@ManyToMany(mappedBy="skills")
	List<Vacancy> vacancies = new ArrayList<Vacancy>();
	
	public List<Vacancy> getVacancies() {
		return vacancies;
	}

	public void setVacancies(List<Vacancy> vacancies) {
		this.vacancies = vacancies;
	}

	
	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(String skillLevel) {
		this.skillLevel = skillLevel;
	}

	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
