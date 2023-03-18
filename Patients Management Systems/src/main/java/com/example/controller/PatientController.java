package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.model.Patient;
import com.example.service.PatientService;

@RestController
public class PatientController {
	@Autowired
	   private PatientService patientservice;
	   //saving Patient details using rest api post mapping
	   @PostMapping("/save")
	   public ResponseEntity<Patient> savePatient(@RequestBody Patient patient){
		   return new ResponseEntity<Patient>(patientservice.savePatient(patient),HttpStatus.CREATED);  
	}
	   // get Patient details using rest api get Mapping
	   @GetMapping("/getpatient")
	   public List<Patient> getAllPatient(){
		   return patientservice.getAllPatient();
	   }
	   
	   // get Patient details from table using rest api GET mapping with id attribute
	   @GetMapping("/getpatientbyid/{id}")
	   public ResponseEntity<Patient> getPatientById(@PathVariable("id")int id){
		   return new ResponseEntity<Patient>(patientservice.getPatientById(id),HttpStatus.OK);
		  
	   }
	   
	   //updating Patient details from table using rest api PUT mapping with id attribute
	   @PutMapping("/updatepatientbyid/{id}")
	   public ResponseEntity<Patient> updatePatientById(@PathVariable("id") int id, @RequestBody Patient patient){
		   return new ResponseEntity<Patient> (patientservice.updatePatientById(patient,id),HttpStatus.OK);
	   }
	
	   //delete Patient details from table using rest api delete mapping patient using id attribute
	   @DeleteMapping("/deletepatient/{id}")
	   public ResponseEntity<String> deletePatientById(@PathVariable("id") int id){
		   patientservice.deletePatientById(id);
		   return new ResponseEntity<String>("Patient deleted Successfully",HttpStatus.OK);
	   }
}
