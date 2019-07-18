package Dao;

import java.util.List;

import model.Skills;

public interface SkillsDao {
	
	public void addSkill(Skills s);
	
	public List<Skills> readAllSkills();
	
	public void updateSkill(Skills s);
	
	public void deleteSkill(Skills s);

}
