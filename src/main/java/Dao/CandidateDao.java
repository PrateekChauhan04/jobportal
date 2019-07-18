package Dao;

import java.util.List;

import model.Candidate;
import model.Education;
import model.Experience;

public interface CandidateDao {

	public void createCandidate(Candidate c);
	public void updateCandidate(Candidate c);
	public void addExperience(Candidate candidate,Experience ex);
	public void addEducation(Candidate candidate,Education ex);
	public void deleteCandidate(Candidate candidate);
	public List<Candidate> getAllCandidate();
}
