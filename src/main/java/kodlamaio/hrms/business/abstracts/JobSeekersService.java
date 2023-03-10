package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobSeekers;

public interface JobSeekersService {
	DataResult<List<JobSeekers>> getAll();
	Result add(JobSeekers jobSeekers);
}
