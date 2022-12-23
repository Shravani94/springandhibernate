package com.techouts.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.techouts.Repository.PersonRepository;
import com.techouts.model.Person;

@Service
public class PersonService {
	@Autowired
	PersonRepository personRepository;
	

}

