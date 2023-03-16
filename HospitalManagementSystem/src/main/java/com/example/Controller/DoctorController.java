package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mode.Doctor;
import com.example.Repository.DoctorRepository;


//Controller Class
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {
	@Autowired
	DoctorRepository doctorRepository;

	// Create Method
	/*@PostMapping("/Doctor")
	public ResponseEntity<Doctor> craeteDoctor(@Valid @RequestBody Doctor doctor) {
		return new ResponseEntity<Doctor>(doctorservices.createDoctor(doctor), HttpStatus.CREATED);
	}*/
	
	@PostMapping("/doctor")
	void addUser(@RequestBody Doctor doctor) {
		doctorRepository.save(doctor);
	}

	// Get Doctor Method
	@GetMapping(value = "/doctor")
	public List<Doctor> findAllStudent()
	{
		return (List<Doctor>)doctorRepository.findAll();
	}

	// Delete By Id
	@DeleteMapping(value = "/doctor/{id}")
	public String deleteDoctor(@PathVariable int id) {
		doctorRepository.deleteById(id);
		return "Doctor is deleted";
	}

	// Update By Id
	@PutMapping(value = "/doctor/{id}")
	public Doctor updateDoctor(@PathVariable int id,@RequestBody Doctor doctor) {
		Doctor _doctor=doctorRepository.findById(doctor.getId()).get();
		_doctor.setName(doctor.getName());
		_doctor.setAddress(doctor.getAddress());
		_doctor.setSpecification(doctor.getSpecification());
		_doctor.setFees(doctor.getFees());
		return doctorRepository.save(_doctor);
	}
}