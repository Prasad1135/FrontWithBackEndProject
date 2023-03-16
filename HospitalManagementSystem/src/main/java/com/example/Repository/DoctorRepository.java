package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Mode.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	//Customize Method
	List<Doctor> findByid(int id);
	//List<Doctor> findByName(String Name);
}
