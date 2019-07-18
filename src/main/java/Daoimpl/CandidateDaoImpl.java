package Daoimpl;



import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import Dao.CandidateDao;
import model.Candidate;
import model.Education;

import model.Experience;

public class CandidateDaoImpl implements CandidateDao {

    
	public HibernateTemplate hTemplate;
	
	public HibernateTemplate gethTemplate() {

		return hTemplate;
	}

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	
	}

	public void createCandidate(Candidate c) {
	 this.hTemplate.save(c);
	 System.out.println("candidate added");
	}

	public void updateCandidate(Candidate c) {
	
		this.hTemplate.update(c);
		
	}

	public void addExperience(Candidate candidate, Experience ex) {
		
	
	  candidate.getExp().add(ex);
	  
	 this.hTemplate.update(candidate);
	}

	public void addEducation(Candidate candidate, Education ex) {

		candidate.getEdu().add(ex);
	  
	 this.hTemplate.update(candidate );
	}



	public void deleteCandidate(Candidate candidate) {
		

		this.hTemplate.delete(candidate);
	}

	public List <Candidate> getAllCandidate() {
		
		return this.hTemplate.find("from Candidate");
	}



}
