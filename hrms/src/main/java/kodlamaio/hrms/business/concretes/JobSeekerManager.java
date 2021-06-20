package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concrete.JobSeeker;
import kodlamaio.hrms.entities.dtos.JobSeekerForRegisterDto;

@Service
public class JobSeekerManager implements JobSeekerService{
	
	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Job seeker added");
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"Job seekers listed");
	}

	@Override
	public Result update(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Job seeker updated");
	}

	@Override
	public Result delete(JobSeeker jobSeeker) {
		this.jobSeekerDao.delete(jobSeeker);
		return new SuccessResult("Job seeker deleted");
	}

	@Override
	public DataResult<JobSeeker> get(int id) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.getById(id));
	}

	@Override
	public Result register(JobSeekerForRegisterDto jobSeekerForRegisterDto) {
		MernisManager mernisManager = new MernisManager();
		mernisManager.checkMernis(jobSeekerForRegisterDto.getName(), jobSeekerForRegisterDto.getSurname(),jobSeekerForRegisterDto.getBirthDate());
		
		//if (this.jobSeekerDao.getByeMailOrIdentifyNumber(jobSeekerForRegisterDto.geteMail(),jobSeekerForRegisterDto.getIdentifyNumber()) != null) {
		//	return new ErrorResult("Bu Mail veya TC No Zaten Kayıtlı.");
		//}
		
		return null;
	}

}
