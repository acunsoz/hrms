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
@Table(name="employers")
@PrimaryKeyJoinColumn(name="id")
public class Employer extends User{
	
	
	@GeneratedValue
	@Column(name="user_id")
	private int employerId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_adress")
	private String webAdress;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	
	public Employer(int id, String email, String password) {
		super(id, email, password);
		// TODO Auto-generated constructor stub
	}


	public Employer(int id, String email, String password, int employerId, String companyName, String webAdress,
			String phoneNumber) {
		super(id, email, password);
		this.employerId = employerId;
		this.companyName = companyName;
		this.webAdress = webAdress;
		this.phoneNumber = phoneNumber;
	}

}
