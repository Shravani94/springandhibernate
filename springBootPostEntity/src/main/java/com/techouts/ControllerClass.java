package com.techouts;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.techouts.model.Employee;
import com.techouts.model.Post;
import com.techouts.repository.EmployeeRepository;
import com.techouts.services.EmployeeServices;

@RestController
public class ControllerClass {
	@Autowired
	EmployeeServices services;
	@Autowired
	EmployeeRepository repository;
	@GetMapping("/jpa/users/{id}/posts")  
	public List<Post> retriveAllUsers(@PathVariable int id)  
	{  
	Optional<Employee> userOptional= repository.findById(id);  
	if(!userOptional.isPresent())  
	{  
	throw new UserNotFoundException("id: "+ id);  
	}  
	return userOptional.get().getPosts();  
	}  
	

}
