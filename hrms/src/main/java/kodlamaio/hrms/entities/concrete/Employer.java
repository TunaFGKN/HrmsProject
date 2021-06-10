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
@Table(name = "employers")
public class Employer extends User{
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "website_adress")
	private String websiteAdress;
	
	@Column(name = "company_mail")
	private String company_mail;
	
	@Column(name = "phone_number")
	private String phoneNumber;
}
