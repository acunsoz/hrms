package kariyer.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kariyer.io.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User,Integer>{

}
