package kodlamaio.hrms.core.adapters.abstracts;

import java.rmi.RemoteException;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobSeekers;

public interface MernisService {
	Result CheckIfRealPerson(JobSeekers jobSeekers) throws NumberFormatException, RemoteException;
}
