package Daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import Dao.AdminDao;
import model.Admin;

public class AdminDaoImpl implements AdminDao {
	
public HibernateTemplate hTemplate;
	
	public HibernateTemplate gethTemplate() {

		return hTemplate;
	}

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	
	}


	public void createadmin(Admin a) {
		// TODO Auto-generated method stub
		this.hTemplate.save(a);
	}

	public void updateadmin(Admin a) {
		// TODO Auto-generated method stub
		this.hTemplate.update(a);
}

	public void deleteadmin(Admin a) {
		// TODO Auto-generated method stub
		this.hTemplate.delete(a);
	}

	public List<Admin> readall() {
		// TODO Auto-generated method stub
		return this.hTemplate.find("from Admin");
	}
	
	

}

