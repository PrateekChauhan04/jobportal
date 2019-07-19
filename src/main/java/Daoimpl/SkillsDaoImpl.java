package Daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import Dao.SkillsDao;
import model.Skills;

public class SkillsDaoImpl implements SkillsDao {
	
	private HibernateTemplate hTemplate;
	public HibernateTemplate gethTemplate() {
		return hTemplate;
	}

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

	public void addSkill(Skills s) {
		this.hTemplate.save(s);
	}

	public List<Skills> readAllSkills() {
		return this.hTemplate.find("from Skills");
	}

	public void updateSkill(Skills s) {
		this.hTemplate.update(s);
	}

	public void deleteSkill(Skills s) {
		this.hTemplate.delete(s);
	}

}
