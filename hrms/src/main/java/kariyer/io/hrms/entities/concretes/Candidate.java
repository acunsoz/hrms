package kariyer.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name="candidates")
@PrimaryKeyJoinColumn(name="id")
public class Candidate extends User{
	
	@GeneratedValue
	@Column(name="user_id")
	private int candidateId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="year_of_birth")
	private String dateOfBirth;

	public Candidate(int id, String email, String password) {
		super(id, email, password);
		// TODO Auto-generated constructor stub
	}

	public Candidate(int id, String email, String password, int candidateId, String firstName, String lastName,
			String identityNumber, String dateOfBirth) {
		super(id, email, password);
		this.candidateId = candidateId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.dateOfBirth = dateOfBirth;
	}
	
}
