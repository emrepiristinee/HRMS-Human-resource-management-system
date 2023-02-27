package kodlamaio.hrms.core.verifications.concretes;

import kodlamaio.hrms.core.utilities.ErrorResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.core.verifications.abstracts.VerificationService;
import kodlamaio.hrms.entities.concretes.JobSeekers;

public class VerificationManager implements VerificationService {

	@Override
	public Result IsEmailVerification(String Email) {
		return new SuccessResult("E-mail geçerli.");
	}

	@Override
	public Result IsRegisteredEmailOrNationalityId(String Email, Long NationalityId) {
		if (NationalityId != 0 && Email == "") {
			return new SuccessResult();
		} else {
			return new ErrorResult("Kayıt başarısız, TC-no veya e-mail daha önce kayıt olmuş.");
		}

	}

}
