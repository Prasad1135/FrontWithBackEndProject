package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="patientdetails")
public class Patient {
	

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int patientId, @NotBlank(message = "Enter Patient First Name!!!") String patientFirstName,
			@NotBlank(message = "Enter Patient Last Name!!!") String patientLastName,
			@NotBlank(message = "Enter Patient Age!!!") int patientAge,
			@NotBlank(message = "Enter Patient Gender!!!") String patientGender,
			@NotBlank(message = "Enter Patient Disease!!!") String patientDisease,
			@NotBlank(message = "Enter Patient Email!!!") @Email String patientEmail, long patientContactNumber) {
		super();
		this.patientId = patientId;
		this.patientFirstName = patientFirstName;
		this.patientLastName = patientLastName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.patientDisease = patientDisease;
		this.patientEmail = patientEmail;
		this.patientContactNumber = patientContactNumber;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int patientId;
	
	@Column(length = 3 , nullable = false)
	@NotBlank(message="Enter Patient Age!!!")
	private int patientAge;
	
	@Column(length = 1 , nullable = false)
	@NotBlank(message="Enter Patient Gender!!!")
	private String patientGender;
	
	@Column(length = 30 , nullable = false)
	@NotBlank(message="Enter Patient First Name!!!")
	private String patientFirstName;
	
	@Column(length = 30 , nullable = false)
	@NotBlank(message="Enter Patient Last Name!!!")
	private String patientLastName;
	
	@Column(length = 50 , nullable = false)
	@NotBlank(message="Enter Patient Disease!!!")
	private String patientDisease;
	
	@Column(length = 30 , nullable = false, unique = true)
	@NotBlank(message="Enter Patient Email!!!")
	@Email
	private String patientEmail;

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String isPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public String getPatientDisease() {
		return patientDisease;
	}

	public void setPatientDisease(String patientDisease) {
		this.patientDisease = patientDisease;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public long getPatientContactNumber() {
		return patientContactNumber;
	}

	public void setPatientContactNumber(long patientContactNumber) {
		this.patientContactNumber = patientContactNumber;
	}

	@Column(length = 12 , nullable = false, unique = true)
	private long patientContactNumber;
}
