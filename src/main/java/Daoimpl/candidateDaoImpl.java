package Daoimpl;



import org.springframework.orm.hibernate3.HibernateTemplate;

import Dao.candidateDao;
import model.candidate;
import model.education;

import model.experience;

public class candidateDaoImpl implements candidateDao {

    
	public HibernateTemplate hTemplate;
	
	public HibernateTemplate gethTemplate() {

		return hTemplate;
	}

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	
	}

	public void createCandidate(candidate c) {
	 this.hTemplate.save(c);
	 System.out.println("candidate added");
	}

	public void updateCandidate(candidate c) {
	
		this.hTemplate.update(c);
		
	}

	public void addExperience(candidate candidate, experience ex) {
		
	
	  candidate.getExp().add(ex);
	  
	 this.hTemplate.update(candidate);
	}

	public void addEducation(candidate candidate, education ex) {

		candidate.getEdu().add(ex);
	  
	 this.hTemplate.update(candidate );
	}



	public void deleteCandidate(candidate candidate) {
		

		this.hTemplate.delete(candidate);
	}



}
