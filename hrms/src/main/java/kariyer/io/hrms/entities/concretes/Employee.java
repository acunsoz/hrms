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
@Table(name="employees")
@PrimaryKeyJoinColumn(name="id")
public class Employee extends User{
	
	@GeneratedValue
	@Column(name="user_id")
	private int employeeId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	public Employee(int id, String email, String password) {
		super(id, email, password);
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String email, String password, int userId, String firstName, String lastName) {
		super(id, email, password);
		this.employeeId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
