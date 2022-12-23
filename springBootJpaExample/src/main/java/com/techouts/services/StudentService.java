package com.techouts.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techouts.model.Student;
import com.techouts.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired(required=true)
	StudentRepository repository;
	public List<Student> getAllStudents()  
	{    
	List<Student>userRecords = new ArrayList<>();    
	repository.findAll().forEach(userRecords::add);    
	return userRecords;    
	}    
	public void addUser(Student userRecord)  
	{    
repository.save(userRecord);    
	}    
	

}
