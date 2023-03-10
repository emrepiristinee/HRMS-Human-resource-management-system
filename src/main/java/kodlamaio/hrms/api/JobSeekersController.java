package kodlamaio.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekersService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.entities.concretes.JobSeekers;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {

	private JobSeekersService jobSeekersService;
	
	@Autowired
	public JobSeekersController(JobSeekersService jobSeekersService) {
		super();
		this.jobSeekersService = jobSeekersService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeekers>> getAll() {
		return this.jobSeekersService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekers jobSeeker) {
		return this.jobSeekersService.add(jobSeeker);
	}
}
