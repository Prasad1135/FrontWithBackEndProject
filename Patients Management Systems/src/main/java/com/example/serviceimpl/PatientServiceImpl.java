package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.PatientNotFoundException;
import com.example.model.Patient;
import com.example.repository.PatientRepository;
import com.example.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	PatientRepository repo;
	
	@Override
	//Saving Patient details by jpa repository save()
	public Patient savePatient(Patient patient) {
		return repo.save(patient) ;
	}

	@Override
	//fetching all Patient details by jpa repository findAll()
	public List<Patient> getAllPatient() {
		return repo.findAll();
	}

	@Override
	//fetching Patient details by jpa repository
	public Patient getPatientById(int id) {
	//find by id , if not present then throw custom exception
		return repo.findById(id).orElseThrow(() -> new PatientNotFoundException("Patient not found in table"));
	}

	@Override
	public Patient updatePatientById(Patient patient, int id) {
		//find by id , if not present then throw custom exception
		Patient exitpatient = repo.findById(id).orElseThrow(() -> new PatientNotFoundException("Patient not found in table"));
		//set new value
		exitpatient.setPatientEmail(patient.getPatientEmail());
		exitpatient.setPatientContactNumber(patient.getPatientContactNumber());
		repo.save(exitpatient);
		return null ;
	}

	@Override
	//fetching Patient details using jpa repository findById and removing it using deleteById
	public void deletePatientById(int id) {
	
		repo.findById(id).orElseThrow(() -> new PatientNotFoundException("Patient not found in table"));
		repo.deleteById(id);
		
	}
}
