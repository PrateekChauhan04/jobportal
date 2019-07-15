package Dao;

import model.candidate;
import model.education;
import model.experience;

public interface candidateDao {

	public void createCandidate(candidate c);
	public void updateCandidate(candidate c);
	public void addExperience(candidate candidate,experience ex);
	public void addEducation(candidate candidate,education ex);
	public void deleteCandidate(candidate candidate);
	
}
