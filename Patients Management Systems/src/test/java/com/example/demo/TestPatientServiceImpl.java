package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.model.Patient;

public class TestPatientServiceImpl {

	//parameterized constructor
	Patient p=new Patient(1,"Omkar","Narveer",22,"M","Maleria","omkarnarveer07@gmail.com",702882006);
//	@Test //Postitive TestCase
//	public void testgetPatientFirstName() {
//		assertEquals("Omkar",p.getPatientFirstName());
//	}
	@Test // Negative TestCase
	public void testGetLastName() {
		assertEquals("Omkar",p.getPatientLastName());
		
	}	
	
}
