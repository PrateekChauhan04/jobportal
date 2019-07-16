package Daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import Dao.skillsDao;
import model.skills;

public class skillsDaoImpl implements skillsDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void addSkill(skills s) {
		this.hibernateTemplate.save(s);
	}

	public List<skills> readAllSkills() {
		return this.hibernateTemplate.find("from skills");
	}

	public void updateSkill(skills s) {
		this.hibernateTemplate.update(s);
	}

	public void deleteSkill(skills s) {
		this.hibernateTemplate.delete(s);
	}

}
