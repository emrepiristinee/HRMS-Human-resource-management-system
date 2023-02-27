package kodlamaio.hrms.core.adapters.concretes;

import java.rmi.RemoteException;

import kodlamaio.hrms.core.adapters.abstracts.MernisService;
import kodlamaio.hrms.core.utilities.ErrorResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.entities.concretes.JobSeekers;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements MernisService {

	@Override
	public Result CheckIfRealPerson(JobSeekers jobSeekers) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		if(kpsPublic.TCKimlikNoDogrula(jobSeekers.getNationalityId(), jobSeekers.getName(), jobSeekers.getSurname(),
				jobSeekers.dateOfBirth.getYear())) {
			return new SuccessResult("Mernis doğrulaması başarılı.");
		}
		else
			return new ErrorResult("Mernis doğrulaması başarısız. ");
	}

}
