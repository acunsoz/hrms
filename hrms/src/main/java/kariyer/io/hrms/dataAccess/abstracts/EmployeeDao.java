package kariyer.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kariyer.io.hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer>{

}
