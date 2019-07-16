package Dao;

import model.skills;

public interface skillsDao {
	
	public void addSkill(skills s);
	
	public void readAllSkills(skills s);
	
	public void updateSkill(skills s);
	
	public void deleteSkill(skills s);

}
