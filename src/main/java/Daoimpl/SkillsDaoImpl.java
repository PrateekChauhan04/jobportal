package Daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import Dao.SkillsDao;
import model.Skills;

public class SkillsDaoImpl implements SkillsDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void addSkill(Skills s) {
		this.hibernateTemplate.save(s);
	}

	public List<Skills> readAllSkills() {
		return this.hibernateTemplate.find("from Skills");
	}

	public void updateSkill(Skills s) {
		this.hibernateTemplate.update(s);
	}

	public void deleteSkill(Skills s) {
		this.hibernateTemplate.delete(s);
	}

}
