package kodlamaio.hrms.business.concretes;

import java.util.Date;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;

public class MernisManager {
	DataResult<Boolean> checkMernis(String name, String surname, Date birthDate){
		return new SuccessDataResult<Boolean>(true,"Confirmation success");
	}
}
