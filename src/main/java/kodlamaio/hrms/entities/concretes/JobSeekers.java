package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_seekers")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // id'yi otomatik arttırmak için
	@Column(name="seeker_id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="nationality_no")
	private Long nationalityId;
	
	@Column(name="birthday")
	public LocalDate dateOfBirth;

}
