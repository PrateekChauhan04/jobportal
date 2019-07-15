package Daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import Dao.vacancy_dao;
import model.vacancy;
public class vacancyDAOImpl implements vacancy_dao{
	HibernateTemplate hTemplate;
	public HibernateTemplate gethTemplate() {
		return hTemplate;
	}

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

	public void createVacancy(vacancy v) {
		// TODO Auto-generated method stub
	 this.hTemplate.save(v);
		
	}

	public void updateVacancy(vacancy v) {
		// TODO Auto-generated method stub
        this.hTemplate.saveOrUpdate(v);
	}

	public void viewVacancy(vacancy v) {
		// TODO Auto-generated method stub
		
	}

	public void deleteVacancy(vacancy v) {
		// TODO Auto-generated method stub
		this.hTemplate.delete(v);
	}

	public List<vacancy> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	
}
