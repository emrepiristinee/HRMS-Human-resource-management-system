package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "job_title")
public class JobTitle {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "job_title")
	private String jobTitle;

	public JobTitle() {

	}

	public JobTitle(int id, String jobTitle) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
}
