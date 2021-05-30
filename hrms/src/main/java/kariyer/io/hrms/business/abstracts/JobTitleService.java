package kariyer.io.hrms.business.abstracts;

import java.util.List;

import kariyer.io.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();

}
