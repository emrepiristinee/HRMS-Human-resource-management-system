package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.JobSeekersService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekersDao;
import kodlamaio.hrms.entities.concretes.JobSeekers;

public class JobSeekersManager implements JobSeekersService {
	JobSeekersDao jobSeekersDao;

	@Override
	public DataResult<List<JobSeekers>> getAll() {
		return new SuccessDataResult<List<JobSeekers>>(this.jobSeekersDao.findAll(), "Job Seekers listelendi.");
	}

	@Override
	public Result add(JobSeekers jobSeekers) {
		jobSeekersDao.save(jobSeekers);
		return new SuccessResult("Job Seeker eklendi.");

	}

}
