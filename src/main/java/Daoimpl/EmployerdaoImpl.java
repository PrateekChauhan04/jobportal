package Daoimpl;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import Dao.EmployerDao;
import model.Employer;
public class EmployerdaoImpl implements EmployerDao{

	HibernateTemplate hTemplate;
	
	public HibernateTemplate gethTemplate() {
		return hTemplate;
	}

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

	public void addEmployer(Employer er) {
		// TODO Auto-generated method stub
		this.hTemplate.save(er);
	}

	public void updateEmployer(Employer er) {
		// TODO Auto-generated method stub
		
	}

	public void deleteEmployer(Employer er) {
		// TODO Auto-generated method stub
		
	}

	public List<Employer> viewEmployer() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
