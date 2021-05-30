package kariyer.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kariyer.io.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer>{

}
