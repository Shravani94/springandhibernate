package com.techouts.service;

import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techouts.model.Students;
import com.techouts.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
//getting all student records  
	public List<Students> getAllStudent() {
		List<Students> students = new ArrayList<Students>();
		studentRepository.findAll().forEach(student -> students.add(student));
		return students;
	}

//getting a specific record  
	public Students getStudentById(int id) {
		return studentRepository.findById(id).get();
	}

	public void saveOrUpdate(Students student) {
		studentRepository.save(student);
	}

//deleting a specific record  
	public void delete(int id) {
		studentRepository.deleteById(id);
	}
}