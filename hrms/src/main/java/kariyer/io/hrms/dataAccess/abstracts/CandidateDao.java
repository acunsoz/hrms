package kariyer.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kariyer.io.hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate,Integer>{

}
