package com.example.service;

import java.util.List;

import com.example.model.Patient;

//Patient Service Interface
public interface PatientService {

	//inserting Patient details in table
		Patient savePatient(Patient patient);
		
		//fetching all Patient details from table
		List<Patient>getAllPatient();
		
		//fetching Patient details from table
		Patient getPatientById(int patientId);
		
		//modifying Patient details from table based on Patient id
		Patient updatePatientById(Patient patient, int patientId);
		
		//remove Patient details from table based on Patient id
		void deletePatientById(int patientId);
}
