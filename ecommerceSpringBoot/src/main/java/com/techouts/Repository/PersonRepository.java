package com.techouts.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.techouts.model.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{
	 

	Person findByUserName(String userName);
}
