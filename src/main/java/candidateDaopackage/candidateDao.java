package candidateDaopackage;

import model.candidate;
import model.education;
import model.experience;

public interface candidateDao {

	public void createCandidate(candidate c);
	public void updateCandidate(candidate c);
	public void addExperience(String candidateMobileNo,experience ex);
	public void addEducation(String candidateMobileNo,education ex);
	public void updateExperience(String candidateMobileNo,experience ex);
	public void updateEducation(String candidateMobileNo,education ex);
	public void deleteCandidate(String candidateMobileNo);
	
}
