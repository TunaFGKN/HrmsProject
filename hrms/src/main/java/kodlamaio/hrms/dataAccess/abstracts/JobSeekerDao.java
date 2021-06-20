package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {
	JobSeeker getById(int id);
	//JobSeeker getByeMail(String eMail);
	//JobSeeker getByeMailOrIdentifyNumber(String eMail, String identifyNumber);
}
