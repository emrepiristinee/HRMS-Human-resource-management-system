package kodlamaio.hrms.core.verifications.abstracts;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobSeekers;

public interface VerificationService {

	Result IsRegisteredEmailOrNationalityId(String Email, Long NationalityId);
	Result IsEmailVerification(String Email);
}
