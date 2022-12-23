
package com.techouts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techouts.model.Student;
import com.techouts.services.StudentService;

@RestController
public class StudentController {
	 
	@Autowired    
	private StudentService userService;     
	@RequestMapping("/")    
	public List<Student> getAllUser()  
	{    
	return userService.getAllStudents();    
	}       
	@RequestMapping(value="/add-user", method=RequestMethod.POST)    
	public void addUser(@RequestBody Student userRecord)  
	{    
	userService.addUser(userRecord);    
	}       
	}  


