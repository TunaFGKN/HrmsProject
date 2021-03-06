package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrete.JobSeeker;
import kodlamaio.hrms.entities.dtos.JobSeekerForRegisterDto;

public interface JobSeekerService {
	Result add(JobSeeker jobSeeker);
	Result update(JobSeeker jobSeeker);
	Result delete(JobSeeker jobSeeker);
	DataResult<List<JobSeeker>> getAll();
	DataResult<JobSeeker> get(int id);
	Result register(JobSeekerForRegisterDto jobSeekerForRegisterDto);
}
