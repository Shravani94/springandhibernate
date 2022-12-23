package com.techouts.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.techouts.UserNotFoundException;
import com.techouts.model.Employee;
import com.techouts.model.Post;
import com.techouts.repository.EmployeeRepository;

@Service
public class EmployeeServices {
	@Autowired
	EmployeeRepository reposioryemp;
	//public List<Post>
}
