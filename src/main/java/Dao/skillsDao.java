package Dao;

import java.util.List;

import model.skills;

public interface skillsDao {
	
	public void addSkill(skills s);
	
	public List<skills> readAllSkills();
	
	public void updateSkill(skills s);
	
	public void deleteSkill(skills s);

}
