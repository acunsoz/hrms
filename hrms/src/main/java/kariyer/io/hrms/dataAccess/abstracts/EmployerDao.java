package kariyer.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kariyer.io.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer>{

}
