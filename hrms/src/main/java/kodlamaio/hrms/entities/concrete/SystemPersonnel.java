package kodlamaio.hrms.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "system_personnel")
public class SystemPersonnel extends User{

	@Column(name = "position_name")
	private String positionName;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
}
