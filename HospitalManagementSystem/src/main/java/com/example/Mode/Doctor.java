package com.example.Mode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//Doctor Class
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull(message = "Name is Not Null")
	@NotBlank(message="name is not blank")
	private String Name;
	
	private String Address;
	private String Specification;
	private int Fees;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getSpecification() {
		return Specification;
	}
	public void setSpecification(String specification) {
		Specification = specification;
	}
	public int getFees() {
		return Fees;
	}
	public void setFees(int fees) {
		Fees = fees;
	}
	public Doctor(int id, @NotNull(message = "Name is Not Null") @NotBlank(message = "name is not blank") String name,
			String address, String specification, int fees) {
		this.id = id;
		Name = name;
		Address = address;
		Specification = specification;
		Fees = fees;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
}
	//Default Constructor
	

//https://github.com/khushbuanudip/FullStackjavaangularproject